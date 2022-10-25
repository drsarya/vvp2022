package ru.cs.vsu.lessons.lesson4;

import java.util.Scanner;
import ru.cs.vsu.lessons.lesson3.task3.figures.Point;

/**
 * Класс для чтения данных из консоли
 */
public class DataReader {

  public Scanner scanner;

  public DataReader(Scanner scanner) {
    this.scanner = scanner;
  }

  /**
   * Прочитать массив целых чисел из консоли
   *
   * @return массив значений
   */
  public int[] readIntArray() {
    System.out.println("Введите количество элементов массива: ");
    int arrayLength = scanner.nextInt();
    int[] arr = new int[arrayLength];
    System.out.println("Введите элементы массива: ");
    for (int i = 0; i < arrayLength; i++) {
      arr[i] = scanner.nextInt();
    }
    return arr;
  }

  /**
   * Прочитать число из консоли
   *
   * @param message сообщение для вывода пользователю
   * @return значение из консоли
   */
  public int readInt(String message) {
    System.out.println(message);
    return scanner.nextInt();
  }


  /**
   * Прочитать массив точек
   *
   * @return массив точек
   */
  public Point[] readPointArray() {
    System.out.println("Введите количество элементов массива: ");
    int arrayLength = scanner.nextInt();
    Point[] arr = new Point[arrayLength];
    System.out.println("Введите координаты точек: ");
    for (int i = 0; i < arrayLength; i++) {
      double x = scanner.nextDouble();
      double y = scanner.nextDouble();
      arr[i] = new Point(x, y);
    }
    return arr;
  }
}
