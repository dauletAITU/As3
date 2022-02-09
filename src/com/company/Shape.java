package com.company;

public abstract class Shape {
    private String color = "red";
    private boolean filled = true;
    private double radius;
    public Shape() {
    color = "green";
    filled = true;
    radius =1.0;
    }
    public Shape(String color, boolean filled, double radius){
    setColor(color);
    setFilled(filled);
    setRadius(radius);
    }

    public Shape(double radius) {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "Shape with the color of " + color  + " is filled: " + filled;
    }
}
