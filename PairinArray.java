public class Main {
    public static void pair(int numbers[]){
        for(int i=0; i<numbers.length;i++){
            for(int j=i+1; j<numbers.length;j++){
                System.out.print(numbers[i]+""+numbers[j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={1, 2, 3, 4, 5, 6, 7};
        pair(numbers);
    }
}

// 1, 2, 3, 4, 5, 6, 7

// 12 13 14 15 16 17
// 23 24 25 26 27
// 34 35 36 37
// 45 46 47
// 56 57
// 67