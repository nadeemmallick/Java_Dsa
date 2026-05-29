public class zakArray {
            static void main(){

            int [][] brr = {
                    {1,2,3},
                    {3,4,5,6,7,8},
                    {5,6,6,8,6},
                    {7,8}
            };
            int rowLength = brr.length;
//            int colLength = brr[0].length;
//        System.out.println(brr[2][1]);

            for(int rowIndex = 0; rowIndex <=rowLength -1; rowIndex++){
                int colLength = brr[rowIndex].length;
                for(int colIndex = 0; colIndex<= colLength-1; colIndex++){
                    System.out.print(brr[rowIndex][colIndex] + " ");
                }
                System.out.println();
            }


        }
    }


