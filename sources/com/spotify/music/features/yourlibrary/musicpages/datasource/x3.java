package com.spotify.music.features.yourlibrary.musicpages.datasource;

import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.datasource.a;
import com.spotify.music.features.yourlibrary.musicpages.datasource.b;

public abstract class x3 implements Parcelable {
    public static final a a;
    public static final x3 b;

    public static abstract class a {
        public abstract a a(boolean z);

        public abstract x3 b();

        public abstract a c(b bVar);

        public abstract a d(Boolean bool);

        public abstract a e(boolean z);

        public abstract a f(ImmutableMap<String, String> immutableMap);

        public abstract a g(int i);

        public abstract a h(int i);
    }

    public static abstract class b implements Parcelable {
        public static final b a;

        public static abstract class a {
            public abstract b a();

            public abstract a b(ImmutableMap<String, Boolean> immutableMap);

            public abstract a c(ane ane);

            public abstract a d(String str);

            public abstract a e(boolean z);
        }

        static {
            b.a aVar = new b.a();
            aVar.e(false);
            aVar.d("");
            aVar.b(ImmutableMap.of());
            a = aVar.a();
        }

        public static a a() {
            return new b.a();
        }

        public abstract ImmutableMap<String, Boolean> b();

        public abstract ane c();

        public abstract String e();

        public abstract boolean f();
    }

    public static class c {
    }

    public static class d {
    }

    static {
        a.b bVar = new a.b();
        bVar.h(0);
        bVar.g(0);
        bVar.c(b.a);
        bVar.f(ImmutableMap.of());
        bVar.a(false);
        bVar.e(false);
        bVar.d(null);
        a = bVar;
        b = bVar.b();
    }

    public static a b() {
        return new a.b();
    }

    public abstract boolean a();

    public abstract b c();

    public boolean e() {
        return c().b().containsValue(Boolean.TRUE);
    }

    public abstract Boolean f();

    public abstract boolean g();

    public abstract ImmutableMap<String, String> h();

    public abstract a i();

    public abstract int j();

    public abstract int k();
}
