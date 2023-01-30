// import java.util.Scanner;

 public class prime {
    public static boolean isPrime(int n){
boolean isPrime=true;
if(n==2)
return isPrime;

//to optimize the code at the place of n-1 we can use Math.sqrt(n)
for(int i=2;i<=n-1;i++){
    if(n%i==0){//completing dividing
        isPrime=false;
    }
}
return isPrime;
    }

    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){//true
            System.out.println(i+" ");
        }  
    }
}
    public static void main(String args[]){
        primesInRange(20);//2 to 20
    }
    
}

