package ru.cs.vsu.lessons.semester1.task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task9 {

    public static void main(String[] args) {

        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 2));
        points.add(new Point(1, 3));
        points.add(new Point(1, 4));
        points.add(new Point(2, 2));
        points.add(new Point(10, 2));

        /*
         * 1. Collections.sort(). Этот метод мы можем вызывать, если у нашего класса реализован интерфейс Comparable.
         * 2. points.sort(new YReverseComparator()); YReverseComparator реализует интерфейс Comparator.
         * 3. points.sort(new Comparator(){ ... переопределяем метод compare }); Данный способ аналогичен 2-му. Только мы можем не создавать класс.
         * */
        // 1-й случай
        Collections.sort(points);
        // 2-й случай
        points.sort(new YReverseComparator());
        // 3-й случай
        points.sort(new Comparator<>() {
            @Override
            public int compare(Point o1, Point o2) {
                int i = o1.getX().compareTo(o2.getX());
                if (i == 0) {
                    return o1.getY().compareTo(o2.getY());
                }
                return i;
            }
        });

        for (Point point : points) {
            System.out.println(point);
        }
    }
}
