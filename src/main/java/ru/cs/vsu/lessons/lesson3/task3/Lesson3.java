package ru.cs.vsu.lessons.lesson3.task3;


import org.junit.Assert;
import ru.cs.vsu.lessons.lesson3.task3.figures.Circle;
import ru.cs.vsu.lessons.lesson3.task3.figures.Line;
import ru.cs.vsu.lessons.lesson3.task3.figures.Rectangle;

/**
 * Пример решения третьей задачи для варианта номер 5
 */
public class Lesson3 {

  public static Circle circle = new Circle(-2, 3, 2);
  public static Rectangle rectangle = new Rectangle(-3, 8, 10, 8);
  public static final Line l1 = new Line(-1, 2, 4.0 / 1);

  public static void main(String[] args) {

    Assert.assertEquals(SimpleColor.BLUE, getSimpleColor(-1, -1));
    Assert.assertEquals(SimpleColor.BLUE, getSimpleColor(8, 5));

    Assert.assertEquals(SimpleColor.ORANGE, getSimpleColor(-1.5, 0.5));
    Assert.assertEquals(SimpleColor.ORANGE, getSimpleColor(-0.1, 4.5));
    Assert.assertEquals(SimpleColor.ORANGE, getSimpleColor(1, 1));

    Assert.assertEquals(SimpleColor.GREEN, getSimpleColor(-2, 3));
    Assert.assertEquals(SimpleColor.GREEN, getSimpleColor(-2, 7));

    Assert.assertEquals(SimpleColor.WHITE, getSimpleColor(-10, 7));
    Assert.assertEquals(SimpleColor.WHITE, getSimpleColor(-3.5, 3));
    Assert.assertEquals(SimpleColor.WHITE, getSimpleColor(-7, -5));
  }

  public static SimpleColor getSimpleColor(double x, double y) {
    if (!l1.isPointAboveLine(x, y) && !rectangle.isPointInsideRectangle(x, y)
        || !l1.isPointAboveLine(x, y) && circle.isPointInsideCircle(x, y)) {
      return SimpleColor.BLUE;
    } else if (l1.isPointAboveLine(x, y) && !rectangle.isPointInsideRectangle(x, y)) {
      return SimpleColor.WHITE;
    } else if (l1.isPointAboveLine(x, y) && rectangle.isPointInsideRectangle(x, y)
        && (circle.isPointInsideCircle(x, y) || circle.pointAboveCenter(x, y))) {
      return SimpleColor.GREEN;
    }
    return SimpleColor.ORANGE;
  }
}


