import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection{

    //fields
    protected GeometricObject[] shapes;
    protected int capacity;
    public static int counter=0;

    //Constructor
    public GeometricShapeCollection(int capacity){
        this.capacity=capacity;
        shapes=new GeometricObject[capacity];
        //creates empty array of type geometricObject

    }

    @Override
    public void addShape(GeometricObject shape){
        if(counter<capacity){
            shapes[counter]=shape;
            counter++;

        }
        else System.out.println("no capacity");
    }

    @Override
    public void printShapeList() {
        for(int i=0;i<counter;i++){
            System.out.println("Shape: "+shapes[i].getShape()+
                    ",\nArea: "+shapes[i].getArea()+
                    ",\nPerimeter: "+shapes[i].getPerimeter()+
                    "\n,Color: "+shapes[i].color+"\n Filled Status: "+shapes[i].filled
            );
        }

    }

    @Override
    public boolean runMenu() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Shape Management System: ");
        System.out.println("1.addShape");
        System.out.println("2.PrintShape");
        System.out.println("3.Exit.");
        System.out.println("Please choose your options.");

        int choice=sc.nextInt();
        switch (choice){
            case 1:addShapeMenu();
                  break;
            case 2:printShapeList();
                   break;
            case 3:return  true;
            default:
                System.out.println("Invalid option. Try again.");



        }


        return false;
    }

    public void addShapeMenu(){
        Scanner scan=new Scanner(System.in);

        if(counter<capacity){
            System.out.println("Please choose an option.");
            System.out.println("1.Circle");
            System.out.println("2.Square");
            System.out.println("3.Rectangle");

            int shapeChoice=scan.nextInt();
            scan.nextLine();//to consume newline entered by user

            System.out.println("Please enter the color: ");
            String color=scan.nextLine();
            System.out.println("Please enter filled status");
            boolean filled=scan.nextBoolean();

            switch (shapeChoice){
                case 1://Circle
                    System.out.println("Please enter the radius");
                    double radius=scan.nextDouble();
                    addShape(new Circle(radius,color,filled));
                    break;
                case 2://square
                    System.out.println("Please enter the side");
                    double side=scan.nextDouble();
                    addShape(new Square(side,color,filled));
                    break;
                case 3://Rectangle
                    System.out.println("Enter the length and breadth: ");
                    double length= scan.nextDouble();
                    double width=scan.nextDouble();
                    addShape(new Rectangle(length,width,color,filled));
                    break;
                default:
                    System.out.println("Invalid shape type.");

            }



        }else
            System.out.println("is Full");
    }

    public static void main(String[] args) {

        boolean exit =false;
        ShapeCollection sys=new GeometricShapeCollection(3);
        while (!exit){
            exit= sys.runMenu();
        }
    }
}
