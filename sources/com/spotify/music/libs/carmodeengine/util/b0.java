package com.spotify.music.libs.carmodeengine.util;

import com.spotify.music.libs.carmodeengine.util.s;

public abstract class b0 {
    public static final b0 a;

    public static abstract class a {
        public abstract a a(int i);

        public abstract a b(boolean z);

        public abstract a c(y6a y6a);

        public abstract b0 d();

        public abstract a e(boolean z);

        public abstract a f(d7a d7a);

        public abstract a g(String str);

        public abstract a h(boolean z);

        public abstract a i(boolean z);
    }

    static {
        s.b bVar = new s.b();
        bVar.a(0);
        bVar.b(false);
        bVar.c(y6a.b());
        bVar.e(false);
        bVar.f(d7a.b());
        bVar.g("");
        bVar.h(false);
        bVar.i(false);
        a = bVar.d();
    }

    public abstract int a();

    public abstract boolean b();

    public abstract y6a c();

    public abstract boolean d();

    public abstract d7a e();

    public abstract String f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract a i();
}
