package com.codegym;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

        rectangle.resize(100);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        rectangle.howToColor();
    }
}