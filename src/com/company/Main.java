package com.company;

import HinhHoc.Circle;
import HinhHoc.Shape12;
import HinhHoc.Square;
import HinhHoc.Triangle;
import Resizeable.Resizeable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape12[] s = new Shape12[3];
        s[0]= new Circle(20);
        s[1]=new Triangle(3,4,5);
        s[2]=new Square(4,3);
        System.out.println("DIỆN TÍCH LÚC CHƯA THAY ĐỔI");
        for (Shape12 shape12: s) {
            System.out.println(shape12);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập % =");
        double a = scanner.nextDouble();
        for (Shape12 shape12: s) {
            ((Resizeable)shape12).resize(a);
            System.out.println(shape12);
        }
    }
}
