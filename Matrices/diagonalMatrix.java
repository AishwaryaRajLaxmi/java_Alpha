public class diagonalMatrix {
    public static void main(String args[]){
     System.out.println(diagonal_matrix(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}));

     System.out.println(diagonal_matrix2(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}));
    }

      public static int diagonal_matrix(int arr[][]){
           int sum=0;
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[0].length;j++){
        if(i==j){
            sum+=arr[i][j];
        }
        else if((i+j)==arr.length-1){
            sum+=arr[i][j];
        }
    }
}

return sum;
      }

      public static int diagonal_matrix2(int arr[][]){
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i!=arr.length-1-i)
            sum+=arr[i][arr.length-i-1];
        }

        return sum;
      }
    
}
