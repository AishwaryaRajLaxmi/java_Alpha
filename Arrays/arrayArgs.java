import java.util.*;
public class arrayArgs {
    public static void update(int marks[]){
            for(int i=0;i<marks.length;i++){
                marks[i]=marks[i]+1;
            }

    }

    public static void linearSearch(int arr[]){
        int key=98;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
            System.out.println("index number: "+ i);
            return;
            }
            else{
                System.out.println("-1");
                return;
            }
        }
    }

    public static void reverse(){
        int n=5;
        int num[]={1,2,3,4,5};
       
            int low=0;
            int high=num.length-1;

            while(low<high){
                int temp=num[high];
                num[high]=num[low];
                num[low]=temp;

                low++;
                high--;
            }
            for(int i=0;i<num.length;i++)
        System.out.print(num[i]+" ");
        
    }

    public static void subArray(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println("Total subarray:"+ts);
        }

    }
        public static void MaxSubArraySum(int arr[]){
            int curSum=0;
            int maxSum=Integer.MIN_VALUE;

            for(int i=0;i<arr.length;i++){
                int start=i;
                for(int j=i;j<arr.length;j++){
                    int end=j;
                    for(int k=start;k<=end;k++){
                        curSum+=arr[k];
                    }
                    System.out.println(curSum);
                    if(maxSum<curSum){
                        maxSum=curSum;
                    }
                 }
                }
                System.out.println("max sum:"+maxSum);
               
            }
    
public static void prefixSum(int arr[]){

    int curSum=0;
    int maxSum=Integer.MIN_VALUE;
    int prefix[]=new int[arr.length];

    //calculate prefix array
    for(int i=0;i<prefix.length;i++){
        prefix[i]=prefix[i-1]+arr[i];
    }
    

    for(int i=0;i<arr.length;i++){
        int start=i;
        for(int j=i;j<arr.length;j++){
            int end=j;
          curSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
          
           
            if(maxSum<curSum){
                maxSum=curSum;
            }
         }
        }
        System.out.println("max sum:"+maxSum);
       

}
    
    public static int getLargest(){
        int num[]={1,3,45,6,6};
        int max=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        return max;

    }


    public static void main(String args[]){
        int marks[]={97,98,99};
        update(marks);

        //print our marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        linearSearch(marks);
       int res= getLargest();
       System.out.println(res);

System.out.println("Reverse of array");
       reverse();

       int arr[]={2,4,6,8,10};
       subArray(arr);

       System.out.println();
       MaxSubArraySum(arr);
       prefixSum(arr);

    }
    
}
