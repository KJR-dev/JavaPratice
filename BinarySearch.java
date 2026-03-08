public class Main {
    public static int binary(int numbers[], int target){
        int startIndex=0;
        int endIndex=numbers.length-1;
        while(startIndex<=endIndex){
            int midIndex=(startIndex+endIndex)/2;
            if(target==numbers[midIndex]){
                return midIndex;
            }
            if(target<numbers[midIndex]){
                endIndex=--midIndex;
            }else{
                startIndex=++midIndex;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9};
        System.out.println(binary(numbers,6));
    }
}