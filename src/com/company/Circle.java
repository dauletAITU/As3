package com.company;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        setRadius(radius);
    }
    public Circle(double radius, String color, boolean filled){
        setColor(color);
        setFilled(filled);
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getArea(){
        return "Area of the circle is: " + Math.PI*Math.pow(getRadius(), 2);
    }
    public String getPerimeter(){
        return "Perimeter of the circle: " + 2*Math.PI*getRadius();
    }
    @Override
    public String toString() {
        if(isFilled()==true){
            return "A Circle with radius = "+ getRadius()+" , which is a subclass of "  + super.toString();
        }
        else return "A Circle with radius = "+ getRadius()+" , which is a subclass of " + super.toString();
    }
}
