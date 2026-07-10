class modeOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,3,4,5,5,3,2,3,2};
        System.out.println(mode(arr));

    }
    public static int mode(int[] arr){
        int mode = arr[0];
        int maxfreq = 0;

        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxfreq){
                maxfreq = count;
                mode = arr[i];
            }
        }
        return mode;
    }
}
