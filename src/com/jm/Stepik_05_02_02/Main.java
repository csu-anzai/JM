/**
 * По историческим причинам на разных платформах принят разный способ обозначения конца строки в текстовом файле. На
 * Unix-системах конец строки обозначается символом с кодом 10 ('\n'), на Windows — двумя последовательными символами с
 * кодами 13 и 10 ('\r' '\n').
 * Напишите программу, которая будет преобразовывать переводы строк из формата Windows в формат Unix. Данные в формате
 * Windows подаются программе в System.in, преобразованные данные должны выводиться в System.out. На этот раз вам надо
 * написать программу полностью, т.е. объявить класс (с именем Main — таково ограничение проверяющей системы), метод
 * main, прописать все import'ы.
 * Требуется заменить все вхождения пары символов '\r' и '\n' на один символ '\n'. Если на входе встречается одиночный
 * символ '\r', за которым не следует '\n', то символ '\r' выводится без изменения.
 * Кодировка входных данных такова, что символ '\n' представляется байтом 10, а символ '\r' — байтом 13. Поэтому
 * программа может осуществлять фильтрацию на уровне двоичных данных, не преобразуя байты в символы.
 * Из-за буферизации данных в System.out в конце вашей программы надо явно вызвать System.out.flush(). Иначе часть
 * выведенных вами данных не будет видна проверяющей системе.
 * Пример
 * Из System.in зачитаны следующие байты: 65 13 10 10 13. Внимание! Это не строка "65 13 10 10 13", а последовательность
 * чисел, возвращаемая методом System.in.read().
 * В System.out должны быть выведены байты: 65 10 10 13
 */

package com.jm.Stepik_05_02_02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        byte[] test = {65, 13, 10, 10, 13};
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(test);
            System.out.println(windowsToUnix(byteArrayInputStream));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int windowsToUnix(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buf = new byte[inputStream.available()];
        int res = 0;
        int myInt = 0;
        int blockSize = 0;

        while ((blockSize = inputStream.read(buf)) != -1) {
            //myInt = blockSize & 0xff; //выполняем расширение до 32 бит без знака
            byteArrayOutputStream.write(buf);
        }
        System.out.println(Arrays.toString(buf));


        return res;
    }
}
