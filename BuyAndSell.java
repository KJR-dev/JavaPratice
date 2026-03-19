// "static void main" must be defined in a public class.
public class Main {
    public static int buySell(int arr[]){
        int buy=arr[0];
        int maxProfit=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            int currProfit=arr[i]-buy;
            maxProfit=Math.max(maxProfit,currProfit);
            buy=Math.min(buy,arr[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,6,2,8,1};
        System.out.println(buySell(arr));
    }
}