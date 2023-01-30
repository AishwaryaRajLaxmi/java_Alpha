import java.util.*;
public class assingnment {
    public static void main(String args[]){
        int arr[]={1,3,4,4,5,2};
       boolean ans= checkArr(arr);
       System.out.println(ans);
       contaninsDuplicate(arr);
    }

    public static boolean checkArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //using hashset
    public static boolean contaninsDuplicate(int arr[]){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]))
            return true; 
            else
            set.add(arr[i]);
        }
        return false;

    }
    
}
