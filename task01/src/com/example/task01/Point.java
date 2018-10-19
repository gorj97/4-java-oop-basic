package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    public int x;
    public int y;

    public Point(){    }

    public Point(int X, int Y){
        this.x = X;
        this.y = Y;
    }

    public void flip(){
        int tmp = -this.x;
        this.x = -this.y;
        this.y = tmp;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }

    public void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }


}
