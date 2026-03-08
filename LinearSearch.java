public class Main {
    public static int linear(int numbers[],int target){
        for(int i=0;i<numbers.length;i++){
            if(target==numbers[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(linear(numbers,5));
    }
}