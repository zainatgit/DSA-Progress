package programming.arrays;

//This is my solution
public class BestTimeToBuyStock2 {
    public static void main(String[] args) {
        int prices[] = new int[]{7,6,4,3,1};
        int total = 0;
        int max = 0;
        int day = 0;
        int buy_idx = 0;
        boolean holding = false;
        while(day < prices.length-1){

            //Buy
            for(int i=day;i<prices.length-1;i++){
                if(prices[i+1] > prices[i]){
                    buy_idx = i;
                    holding = true;
                    break;
                }
            }
            max = 0;

            //Sell
            if(holding){
                for(int i=buy_idx+1; i<prices.length;i++){
                    day = i;
                    if(prices[i] - prices[buy_idx] > max){
                        max = prices[i] - prices[buy_idx];
                    }else{
                        holding = false;
                        break;
                    }
                }
            }else{
                total+=max;
                break;
            }
            total+=max;
        }
        System.out.println(total);
    }

}
