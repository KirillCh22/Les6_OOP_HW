package Task2;

/*
    В ДАННОМ КЛАССЕ ИСПОЛЬЗУЕТСЯ ТОТ ЖЕ ПРИНЦИП, ЧТО И В TASK1 ЗА ОДНОЙ ЛИШЬ РАЗНИЦОЙ, ЧТО
            В ОБЪЕКТЕ ХРАНЯТСЯ ДВА ЗНАЧЕНИЯ, ВМЕСТО ОДНОГО
*/

// Обобщенный класс TwoGen с двумя параметрами типа T и V
class TwoGen<T, V> {
    T ob1;
    V ob2;

    // Конструктор класса, принимающий два аргумента типов T и V
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // Метод для отображения типов T и V
    void showTypes() {
        System.out.println("Тип T - это " + ob1.getClass().getName());
        System.out.println("Тип V - это " + ob2.getClass().getName());
    }

    // Методы для получения объектов типов T и V
    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}
