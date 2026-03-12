// "static void main" must be defined in a public class.
public class Main {
    public static int fact(int num){
        int total=1;
        if(num==1){
            return 1;
        }
        total=num*fact(num--);
        System.out.println(total);
        return total;
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println(fact(5));
    }
}