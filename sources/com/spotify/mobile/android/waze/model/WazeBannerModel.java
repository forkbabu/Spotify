package com.spotify.mobile.android.waze.model;

import com.spotify.mobile.android.waze.model.a;

public abstract class WazeBannerModel {

    public enum Type {
        NO_BANNER,
        NAVIGATION_BANNER,
        GOTO_BANNER
    }

    public static abstract class a {
        public abstract a a(int i);

        public abstract WazeBannerModel b();

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(int i);

        public abstract a g(String str);
    }

    public static a b(Type type) {
        a.b bVar = new a.b();
        bVar.h(type);
        bVar.f(0);
        bVar.a(0);
        return bVar;
    }

    public abstract int a();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract int f();

    public abstract String g();

    public abstract Type h();
}
