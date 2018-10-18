package com.example.task04;
/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(){    }

    Point(int X, int Y){
        this.x = X;
        this.y = Y;
    }

    void flip(){
        int tmp = this.x;
        this.x = this.y - 2 * this.y;
        this.y = tmp - 2*tmp;
    }

    double distance(Point point){
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public String toString(){
        return "(" + String.valueOf(this.x) + ", " + String.valueOf(this.y) + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }


}
