package day39_Recap.shapeTask;

public class Square extends Shape {

    private double side;
    public Square(String name) {
        super(name);
    }

    public double getSide() {
        return side;
    }

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public void setSide(double side) {
        if(side<=0){
            System.err.println("Invalid Side");
            System.exit(1);
        }
        this.side = side;
    }
}


/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */