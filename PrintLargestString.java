public class LargestString{
    public static String compare(String[] fruits){
        String largestTemp=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largestTemp.compareTo(fruits[i])<0){
                largestTemp= fruits[i];
            }else if(largestTemp.compareTo(fruits[i])>0){
                largestTemp= fruits[i];
            }
        }
        return largestTemp;
    }

    public static void main(){
        String fruits[]={"apple","mango","banana"};
        
        System.out.println(compare(fruits));
    }
}