package com.javamentor.Stepik_02_01_04;

/**
 * Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
 * Данная задача актуальна, например, при работе с битовыми полями.
 * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит
 * проверяющая система.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(flipBit(0, 1));
    }

    public static int flipBit(int value, int bitIndex) {
        int x = 1<<(bitIndex - 1);      //двигаем 1 на bitIndex - получаем число
        int result = value ^ x;         //выполняем XOR
        return result;
    }
}

//        System.out.println(2<<5);

//        String s = String.format("%32s", Integer.toBinaryString(value)).replace(' ', '0'); //чтобы не отбрасывать нули
//        System.out.println(s);
//
//        char[] arr = s.toCharArray();   //создаем массив и инициализируем символами
//
//        int m = Character.getNumericValue(arr[32-bitIndex]);    //переводим этот символ в int и инвертируем
//        System.out.println(m);
//
//        if (m == 0) {
//            m = 1;
//        } else {
//            m = 0;
//        }
//
//        char i = (char)('0' + m);   //КОСТЫЛЬ. переводим int в char
//        System.out.println(i);
//
//        arr[32-bitIndex] = i;  //этот символ кладем в массив символов под индексом bitIndex
//
//        String tt = new String(arr);    //переводим массив char в строку
//        System.out.println(tt);
//
//        int t = Integer.parseInt(tt, 2);   //переводим из двоичного в десятичное
//
//        return t;   //возвращием Int
/**
 * Логика:
 * 1) Битовая маска. (bitIndex-1) - получаем правильный индекс бита, в данном случае -1 т.к. начинаем по условию
 * с 1 а не с 0
 * 2) Битовая маска. (1<<) - первый бит десятичного числа 1 (00000000 00000000 00000000 00000001) двигаем влево
 * на правильный индекс
 * 3) выполняем XOR (логическое НЕ-ИЛИ) между value и битовой маской
 *
 * Вопрос1: почему именно 1<<. Потому что так можно получить одну 1 в битовой маске для изменения value в этом бите.
 * Вопрос2: почему именно XOR. Потому что XOR меняет бит в value именно в bitIndex на противоположный.
 */
//        return value^(1<<(bitIndex-1)); //списал, stackoverflow
//    }
//}

