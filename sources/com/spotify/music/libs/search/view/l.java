package com.spotify.music.libs.search.view;

import android.util.Property;

public interface l {
    public static final Property<l, Float> a = new a(Float.class, "alpha");

    static class a extends Property<l, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Float get(l lVar) {
            return Float.valueOf(lVar.i());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(l lVar, Float f) {
            lVar.p(f.floatValue());
        }
    }

    @FunctionalInterface
    public interface b {
        void L(boolean z);

        void f(String str);

        void n();

        void r(String str);
    }

    public interface c {
        boolean B1();
    }

    boolean f();

    void g(b bVar);

    String h();

    float i();

    void j(String str);

    void k(String str, boolean z);

    void l(int i);

    void m();

    void n(boolean z);

    void o();

    void p(float f);

    void q(b bVar);
}
