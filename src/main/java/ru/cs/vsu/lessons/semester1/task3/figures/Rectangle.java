package ru.cs.vsu.lessons.semester1.task3.figures;

public class Rectangle {

  public double x;
  public double y;
  public double w;
  public double h;

  /**
   * @param x координата верхнего левого угла
   * @param y координата верхнего левого угла
   * @param w ширина фигуры
   * @param h высота фигуры
   */
  public Rectangle(double x, double y, double w, double h) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
  }
  /**
   * Проверяет, находится ли точка (px, py) внутри прямоугольника
   */
  public boolean isPointInsideRectangle(double px, double py) {
    return px >= x && px <= x + w && py <= y && py >= y - h;
  }
}
