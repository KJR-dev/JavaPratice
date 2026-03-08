public class Main {
    public static void maxSubArrayBruteForce(int numbers[]){
        int maxSum=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=numbers[k];
                }
                maxSum=Math.max(maxSum,sum);
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSubArrayBruteForce(numbers);
    }
}