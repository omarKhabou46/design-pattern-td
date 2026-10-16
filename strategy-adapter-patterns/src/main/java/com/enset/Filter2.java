package com.enset;

public class Filter2 implements IFilterImage {
    @Override
    public int[] filter(int[] data) {

        System.out.println("filter 2");
        return new int[0];
    }
}
