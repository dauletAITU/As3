package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0);
        Rectangle rec1 = new Rectangle(1, 1);
        Square sqar = new Square(1);
        System.out.println(circle1.toString()+ "\n" + circle1.getArea() + "\n" + circle1.getPerimeter());
        System.out.println(rec1.toString()+ "\n" + rec1.getArea() + "\n" + rec1.getPerimeter());
        System.out.println(sqar.toString()+ "\n" + sqar.getArea() + "\n" + sqar.getPerimeter());
        }
    }


