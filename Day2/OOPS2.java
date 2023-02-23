package Day2;


class Shape{
private int x;
private int y;
public Shape(int x,int y){
    this.x=x;
    this.y=y;
}

}
class Rectangle extends Shape{
private int width;
private int height;
//1st constructor
public Rectangle(int x ,int y){
    this(x,y,0,0); //calls 2nd constructor
    
}
public Rectangle(int x, int y, int width,int height) {
super(x, y);//call constructor from parent (shape)
this.width = width;
this.height=height;

}
}



public class OOPS2 {
    
}
