package ru.cs.vsu.lessons.sem2.lesson1;

public class Task1 {

  public static void main(String[] args) {
    NodeList list = new NodeList();
    //Добавим элементы в список
    list.add(new Node(1));
    list.add(new Node(5));
    list.add(new Node(6));
    list.add(10);

    //Получим размер списка и элемент с индексом 1
    System.out.println(list.size());
    System.out.println(list.get(0));
    System.out.println(list.get(3));
    System.out.println("---------");

    //Удалим пару элементов
    list.remove(0);
    list.remove(2);
    System.out.println(list.size());
    System.out.println("---------");

    //Просмотрим элементы списка
    Node current = list.get(0);
    while (current != null) {
      System.out.println(current);
      current = current.getNext();
    }
  }
}
