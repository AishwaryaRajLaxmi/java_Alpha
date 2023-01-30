public class kadanes {
    public static void main(String args[]){
        int arr[]={1,2,-2,-3,4,5};
kadanes_algo(arr);
    }

    public static void kadanes_algo(int arr[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            if(curSum<0){
                curSum=0;
            }
            maxSum=Math.max(curSum,maxSum);
        }
            System.out.println("max sum:"+maxSum);
           
        }
    }