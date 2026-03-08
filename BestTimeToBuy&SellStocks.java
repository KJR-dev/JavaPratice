import java.util.*;
public class Main {
    public static int buySell(int numbers[]){
        int maxProfit=Integer.MIN_VALUE;
        int buy=numbers[0];
        for(int i=1;i<numbers.length;i++){
            int currProfit=0;
            if(buy>numbers[i]){
                buy=numbers[i];
            }else{
                currProfit=numbers[i]-buy;
                maxProfit=Math.max(currProfit,maxProfit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int numbers[]={7,1,5,3,6,4};
        System.out.println(buySell(numbers));
    }
}

// 7 1 5 3 6 4
// 