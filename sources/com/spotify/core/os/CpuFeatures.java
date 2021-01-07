package com.spotify.core.os;

public final class CpuFeatures {
    public static native int getCpuFamily();

    public static native long getCpuFeatures();
}
