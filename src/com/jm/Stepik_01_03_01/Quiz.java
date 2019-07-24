/*
Чтобы убедиться, что вы действительно научились пользоваться компилятором и запускать Java-программы,
запустите следующую программу. В качестве ответа введите то, что эта программа напечатает в консоль.
 */
package com.jm.Stepik_01_03_01;

import java.security.MessageDigest;

public class Quiz {

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}