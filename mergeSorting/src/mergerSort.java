public class mergerSort {
    public static void main(String[] args) {
        int[] arr = {10,20,30,60,50,70,5};




    }

    public static void mergeS(int arr[], int l, int r) {
        int s = l;
        int e = r;
        if (s >= e) {
            return;
        }
        int mid = (s + e) / 2;
        mergeS(arr, s, mid);
        mergeS(arr, mid + 1, e);
        merge(arr, s, e, mid);
    }

    public static void merge(int[] arr, int s, int e, int mid) {
        int leftArrlen = mid - s + 1;
        int rightArrlen = e - mid;

        int[] leftArr = new int[leftArrlen];
        int[] rightArr = new int[rightArrlen];

        int k = s;
        for (int i = 0; i < leftArrlen; i++) {
            leftArr[i] = arr[k];
            k++;
        }

        k = mid + 1;
        for (int i = 0; i < rightArrlen; i++) {
            rightArr[i] = arr[k];
            k++;
        }

        int i = 0;
        int j = 0;
         k = s;
        while (i < leftArrlen && j < rightArrlen) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                k++;
                i++;
            } else {
                arr[k] = rightArr[j];
                k++;
                j++;
            }
        }
        while (j < rightArrlen) {
            arr[k] = rightArr[j];
            k++;
            j++;
        }
        while (i < leftArrlen) {
            arr[k] = leftArr[i];
            k++;
            i++;
        }

    }
}
