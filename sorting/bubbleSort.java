public class bubbleSort {
    public static void main(String args[]){
        int arr[]={4,2,1,8,3};
        Bubble.bubble_sort(arr);
        Bubble.printArr(arr);
    }
}

class Bubble{
public static void bubble_sort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }
    
    
    }
}

public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
}
}