public class Rectangle extends GeometricObject {
    //fields
    protected double length;
    protected  double width;

    public Rectangle(){
        length=2;
        width=2;
    }
    public Rectangle(double l,double w){
        length=l;
        width=w;


    }
    public Rectangle(double l,double w,String color,boolean filled){
        this.color=color;
        this.filled=filled;
        length=l;
        width=w;
    }

    //getter setter methods

    public double getLength(){
        return length;
    }

    public void setLength(double l){
        length=l;
    }

    public double getWidth(){
        return  width;
    }

    public void setWidth(double w){
        width=w;
    }

    //Overriding methods


    @Override
    public String getShape() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Area: "+getArea()+"Perimeter: "+getPerimeter()+"Shape: "+getShape();
    }


}

