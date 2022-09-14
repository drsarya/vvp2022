package ru.cs.vsu.lessons.lesson2.task2;


import java.util.Locale;
import java.util.Scanner;

public class Lesson2 {

  public static void main(String[] args) {
    Locale.setDefault(Locale.ROOT);
    Scanner scanner = new Scanner(System.in);
    int arg1 = scanner.nextInt();
    int arg2 = scanner.nextInt();
    getInfoAboutNumber(arg1);
    getInfoAboutNumber(arg2);

    //Вызываем метод getFullInfo для получения информации о двух числах
    String fullInfo = getFullInfo(arg1, arg2);
    System.out.println(fullInfo);
  }

  /**
   * Метод для получения информации о числе. Применение оператора if(){} else if(){} else{} . Объединение нескольких
   * условий в одно
   *
   * @param arg параметр для анализа
   */
  public static void getInfoAboutNumber(int arg) {
    if (arg % 2 == 0 && arg > 10) {
      System.out.println("Аргумент четный и больше десяти");
    } else if (arg % 2 != 0 && arg < 5) {
      System.out.println("Аргумент нечетный и меньше пяти");
    } else {
      System.out.println("Аргумент нечетный или меньше десяти  И аргумент четный или больше пяти");
    }
  }

  /**
   * Получить информаицию о двух числах. Пример вывода для чисел 0 0: A = B; A and B are 0;
   *
   * @param arg1 первое число для анализа
   * @param arg2 второе число для анализа
   * @return строка с информацией о результате сравнения значений и информация о нулевых значениях
   */
  public static String getFullInfo(int arg1, int arg2) {
    // Шаблон строки, вместо %s будет подставлено значение
    String result = "%s; %s;";
    String infoAboutNumber = compareArgs(arg1, arg2);
    String infoAboutZero = checkZeroValue(arg1, arg2);
    // метод formatted() доступен с 15 версии java. Если у Вас версия < 15, комментируем строку 53
    String formatted = result.formatted(infoAboutNumber, infoAboutZero);
    // Аналогичное вычисление значения результирующей строки
    // String formatted2 = infoAboutNumber + "; " + infoAboutZero+ ";";
    return formatted;
  }

  public static String compareArgs(int arg1, int arg2) {
    String result = "";
    if (arg1 > arg2) {
      result = "A > B";
    } else if (arg2 > arg1) {
      result = "A < B";
    } else {
      result = "A = B";
    }
    return result;
  }

  public static String checkZeroValue(int arg1, int arg2) {
    String result = "A and B are not 0";
    if (arg1 == 0 && arg2 == 0) {
      result = "A and B are 0";
    } else if (arg1 == 0) {
      result = "A is 0";
    } else if (arg2 == 0) {
      result = "B is 0";
    }
    return result;
  }
}
