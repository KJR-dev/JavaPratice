// "static void main" must be defined in a public class.
public class Main {
    public static void reverse(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int temp=numbers[i];
            numbers[i]=numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=numbers[i];
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        System.out.println(reverse(numbers));
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}