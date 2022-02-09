package com.company;

public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(){

    }
    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }
    public Rectangle(double width, double length, String color, boolean filled){
        setColor(color);
        setFilled(filled);
        setWidth(width);
        setLength(length);
    }


    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public String getArea(){
        return "Area of the rectangle is " + getLength()*getWidth();
    }
    public String getPerimeter(){
        return "Perimeter of the rectangle is: " + 2*(getLength()+getWidth());
    }
    @Override
    public String toString() {
            return "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
    }
}
