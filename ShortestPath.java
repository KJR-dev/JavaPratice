public class  ShortestPath{
    public static float shortestPath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.chatAt(i);
            if(dir=='N'){
                y++;
            }else if(dir=='E'){
                x++;
            }else if(dir=='S'){
                y--;
            }else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(){
        String str="WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}