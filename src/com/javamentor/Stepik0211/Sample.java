package com.javamentor.Stepik0211;

import java.util.ArrayList;

public class Sample {


    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
//        if ((a & b) == true | (a & c) == true | (a & d) == true | (b & c) == true | (b & d) == true | (c & d) == true) {
//            return true;
//        } else {
//            return false;
//        }
// выше ошибка: return true если 3 параметра true

        ArrayList list = new ArrayList();   //лист для true
        Boolean[] array = new Boolean[4];   //массив для параметров
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;

        for (int i = 0; i < array.length; i++) {    //проходим по всем элементам массива
            if (array[i] == true) {                 //для всех true
                list.add(i);                        //кладем в list
            }
        }
        int x = list.size();                //получаем размер листа с true
        if (x == 2) {                       //если размер листа с true = 2
            return true;
        } else {
            return false;
        }
    }
}
