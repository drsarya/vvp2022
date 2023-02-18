package ru.cs.vsu.lessons.semester1.task3.figures;

public class Circle {

  public double x;
  public double y;
  public double r;

  /**
   * @param x координата точки центра окружности
   * @param y координата точки центра окружности
   * @param r радиус окружности
   */
  public Circle(double x, double y, double r) {
    this.x = x;
    this.y = y;
    this.r = r;
  }

  /**
   * Определяет, лежит ли точка внутри круга.
   *
   * @param px координата x
   * @param py координата y
   * @return true - если точка находится внутри круга
   */
  public boolean isPointInsideCircle(double px, double py) {
    return Math.pow(px - x, 2) + Math.pow(py - y, 2) <= Math.pow(r, 2);
  }

  /**
   * Проверяет, находится ли точка (px, py) выше центра окружности
   *
   * @param px координата точки
   * @param py координата точки
   * @return true - если точка находится выше центра окружности
   */
  public boolean pointAboveCenter(double px, double py) {
    return py >= y;
  }

}
