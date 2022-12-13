package ru.cs.vsu.lessons.task9;

import java.util.Comparator;

public class YReverseComparator implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        int i = o1.getX().compareTo(o2.getX());
        if (i == 0) {
            return o2.getY().compareTo(o1.getY());
        }
        return i;
    }
}
