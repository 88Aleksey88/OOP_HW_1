package org.example;

public class Rectangle {
    private Double width;
    private Double height;

    public void setWidth (Double width){
        this.width = width;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    public Double getWidth() {
        return width;
    }
    public Double getHeight(){
        return height;
    }
    public Rectangle(){
        this.width = 4.0;
        this.height = 2.0;
    }
    public Rectangle(Double width, Double height){
        this.width = width;
        this.height = height;
    }
    public double calculateArea (){
        return width*height;
    }
    public double calculatePerimeter(){
        return 2*(width+height);
    }
}
