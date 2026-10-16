package com.enset;

public class Adapter implements IFilterImage {

    private final ImplNonStandard implNonStandard = new ImplNonStandard();

    @Override
    public int[] filter(int[] data) {
        return implNonStandard.appliquerFiltre( "filter",data);
    }
}
