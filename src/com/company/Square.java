package com.company;

public class Square extends Rectangle{
    private double side;
    public Square(double side){
    setSide(side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        setSide(side);
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getArea(){
        return "Area of the Square is " + side*side;
    }
    public String getPerimeter(){
        return "Perimeter of the Square is " + side*4;
    }
    @Override
    public String toString() {
        return "A Square with side = " + side + " which is the subclass of " + super.toString();
    }
}
