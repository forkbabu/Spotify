package com.spotify.music.follow;

import com.spotify.music.follow.g;

public abstract class j {

    public static abstract class a {
        public abstract j a();

        public abstract a b(boolean z);

        public abstract a c(int i);

        public abstract a d(boolean z);

        public abstract a e(int i);

        public abstract a f(String str);
    }

    public static a a() {
        return new g.b();
    }

    public static j b(String str, int i, int i2, boolean z, boolean z2) {
        g.b bVar = new g.b();
        bVar.f(str);
        bVar.c(i);
        bVar.e(i2);
        bVar.d(z);
        bVar.b(z2);
        return bVar.a();
    }

    public abstract int c();

    public abstract int d();

    public abstract String e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract a h();
}
