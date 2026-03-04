public class main{
    public static boolean isPalindrome(String str){
        for(int i=0;i<(str.length()/2);i++){
            if(str.charAt(i)!= str.length()-1-i){
                return false;
            }
        }
    return true;
    }
    public static void main(){
        String str="Jitendra";
        if(isPalindrome(str)==true){
            System.out.println("Word is palindrome");
        }else{
            System.out.println("Word is not palindrome");
        }
    }
}