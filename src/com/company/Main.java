package com.company;

public class Main {

    public static void main(String[] args) {
        byte a = 13;
        a = (byte) (13 + 2);
        short b = 26;
        b = (short) (b / 13);
        float c = 1.5f;
        c = c * b;
        float c1 = (float) (c - 0.5);
        double d = 10.01;
        d = d - c;
        long e = 439435444L;
        e = e + 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(d);
        System.out.println(e);
    }
}
