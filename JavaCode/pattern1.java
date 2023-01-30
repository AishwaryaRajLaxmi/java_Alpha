public class pattern1{
 public static void main(String[] args) {
    int n=4;
    for(int line=0;line<n;line++){
        for(int star=0;star<n-line;star++){
            System.out.print("*");
        }
        System.out.println();
    }
 }
}