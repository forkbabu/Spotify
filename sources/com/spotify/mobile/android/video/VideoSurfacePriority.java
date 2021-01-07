package com.spotify.mobile.android.video;

public enum VideoSurfacePriority {
    LOW(0),
    MEDIUM(1),
    HIGH(2);
    
    private final int mValue;

    private VideoSurfacePriority(int i) {
        this.mValue = i;
    }

    public static VideoSurfacePriority d(int i) {
        VideoSurfacePriority[] values = values();
        for (int i2 = 0; i2 < 3; i2++) {
            VideoSurfacePriority videoSurfacePriority = values[i2];
            if (videoSurfacePriority.mValue == i) {
                return videoSurfacePriority;
            }
        }
        return MEDIUM;
    }

    public int g() {
        return this.mValue;
    }
}
