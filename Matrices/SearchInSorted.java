public class SearchInSorted {public static void main(String args[]){
    int key=33;
    boolean res=search_sorted(new int[][]{{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}},key);
    System.out.print(res);
    
}

public static boolean search_sorted(int arr[][],int key){
    int row=0,col=arr[0].length-1;

    while(row<arr.length && col>=0){
        if(arr[row][col]==key){
            System.out.println("found key at ("+row+","+col+")");
            return true;
        }
        else if(key<arr[row][col]){
            col--;
        }
        else{
            row++;
        }
    }

    System.out.println("key not found");
    return false;

}
}
