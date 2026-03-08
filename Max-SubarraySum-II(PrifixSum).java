// "static void main" must be defined in a public class.
public class Main {
    public static void subArray(int numbers[]){
        int preArray[]=new Array(numbers.length);
        preArray[0]=numbers[0];
        for(int i=1;i<numbers.length;i++){
            preArray[i]=preArray[i-1]+preArray[i];
        }
        
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.lenght;j++){
                currSum=i==0?numbers[j]:numbers[j]-numbers[i-1];
            }
        }
    }
    
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        
    }
}

// 1 -2 6 -1 3
// 1 -1 5  4 7