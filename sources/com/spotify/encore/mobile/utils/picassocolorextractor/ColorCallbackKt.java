package com.spotify.encore.mobile.utils.picassocolorextractor;

public final class ColorCallbackKt {
    public static final int extractColor(kvd kvd) {
        int b = kvd.b(-65281);
        return b == -65281 ? kvd.c(-7829368) : b;
    }
}
