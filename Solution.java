public class StringCompress{
    public static String stringCompress(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=1;
            while (i < str.length() - 1 && ch == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(ch);
            sb.append(count);
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String str="aaabbcccdd";
        System.out.println(stringCompress(str));
    }
}