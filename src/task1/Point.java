package task1;

public class Point {

    int dis;
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int distance (){
        return distance(0,0,x,y);
    }
    public int distance(Point secondpoint){
        return distance(x,y,secondpoint.x,secondpoint.y);
    }


    private int distance(int x1,int y1,int x2,int y2){
        return (int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
}
