package org.unsubble.main;

public class Main {
    public static void main(String[] args) {
        new Cython("sample.c", "").compile();
    }
}