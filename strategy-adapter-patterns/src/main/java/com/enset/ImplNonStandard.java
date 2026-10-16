package com.enset;

public class ImplNonStandard {

    public int[] appliquerFiltre(String filterName, int[] data) {
        System.out.println(filterName);
        System.out.println("standart filter");
        return new int[0];
    }
}
