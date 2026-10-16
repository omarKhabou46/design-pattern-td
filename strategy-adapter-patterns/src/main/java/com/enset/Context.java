package com.enset;

public class Context {
    private IFilterImage filterImage;
    private ICompressImage compressImage;

    public int[] filter(int[] data) {
        return filterImage.filter(data);
    }

    public int[] compresser(int[] data) {
        return compressImage.compresser(data);
    }

    public void setCompressImage(ICompressImage compressImage) {
        this.compressImage = compressImage;
    }

    public void setFilterImage(IFilterImage filterImage) {
        this.filterImage = filterImage;
    }
}
