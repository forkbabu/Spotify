package com.spotify.mobile.android.video.tracking;

public enum VideoSurfaceState {
    BACKGROUND,
    FOREGROUND_NON_FULLSCREEN_PORTRAIT,
    FOREGROUND_NON_FULLSCREEN_LANDSCAPE,
    FOREGROUND_NON_FULLSCREEN_UNKNOWN_ORIENTATION,
    FOREGROUND_FULLSCREEN_PORTRAIT,
    FOREGROUND_FULLSCREEN_LANDSCAPE,
    FOREGROUND_FULLSCREEN_UNKNOWN_ORIENTATION;

    public static VideoSurfaceState d(boolean z, boolean z2, int i) {
        if (z) {
            return BACKGROUND;
        }
        if (z2 && i == 0) {
            return FOREGROUND_FULLSCREEN_PORTRAIT;
        }
        if (z2 && i == 1) {
            return FOREGROUND_FULLSCREEN_LANDSCAPE;
        }
        if (!z2 && i == 0) {
            return FOREGROUND_NON_FULLSCREEN_PORTRAIT;
        }
        if (!z2 && i == 1) {
            return FOREGROUND_NON_FULLSCREEN_LANDSCAPE;
        }
        if (z2) {
            return FOREGROUND_FULLSCREEN_UNKNOWN_ORIENTATION;
        }
        return FOREGROUND_NON_FULLSCREEN_UNKNOWN_ORIENTATION;
    }
}
