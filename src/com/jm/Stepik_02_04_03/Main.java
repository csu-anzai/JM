/*
Вам дан список ролей и сценарий пьесы в виде массива строчек.
Каждая строчка сценария пьесы дана в следующем виде:
Роль: текст
Текст может содержать любые символы.
Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат
в виде готового текста (см. пример). Каждая группа распечатывается в следующем виде:
Роль:
i) текст
j) текст2
...
==перевод строки==
i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует
в соответствии с порядком ролей. Переводы строк между группами обязательны, переводы строк в конце
текста не учитываются.
Заметим, что вам предстоит обработка огромной пьесы в 50 000 строк для 10 ролей – соответственно,
неправильная сборка результирующей строчки может выйти за ограничение по времени.
Обратите внимание еще на несколько нюансов:
имя персонажа может встречаться в строке более одного раза, в том числе с двоеточием;
название одной роли может быть префиксом названия другой роли (например, "Лука" и "Лука Лукич");
роль, у которой нет реплик, тоже должна присутствовать в выходном файле;
в качестве перевода строки надо использовать символ '\n' (перевод строки в стиле UNIX);
будьте внимательны, не добавляйте лишних пробелов в конце строк.
 */
package com.jm.Stepik_02_04_03;


public class Main {
    public static void main(String[] args) {
        String[] roles = {"Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        for (int k = 0; k < roles.length; k++) {                            //добавляем к ролям ":"
            roles[k] = roles[k] + ":";
        }
        StringBuilder preResult = new StringBuilder();                      //большая строка
        preResult.append('\n');                                             //сначала пустая строка
        for (int i = 0; i < roles.length; i++) {                            //проходим по ролям
            preResult.append(roles[i]);                                     //добавляем роли в большую строку
            preResult.append('\n');                                         //на новую строку
            for (int j = 0; j < textLines.length; j++) {                    //проходим по репликам
                if (textLines[j].startsWith(roles[i])) {                    //если реплика начинается с имени роли
                    String numRow = (j + 1) + ")";                            //номер строки из textLines
                    textLines[j] = textLines[j].replaceFirst(roles[i], numRow);  //перезаписываем имя в реплике на номер
                    preResult.append(textLines[j]);                         //добавляем к роли реплику
                    preResult.append('\n');                                 //на новую строку
                }
            }
            preResult.append('\n');                                       //на новую строку после всех реплик роли
        }
        String result = preResult.toString();                               //большую строку переводим в стринг
        return result;                                                      //возвращаем стринг
    }
}
