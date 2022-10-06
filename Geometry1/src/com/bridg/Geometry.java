package com.bridg;

public class Geometry {
    public static void main(String[] args) {
        System.out.println("Calculate the Length");
        int neg =(int)Math.floor(Math.random() * 2);
        int x1 = (int)Math.floor(Math.random() * 10);

        if (neg == 1) {
            x1 *= -1;
        }

        neg = (int)Math.floor(Math.random() * 2);
        int y1 =(int)Math.floor(Math.random() * 10);
        if (neg == 1) {
            y1 *= -1;
        }

        neg =(int) Math.floor(Math.random() * 2);
        int x2 =(int)Math.floor(Math.random() * 10);
        if (neg == 1) {
            x2 *= -1;
        }

        neg =(int) Math.floor(Math.random() * 2);
        int y2 = (int)Math.floor(Math.random() * 10);
        if (neg == 1) {
            y2 *= -1;
        }

        int length = (int)Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println(" The first point is : (" + x1 + ", " + y1 + ")");
        System.out.println(" The Second point is : (" + x2 + ", " + y2 + ")");
        System.out.println(" The length of the line is : " + length);

    }
}

