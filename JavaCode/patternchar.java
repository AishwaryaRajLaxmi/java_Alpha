// package JavaCodeAlpha;

public class patternchar {
    public static void main(String[] args) {
        int n=8;
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
     } 
}
