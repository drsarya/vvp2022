package ru.cs.vsu.lessons.lesson4;

import java.util.Scanner;
import ru.cs.vsu.lessons.lesson3.task3.figures.Point;

public class Task2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DataReader dataReader = new DataReader(scanner);
    System.out.println("Вводить точки необходимо в порядке обхода многоугольника");
    Point[] elements = dataReader.readPointArray();
    double squareOfPolygon = getSquareOfPolygon(elements);

    System.out.printf("Площадь многоугольника равна %f", squareOfPolygon);
  }

  /**
   * Метод вычисляет площадь многоугольника с помощью формулы Гаусса
   *
   * @param points массив точек
   * @return площадь многоугольника
   */
  public static double getSquareOfPolygon(Point[] points) {
    double square = 0;
    for (int i = 0; i < points.length; i++) {
      int nextInd = (i + 1) % points.length;
      square += points[i].x * points[nextInd].y - points[nextInd].x * points[i].y;
    }
    return Math.abs(square) * 0.5;
  }
}
