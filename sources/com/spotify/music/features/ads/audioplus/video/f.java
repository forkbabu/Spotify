package com.spotify.music.features.ads.audioplus.video;

import android.os.Parcelable;

public abstract class f implements Parcelable {
    public static f a(String str, String str2, int i) {
        return new e(str, str2, i);
    }

    public abstract String b();

    public abstract String c();

    public abstract int e();
}
