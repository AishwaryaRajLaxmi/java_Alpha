

public class getShortestPath {
    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.println(get_shortst_path(path));
    }

    public static float get_shortst_path(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);

            //south
            if(dir=='S'){
                y--;
            }

            //North
            else if(dir=='N'){
                y++;
            }

            else if(dir=='W'){
                x--;
            }

            else {
                x++;
            }
        }

        int X2=x*x;
        int Y2=y*y;

        return (float)Math.sqrt(X2+Y2);
    }
}
