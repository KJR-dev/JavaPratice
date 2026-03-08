public class Bubble{
    public static void bubbleSort(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i;i<numbers.length-i;j++){
                if(numbers[i]>numbers[j]){
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int numbers[]={3,2,5,3,6,8,9};
        bubbleSort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
    }
}

// 3 -> 