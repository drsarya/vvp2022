package ru.cs.vsu.lessons.lesson1;

import java.util.Locale;
import java.util.Scanner;

/**
 * Пример, который разбирали на практике 07.09 с дополнительными методами
 *
 * @author Stupak Darya
 */
public class Lesson1 {

  /**
   * Точка входа в программу
   */
  public static void main(String[] args) {
    //Добавили, чтобы ввод-вывод дробных чисел в консоль был с точкой, а не с запятой.
    Locale.setDefault(Locale.ROOT);

    //Инициализируем объект типа Scanner для чтения входного потока из консоли
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите два числа: ");
    double firstValue = scanner.nextDouble();
    double secondValue = scanner.nextDouble();
    getInfoAboutNumbers(firstValue, secondValue);
  }


  /**
   * Вычислить сумму, максимальное значение и остаток от деления для переданных значений с форматированным выводом.
   *
   * @param firstValue  первое слагаемое
   * @param secondValue второе слагаемое
   */
  public static void getInfoAboutNumbers(double firstValue, double secondValue) {
    double sum = getSum(firstValue, secondValue);
    double max = getMaxOfValues(firstValue, secondValue);
    double remainder = getRemainderOfDividing(firstValue, secondValue);
    System.out.printf("Сумма чисел %1$.2f %1$.6f равна %3$.3f \n", firstValue, secondValue, sum);
    System.out.printf("Максимальное значение из %f и %f равно %f \n", firstValue, secondValue, max);
    System.out.printf("Остаток от деления %f на %f равен %f \n\n", firstValue, secondValue, remainder);
  }

  /**
   * @param arg1 первое слагаемое
   * @param arg2 второе слагаемое
   * @return сумма переданных значений
   */
  public static double getSum(double arg1, double arg2) {
    double result = arg1 + arg2;
    return result;
  }

  /**
   * @param arg1 первое слагаемое
   * @param arg2 второе слагаемое
   * @return максимальное из переданных значений
   */
  public static double getMaxOfValues(double arg1, double arg2) {
    double max = Math.max(arg1, arg2);
    return max;
  }

  /**
   * @param arg1 первое слагаемое
   * @param arg2 второе слагаемое
   * @return остаток от деления первого слагаемого на второе
   */
  public static double getRemainderOfDividing(double arg1, double arg2) {
    double remainderOfDividing = arg1 % arg2;
    return remainderOfDividing;
  }

}
