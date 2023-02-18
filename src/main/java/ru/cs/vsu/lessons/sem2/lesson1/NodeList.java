package ru.cs.vsu.lessons.sem2.lesson1;

/**
 * Представляет односвязный список
 */
public class NodeList {

  /**
   * Ссылка на начало списка
   */
  private Node root;

  public NodeList() {
  }

  /**
   * Добавить элемент в конец списка
   *
   * @param el элемент
   */
  public void add(Node el) {
    if (root == null) {
      root = el;
      return;
    }
    Node current = root;
    while (current.getNext() != null) {
      current = current.getNext();
    }
    current.setNext(el);
  }

  /**
   * Добавить элемент в конец списка
   *
   * @param el элемент
   */
  public void add(int el) {
    add(new Node(el));
  }

  /**
   * Получить размер списка
   *
   * @return размер списка
   */
  public int size() {
    int n = 0;
    Node current = root;
    while (current != null) {
      current = current.getNext();
      n++;
    }
    return n;
  }

  /**
   * Получить элемент по индексу
   *
   * @param ind индекс элемента
   * @return элемент списка
   */
  public Node get(int ind) {
    Utils.checkCorrectIndex(ind, size());
    Node current = root;
    int i = 0;
    while (current != null && i != ind) {
      current = current.getNext();
      i++;
    }
    return current;
  }


  /**
   * Удалить элемент по индексу
   *
   * @param ind индекс
   */
  public void remove(int ind) {
    Utils.checkCorrectIndex(ind, size());
    Node current = root;
    Node prev = null;
    int i = 0;
    while (current.getNext() != null && i != ind) {
      prev = current;
      current = current.getNext();
      i++;
    }

    if (prev == null) {
      root = current.getNext();
    } else {
      prev.setNext(current.getNext());
    }
  }
}
