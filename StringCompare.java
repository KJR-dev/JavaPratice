public class StringCompare{
    public static void stringCompair(String str1,String str2, String str3){
        if(str1==str2){
            System.out.println("str1 and str2 both are same for ==");
        }
        if(str1==str3){
            System.out.println("str1 and str3 both are same for ==");
        }
        if(str2==str3){
            System.out.println("str2 and str3 both are same for ==");
        }
        if(str1.equals(str2)){
            System.out.println("str1 and str2 both are same for equalTo()");
        }
        if(str1.equals(str3)){
            System.out.println("str1 and str3 both are same for equalTo()");
        }
        if(str2.equals(str3)){
            System.out.println("str2 and str3 both are same for equalTo()");
        }   
    }
    public static void main(String[] args){
        String str1="Jitendra";
        String str2="Jitendra";
        String str3=new String("Jitendra");
        stringCompair(str1,str2,str3);
    }
}