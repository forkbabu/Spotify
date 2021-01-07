package com.spotify.music.navigation;

import com.spotify.music.navigation.e;

public abstract class n {

    public static abstract class a {
        public abstract n a();

        public abstract a b(boolean z);

        public abstract a c(boolean z);

        public abstract a d(int i);

        public abstract a e(int i);

        public abstract a f(boolean z);

        public abstract a g(String str);

        public abstract a h(String str);

        public abstract a i(String str);
    }

    public static a a(String str) {
        e.b bVar = new e.b();
        bVar.j(str);
        bVar.h("");
        bVar.b(false);
        bVar.c(false);
        bVar.d(0);
        bVar.e(0);
        bVar.f(false);
        bVar.g("");
        return bVar;
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    public abstract int e();

    public abstract boolean f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract String k();
}
