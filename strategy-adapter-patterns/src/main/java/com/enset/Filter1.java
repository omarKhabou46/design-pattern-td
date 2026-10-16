package com.enset;

public class Filter1 implements IFilterImage {
    @Override
    public int[] filter(int[] data) {

        System.out.println("filter 1");

        return new int[0];
    }
}
