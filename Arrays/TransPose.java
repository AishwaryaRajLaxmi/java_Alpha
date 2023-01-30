public class TransPose {
    
        public static void main(String args[]){
           printNums(new int[][]{{4,7,8},{8,8,7}});
           
        }

        public static void printMatrix(int matrix[][]){
           for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] +" ");
               }
               System.out.println();}
        }
       
        public static void printNums(int arr[][]){
            int row=2;
            int col=3;
            int transpose[][]=new int[col][row];
        
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
              transpose[j][i]=arr[i][j];
            }
   
         }
        printMatrix(transpose);
        }
   }
   

