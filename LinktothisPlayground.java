public class Main {
    public static int[] twoSum(int arr[], int target){
        Map <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int findNum=target-arr[i];
            if(map.containsKey(findNum)){
                return new int[]{map.get(findNum),i};
            }
            map.put(findNum,i);
        }
        return null;
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,3,6,4,7,8,12};
        int target=7;
        int result[]=twoSum(arr,target);
        System.out.println(result[0]+","+result[1]);
    }
}