public class BuySellStock {
    public static void main(String args[]){
       int res= buy_sell_stocks(new int[]{7,1,5,3,6,4});
       System.out.print(res);
    }

    public static int buy_sell_stocks(int price[]){
        int buy=price[0];
        int maxProfit=0;
        int ans=-1;
        for(int i=1;i<price.length;i++){
            //checking for lower buy value
            if(buy>price[i]){
                buy=price[i];
                ans=0;
                
            }
            else if(price[i]-buy>maxProfit){
            maxProfit=price[i]-buy;
            ans=maxProfit;
           
            }
        }
        return ans;

    
}
}