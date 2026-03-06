public class Main {
    public static int lengthCal(String str){
        return str.length();
    }
    public static void main(String[] args) {
        String str=new String("Hello World");
        System.out.println("String length is:- " + lengthCal(str));
    }
}