import java.util.*;

public class Swap {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }
    public static void main(String args[]) {
        ArrayList<Integer>list =new ArrayList<>();
       
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(0);

        int idx1=1,idx2=3;
       System.out.println("list");
       swap(list,idx1,idx2);
       System.out.println(list);
    }
    
}