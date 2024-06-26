package Task3;

/*                      В  ДАННОМ КЛАССЕ ИСПОЛЬЗУЕТСЯ ПРИНЦИП одстановки Барбары Лисков
                (Liskov Substitution Principle, LSP), СОГЛАСНО КОТОРОМУ ПРОИЗВОДНЫЕ ОТ БАЗОВОГО КЛАССА
                     МОГУТ БЫТЬ ИСПОЛЬЗОВАНЫ ВМЕСТО НЕГО БЕЗ НАРУШЕНИЯ КОРРЕКТНОСТИ ПРОГРАММЫ */

// Обобщенный класс Pair, который хранит два объекта совместимых типов T и V.

/* ДАННЫЙ КЛАСС МОЖЕТ ИМЕТЬ В 1-ОМ АРГУМЕНТЕ БАЗОВЫЙ КЛАСС, А ВО 2-ОМ АРГУМЕНТЕ ЕГО ПОДТИП
 И КОРРЕКТНОСТЬ ПРОГРАММЫ НЕ НАРУШИТСЯ,
 ПРИМЕР:
         <Number, Integer> - программа будет работать, т.к. Integer производный от Number */
class Pair<T, V extends T> {
    T first;
    V second;

    // Конструктор класса Pair, принимающий два объекта совместимых типов.
    Pair(T a, V b) {
        first = a;
        second = b;
    }

    // Методы для получения первого и второго объектов.
    T getFirst() {
        return first;
    }

    V getSecond() {
        return second;
    }
}
