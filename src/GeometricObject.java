public  abstract class GeometricObject {

    //fields
    protected boolean filled;
    protected String color;

    //constructors
    public GeometricObject(){
        filled=true;
        color="Red";

    }

    public GeometricObject(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    //Getter setter methods
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public  boolean isFilled(){
        return filled;
    }

    public void  setFilled(boolean filled){
        this.filled=filled;
    }

    //Abstract methods
    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract String getShape();

    //Overriding

    @Override
    public String toString(){
        return "Color: "+getColor()+"\n Filled: "+isFilled();
    }


}
