package HinhHoc;

import Resizeable.Resizeable;

public class Square extends Shape12 implements Resizeable {
    private double height;
    private double widght;

    public Square() {
    }

    public Square(double height, double widght) {
        this.height = height;
        this.widght = widght;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidght() {
        return widght;
    }

    public void setWidght(double widght) {
        this.widght = widght;
    }

    public double area(){
        return this.getHeight()*this.getWidght();
    }


    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", widght=" + widght +
                ",area = "+this.area()+
                '}';
    }

    @Override
    public double resize(double percent) {
        this.height = this.height*percent;
        this.widght = this.widght*percent;
        return this.area();
    }
}