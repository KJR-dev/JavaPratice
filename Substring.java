public class Substring{
    public static String subString(String str,int fromIndex,int toIndex){
        return str.substring(0,5);
    }
    public static void main(){
        String str="Jitendra Sahoo";
        System.out.println(subString(str,4,8));
    }
}