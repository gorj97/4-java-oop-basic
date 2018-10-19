package com.example.task05;

import java.util.*;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> arrPoints = new ArrayList<Point>();

    public PolygonalLine(){}

    public void setPoints(Point[] points) {
        this.arrPoints.clear();
        for (Point point : points) {
            this.arrPoints.add(new Point(point.getX(), point.getY()));
        }
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public PolygonalLine(Point[] points) {
        this.setPoints(points);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        this.arrPoints.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        this.arrPoints.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double result = 0;
        Iterator<Point> i = arrPoints.iterator();
        Point point1 = i.next();
        Point point2;
        while (i.hasNext()) {
            point2 = i.next();
            result += point1.getLength(point2);
            point1 = point2;
        }
        return result;
    }

}