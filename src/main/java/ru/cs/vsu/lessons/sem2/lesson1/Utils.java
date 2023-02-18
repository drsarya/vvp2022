package ru.cs.vsu.lessons.sem2.lesson1;

public class Utils {

  /**
   * Проверить корректность введённого индекса
   *
   * @param index индекс
   * @param size  размер списка
   */
  public static void checkCorrectIndex(int index, int size) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException(index);
    }
  }
}
