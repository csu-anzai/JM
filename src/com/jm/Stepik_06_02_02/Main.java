/*
Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами, затем удалит
из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность в обратном порядке в
System.out.
Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
В этом задании надо написать программу целиком, включая import'ы, декларацию класса Main и метода main.
Sample Input:
1 2 3 4 5 6 7
Sample Output:
6 4 2
 */

package com.jm.Stepik_06_02_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                scanner.nextInt();
                if (scanner.hasNextInt()){
                    list1.add(scanner.nextInt());
                }
            } else {
                scanner.next();
            }
        }
        Collections.reverse(list1);

        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(" ");
        }
    }
}
