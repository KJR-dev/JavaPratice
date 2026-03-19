// "static void main" must be defined in a public class.
public class Main {
    public static void rotateArray(int arr[], int kth){
        rev(arr,0,kth-1);
        rev(arr,kth,arr.length-1);
        rev(arr,0,arr.length-1);
    }
    public static void rev(int arr[],int si,int ei){
        while(si<ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        rotateArray(arr,2);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+", ");
        }
    }
}