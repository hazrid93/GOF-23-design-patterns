package com.company;

public class JpgCompressor implements Compressor {
    @Override
    public void compress(String file) {
        System.out.println("Compressing the image into jpg");
    }
}
