package com.spotify.libs.facepile;

import android.content.Context;

public abstract class c {
    private e a;

    public static c a(String str, String str2, int i) {
        return new a(str, str2, i);
    }

    public abstract int b();

    public abstract String c();

    public abstract String d();

    public e e(Context context) {
        if (this.a == null) {
            context.getClass();
            this.a = new e(context, d(), b());
        }
        return this.a;
    }
}
