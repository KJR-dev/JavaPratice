public class Selection{
    public static void selectionSort(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int minPos=-1;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    minPos=j;
                }
            }
            if(minPos>0){
                int temp=numbers[i];
                numbers[i]=numbers[minPos];
                numbers[minPos]=temp;
            }
        }
    }
    public static void main(String[] args){
        int numbers[]={3,2,5,3,6,8,9};
        selectionSort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
    }
}
