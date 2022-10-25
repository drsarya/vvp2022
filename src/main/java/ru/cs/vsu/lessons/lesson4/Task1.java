package ru.cs.vsu.lessons.lesson4;

import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DataReader dataReader = new DataReader(scanner);
    int[] elements = dataReader.readIntArray();
    int elementToFind = dataReader.readInt("Введите значение для поиска:");
    int countOfElement = getCountOfElement(elements, elementToFind);
    System.out.printf("Количество вхождений элемента %d в массив равно %d", elementToFind, countOfElement);
  }


  /**
   * Метод для подсчета вхождений элемента в массиве
   *
   * @param array массив, в котором мы будем считать количество вхождений
   * @param value значение для поиска
   * @return количество вхождений value в массив array
   */
  public static int getCountOfElement(int[] array, int value) {
    int counter = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        counter++;
      }
    }
    return counter;
  }
}
