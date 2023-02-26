public class bit {
    public static void main(String args[]){
        /*5=101
          6=110
          5&6=100=4
        */

        System.out.println(5&6);
        System.out.println(5|6);
        System.out.println(5^6);
        System.out.println(~5);
        System.out.println(5<<2);
        System.out.println(5>>1);

        oddOrEven(0);
    }

    public static void oddOrEven(int n){
      int bitMask=1;
      if((n & bitMask)==0)
        System.out.println("even number");
        else
        System.out.println("odd number");
        
    }

}
