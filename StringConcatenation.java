// "static void main" must be defined in a public class.
public class Main {
    public static String concat(String str1,String str2){
        return str1+" "+str2;
    }
    public static void main(String[] args) {
        String str1="Jitendra";
        String str2="Sahoo";
        System.out.println(concat(str1,str2));
    }
}