package ru.cs.vsu.lessons.sem2.lesson1;

/**
 * Представляет элемент односвязного списка
 */
public class Node {

  /**
   * Значение элемента
   */
  private int value;

  /**
   * Следующий элемент
   */
  private Node next;

  public Node(int value) {
    this.value = value;
  }

  /**
   * Getters, setters
   */

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Node{" +
        "value=" + value +
        '}';
  }
}
