package com.spotify.music.libs.adaptiveui.di;

public final class a {
    public static OrientationMode a(boolean z) {
        OrientationMode orientationMode;
        if (z) {
            orientationMode = OrientationMode.b;
        } else {
            orientationMode = OrientationMode.a;
        }
        yif.g(orientationMode, "Cannot return null from a non-@Nullable @Provides method");
        return orientationMode;
    }
}
