public class  ShortestPath{
    public static int  shortestPath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.chatAt(i)=='N'){
                y++;
            }else if(str.chatAt(i)=='E'){
                x++;
            }else if(str.chatAt(i)=='S'){
                y--;
            }else{
                x--;
            }
        }
    }
}