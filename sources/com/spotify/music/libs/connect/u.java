package com.spotify.music.libs.connect;

import android.widget.SeekBar;
import com.google.common.base.MoreObjects;

public final class u {
    public static long a(String str) {
        if (MoreObjects.isNullOrEmpty(str)) {
            return 0;
        }
        if ("inter_app".equals(str)) {
            return 7;
        }
        if ("AndroidAuto".equals(str)) {
            return 5;
        }
        if ("AndroidWear".equals(str)) {
            return 10;
        }
        if ("AndroidOther".equals(str)) {
            return 999;
        }
        return 0;
    }

    public static float b(int i, int i2) {
        return ((float) i) / ((float) i2);
    }

    public static float c(SeekBar seekBar) {
        return b(seekBar.getProgress(), seekBar.getMax());
    }

    public static void d(float f, SeekBar seekBar) {
        if (-1.0f != f) {
            seekBar.setProgress(Math.round(f * ((float) seekBar.getMax())));
        }
    }
}
