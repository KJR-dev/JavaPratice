import java.util.*;
public class Main {
    public static int trapRainWater(int numbers[]){
        int leftMaxBoundary[]=new int[numbers.length];
        leftMaxBoundary[0]=numbers[0];
        for(int i=1;i<leftMaxBoundary.length;i++){
            leftMaxBoundary[i]=Math.max(leftMaxBoundary[i-1],numbers[i]);
        }
        
        int rightMaxBoundary[]=new int[numbers.length];
        rightMaxBoundary[rightMaxBoundary.length-1]=numbers[numbers.length-1];
        for(int i=rightMaxBoundary.length-2;i>=0;i--){
            rightMaxBoundary[i]=Math.max(rightMaxBoundary[i+1],numbers[i]);
        }

        int trappedWater=0;
        for(int i=1;i<numbers.length-1;i++){
            int minHeight=Math.min(leftMaxBoundary[i],rightMaxBoundary[i]);
            trappedWater+=minHeight-numbers[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int numbers[]={4,2,0,6,3,2,5};
        System.out.println(trapRainWater(numbers));
    }
}

// 4 2 0 6 3 2 5
// 