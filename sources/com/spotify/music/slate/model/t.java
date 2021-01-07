package com.spotify.music.slate.model;

import android.os.Parcelable;

public abstract class t implements Parcelable {
    public static t b(i3d i3d, u uVar) {
        return new k(i3d, uVar);
    }

    public abstract i3d a();

    public abstract u c();
}
