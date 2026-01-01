public class Circle extends GeometricObject {

    //fields
    protected double radius;

    //Constructor
    public  Circle(){
        radius=1.0;
    }

    public Circle(double r){
        radius=r;
    }

    public Circle(double r,String color,boolean filled){
       this.color=color;
       this.filled=filled;
        radius=r;
    }

    //getter setter methods

    public void  setRadius(double radius){
        this.radius=radius;

    }

    public double getRadius(){
        return  radius;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
       return Math.PI*2*radius;
    }

    @Override
    public String getShape() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "Shape: "+getShape()+" Area: "+getArea()+"Perimeter: "+getPerimeter();
    }
}
