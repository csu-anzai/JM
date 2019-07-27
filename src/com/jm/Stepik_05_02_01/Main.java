/*
Напишите метод, читающий входной поток и вычисляющий контрольную сумму прочитанных данных.
Контрольная сумма данных вычисляется по следующему алгоритму:
Контрольная сумма представляет собой число типа int. Контрольная сумма пустого набора данных равна нулю.
Контрольная сумма непустого набора данных вычисляется по следующей рекуррентной формуле: Cn+1=rotateLeft(Cn) xor bn+1,
где Cn — контрольная сумма первых n байт данных, rotateLeft — циклический сдвиг бит числа на один бит влево
(чтобы не изобретать велосипед, используйте Integer.rotateLeft), bn — n-ный байт данных.
Поскольку метод не открывал данный InputStream, то и закрывать его он не должен. Выброшенное из методов InputStream
исключение должно выбрасываться из метода.
Пример
На вход подан InputStream, последовательно возвращающий три байта: 0x33 0x45 0x01. В качестве контрольной суммы
должно быть возвращено число 71.
 */

package com.jm.Stepik_05_02_01;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        byte[] test = {0x33, 0x45, 0x01};
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(test);
            System.out.println(checkSumOfStream(byteArrayInputStream));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int res = 0;
        int blockSize = 0;

        while ((blockSize = inputStream.read()) != -1) {
            res = Integer.rotateLeft(res, 1) ^ blockSize; //почистил
        }
        return res;
    }
}
