package com.spotify.music.slate.model;

import android.os.Parcelable;
import android.widget.TextView;

public abstract class u implements Parcelable {
    public static u b(int i) {
        return new j(i);
    }

    public static u c(CharSequence charSequence) {
        return new g(charSequence);
    }

    public abstract void a(TextView textView);
}
