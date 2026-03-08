// "static void main" must be defined in a public class.
public class Main {
    public static void subArray(int numbers[]){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            if(sum<0){
                sum=0;
            }
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        subArray(numbers);
    }
}

// 1 -2 6 -1 3
// 1 0 6 5 8