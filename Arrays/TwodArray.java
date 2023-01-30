public class TwodArray {
     public static void main(String args[]){
        printNums(new int[][]{{4,7,8},{8,8,7}});
     }
    
     public static void printNums(int arr[][]){
      int count=0;
      for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==7){
               count++;
            }
         }

      }
      System.out.println(count);
     }
}
