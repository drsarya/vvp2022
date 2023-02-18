## УЖЕ изученные нами типы данных:

Примитивные типы данных:
> * int (числовой, целочисленные значения)
> * double (числовой, вещественные значения)
> * boolean (логический, принимает значения true или false)

Ссылочные (объектные)
> * String (строка)

### *Как отличить примитивный тип данных от ссылочного?*

Ссылочный имеет собственную реализацию класса.

Примитивные типы пишутся с **маленькой** буквы, ссылочные - **с большой** (так как это класс).
Для того, чтобы проверить, является ли тип ссылочным - используем комбинацию клавищ ctrl + левая клавиша мыши,
находясь на названии типа. Если тип ссылочный - нас перекинет в реализацию класса.

## На занятии 14.09 мы разобрали условный оператор, тип String и способ отладки программы

Для чего нужен условный оператор? Оператор условия необходим для того, чтобы в зависимости от истинности условия,
происходило выполнение определённого участка кода.

#### Где можно встретить условия?

> Если денег на счёте меньше, чем требует снять клиент - отказать ему в операции
>
> Если сданы все лабы - поставить оценку пять
>
> Если дискриминант меньше нуля - вывести сообщение "действительных корней не существует"


Условный оператор работает с типом данных boolean для вычисления истинности условия.

#### Операции сравнения :

> **==** проверить равенство значений; 5 == 5 вернёт true, 5 == 4 вернёт false
>
>**!=** проверить неравнество значений; 5 == 4 вернёт true, 5 == 5 вернёт false
>
>**>=** левый аргумент больше или равен правому; 5 >= 5 вернёт true, 4 >= 5 вернёт false
>
>**<=** правый аргумент больше или равен левому; 5 <= 5 вернёт true, 6 <= 5 вернёт false
>
>**>** левый аргумент больше правого; 6 > 5 вернёт true, 5 > 5 вернёт false
>
>**<** правый аргумент больше левого; 4 < 5 вернёт true, 5 < 5 вернёт false

#### Объединение условий:

> && логическое И
>
>|| логическое ИЛИ

#### Работа операторов

1 - это ```true```

0 - это ```false```

```ОПЕРАЦИЯ &&```

| Левый аргумент | Правый аргумент | Результат |
|----------------|-----------------|-----------|
| 1              | 1               | 1         |
| 1              | 0               | 0         |
| 0              | 1               | 0         |
| 0              | 0               | 0         |

```ОПЕРАЦИЯ ||```

| Левый аргумент | Правый аргумент | Результат |
|----------------|-----------------|-----------|
| 1              | 1               | 1         |
| 1              | 0               | 1         |
| 0              | 1               | 1         |
| 0              | 0               | 0         |

## Синтаксис условного оператора

### Любые условия размещаются в ТЕЛЕ МЕТОДА

### if (здесь пишем условие) { }

 ```
if (arg > 100) {
  System.out.println("arg > 100");
}
 ```

Если нам требуется **поведение по умолчанию**, то необходим участок кода, который выполнится, если НИ одно из предыдущих
условий
не было истинным. Добавляем блок **else**:

```
if (arg > 100) {
  System.out.println("arg > 100");
} else {
  System.out.println("arg <= 100");
}
 ```

Если нам необхоимы дополнительные проверки, то добавляем if к блоку else:

```
if (arg > 100) {
  System.out.println("arg > 100");
} else if (arg > 50) {
  System.out.println("arg > 50");
} else if (arg > 10) {
  System.out.println("arg > 10");
} else {
  System.out.println("arg <= 10");
}
```

## ЗАМЕЧАНИЕ: блок else (при необходимости) всегда ставим самым последним в цепочке проверки, так как это поведение по умолчанию. После этого блока новых условий в цепочке быть уже не может.


