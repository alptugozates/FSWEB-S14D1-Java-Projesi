package com.workintech.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }


    public void setRadius(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }


}
