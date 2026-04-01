// "static void main" must be defined in a public class.
public class Main {
    public static int[][] merge(int arr[][]){
	int n=arr.length;
Arrays.sort(arr, (a, b) -> a[0] - b[0]);
	int start=arr[0][0];
	Int end=arr[0][1];
	List<int[]> list =new ArrayList<>();
for(int i=0; i<n; i++){
	int start=arr[i][0];
	int end=arr[i][1];
	if(s<=end){
		end=e;
	}else{
		list.add(new int[]{start,end});
		start=s;
		end=e;
	}	
}
list.add(new int[]{start,end});
return list.toArray(new int[list.size()][]);
}
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}