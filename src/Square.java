public class Square  extends GeometricObject {

    //fields
    protected double side;
    //Constructors
    public Square(){
        side=1;
    }

    public Square(double s){
        this.side=s;
    }

    public Square(double s,String color,boolean filled){
        side=s;
        this.color=color;
        this.filled=filled;
    }

    //getter setter methods
    public double getSide(){
        return side;
    }
    public void setSide(double s){
        side=s;
    }

    //methods


    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String getShape() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Shape: "+getShape()+"Area: "+getArea()+"Perimeter: "+getPerimeter();
    }
}
