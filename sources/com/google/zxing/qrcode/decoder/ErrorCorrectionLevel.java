package com.google.zxing.qrcode.decoder;

public enum ErrorCorrectionLevel {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private final int bits;

    private ErrorCorrectionLevel(int i) {
        this.bits = i;
    }

    public int d() {
        return this.bits;
    }
}
