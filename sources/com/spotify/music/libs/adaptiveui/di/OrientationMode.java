package com.spotify.music.libs.adaptiveui.di;

import android.os.Build;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class OrientationMode extends Enum<OrientationMode> {
    public static final OrientationMode a;
    public static final OrientationMode b;
    private static final /* synthetic */ OrientationMode[] c;
    private final int screenOrientation;

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0017: APUT  
      (r0v1 com.spotify.music.libs.adaptiveui.di.OrientationMode[])
      (0 ??[int, short, byte, char])
      (r1v0 com.spotify.music.libs.adaptiveui.di.OrientationMode)
     */
    static {
        OrientationMode[] orientationModeArr = new OrientationMode[2];
        OrientationMode orientationMode = new OrientationMode("PORTRAIT", 0, Build.VERSION.SDK_INT >= 18 ? 12 : 7);
        a = orientationMode;
        orientationModeArr[0] = orientationMode;
        OrientationMode orientationMode2 = new OrientationMode("UNSPECIFIED", 1, -1);
        b = orientationMode2;
        orientationModeArr[1] = orientationMode2;
        c = orientationModeArr;
    }

    private OrientationMode(String str, int i, int i2) {
        this.screenOrientation = i2;
    }

    public static OrientationMode valueOf(String str) {
        return (OrientationMode) Enum.valueOf(OrientationMode.class, str);
    }

    public static OrientationMode[] values() {
        return (OrientationMode[]) c.clone();
    }

    public final int d() {
        return this.screenOrientation;
    }
}
