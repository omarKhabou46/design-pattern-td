package com.enset;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Context context = new Context();
        context.setFilterImage(new Filter1());
        context.filter(new int[]{1,2});
        context.setFilterImage(new Filter2());
        context.filter(new int[]{1,2});

        context.setCompressImage(new CompressImage1());
        context.compresser(new int[]{1,2});

        Adapter adapter = new Adapter();
        context.setFilterImage(adapter);
        context.filter(new int[]{1,2});
    }
}
