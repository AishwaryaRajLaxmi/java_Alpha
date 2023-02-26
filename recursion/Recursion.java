public class Recursion {
    public static void main(String args[]){
        int arr[]={8,3,1,3,4};
        System.out.println(isSorted(arr));
        int n=5;
       System.out.println(fact(n));
       System.out.println(fib(9));
    }

       public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    

 public static int fact(int n){
    if(n==0){
        return 1;
    }
    int fn=n*fact(n-1);
    return fn;
 }

 public static int fib(int n){
    if(n==0 || n==1){
        return n;
    }
    int fnm1=fib(n-1);
    int fnm2=fib(n-2);
    int fn=fnm1+fnm2;
    return fn;
 }
}
