package com.airbnb.lottie.model.content;

public class Mask {
    private final MaskMode a;
    private final ic b;
    private final ec c;
    private final boolean d;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, ic icVar, ec ecVar, boolean z) {
        this.a = maskMode;
        this.b = icVar;
        this.c = ecVar;
        this.d = z;
    }

    public MaskMode a() {
        return this.a;
    }

    public ic b() {
        return this.b;
    }

    public ec c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
