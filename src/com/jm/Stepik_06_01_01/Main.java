/*
Реализуйте generic-класс Main, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий элементам
принимать значение null.
Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of(). Конструктор
должен быть закрытым (private).
С корректно реализованным классом Main должен компилироваться и успешно работать следующий код:

Pair<Integer, String> pair = Pair.of(1, "hello");
Integer i = pair.getFirst(); // 1
String s = pair.getSecond(); // "hello"
Pair<Integer, String> pair2 = Pair.of(1, "hello");
boolean mustBeTrue = pair.equals(pair2); // true!
boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

Пожалуйста, не меняйте модификатор доступа класса Main. Для корректной проверки класс должен иметь пакетную видимость.
 */

package com.jm.Stepik_06_01_01;

import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst();
        String s = pair.getSecond();

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2);  //true
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();  //true
        System.out.println(mustAlsoBeTrue);
    }

    class Pair<I, S> {
        private I ob1;
        private S ob2;

        private Pair(I o1, S o2) {
            this.ob1 = ob1;
            this.ob2 = ob2;
        }

        public static <I, S> Pair<I, S> of(I ob1, S ob2) {
            return new Pair<>(ob1, ob2);
        }

        I getFirst() {
            return ob1;
        }

        S getSecond() {
            return ob2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(ob1, pair.ob1) &&
                    Objects.equals(ob2, pair.ob2);
        }

        @Override
        public int hashCode() {
            return Objects.hash(ob1, ob2);
        }

    }
}
