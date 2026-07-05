package BinarySearch;

public class EKO_Spoj {
    public static void main(String[] args) {
        int [] arr = {20,15,10,17};
        int m = 7;
        System.out.println(new EKO_Spoj().max_sawHeight(arr,m));
    }

    public int max_sawHeight(int[] arr, int m) {
        int n = arr.length;
        int start = 0; //(start he -> 0)
        int max_tree_height = -1;//(maxTreeHeight we find out which tree height is greater in all trees so we can take it as the end)

        for (int j : arr) { // here we find out the max tree height
            if (j > max_tree_height) {
                max_tree_height = j;
            }
        }

        int end = max_tree_height;  // take the max tree
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isValidHight(arr, m, mid)) { //if mid is valid to cut the tree we store the answer and move to right side
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public boolean isValidHight(int[] arr, int m, int maxTreeHeight) { //(mid he -> maxTreeHeight)
        int woodCollected = 0; // here me count the wood collected

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxTreeHeight) { // here if the tree height of arr[i] is greater than the maxtreeheight(which is mid)

                int currentWoodCollected = arr[i] - maxTreeHeight; //then we collect the wood by substracting the tree[i] from maxTreeHeight
                woodCollected = woodCollected + currentWoodCollected;
            }
        }

        if (woodCollected >= m) { //if the wood is greater than or equal to m then we return true
            return true;
        } else {
            return false;
        }
    }
}
