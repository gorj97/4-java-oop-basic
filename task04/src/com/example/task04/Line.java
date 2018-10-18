package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

    Line(Point tmpPoint1, Point tmpPoint2){
        this.p1 = tmpPoint1;
        this.p2 = tmpPoint2;
    }

    public Point getP1(){
        return this.p1;
    }

    public Point getP2(){
        return this.p2;
    }

    public String toString(){
        return "(" + String.valueOf(this.p1.toString()) + ", " + String.valueOf(this.p2.toString()) + ")";
    }

    public boolean isCollinearLine(Point p){
        //ax + by + c - уравнение прямой
        int a = this.p1.y - this.p2.y;
        int b = this.p2.x - this.p1.x;
        int c = this.p1.x * this.p2.y - this.p2.x * this.p1.y;
        return (a * p.x + b * p.y + c == 0);
    }
}
