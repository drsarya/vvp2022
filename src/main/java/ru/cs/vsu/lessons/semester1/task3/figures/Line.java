package ru.cs.vsu.lessons.semester1.task3.figures;

public class Line {

  public double x;
  public double y;
  public double a;

  /**
   * @param x координата точки, принадлежащей прямой
   * @param y координата точки, принадлежащей прямой
   * @param a коэффициент наклона
   */
  public Line(double x, double y, double a) {
    this.x = x;
    this.y = y;
    this.a = a;
  }

  /**
   * Проверяет, находится ли точка (px, py) выше линии
   */
  public boolean isPointAboveLine(double px, double py) {
    return py > a * (px - x) + y;
  }
}
