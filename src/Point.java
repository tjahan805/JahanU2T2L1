public class Point {
    //instance variables
    private int x;
    private int y;

    //constructor with x and y
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //constructor with input val
    public Point(int num) {
        x = num;
        y = num;
    }

    //constructor no parameter
    public Point() {
        x = 0;
        y = 0;
    }

    //getter method for x
    public int getX() {
        return x;
    }

    //getter method for y
    public int getY(){
        return y;
    }

    //setter method for x
    public void setX(int newX) {
        x = newX;
    }

    //method for coord
    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    //method return quadrant
    public String quadrant() {
        String quadrant;
        if (x>0 && y>0){
            quadrant = "I";
        } else if (x<0 && y>0){
            quadrant = "II";
        } else if (x<0 && y<0) {
            quadrant = "III";
        } else if (x>0 && y<0) {
            quadrant = "IV";
        } else if (x==0 && y==0) {
            quadrant = "origin";
        } else {
            quadrant = "on an axis";
        }
        return quadrant;
    }
}
