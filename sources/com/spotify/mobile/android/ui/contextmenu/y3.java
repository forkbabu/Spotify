package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.navigation.logger.f;
import java.util.Map;

public abstract class y3<T> {
    public static final y3<Void> h = new a();
    private final com.spotify.instrumentation.a a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final f f;
    private final Map<String, String> g;

    private static class a extends y3<Void> {
        a() {
            super(PageIdentifiers.CONTEXTMENU, "", "", null, false, f.C0160f.a, null);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.spotify.mobile.android.ui.contextmenu.y3
        public Void f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.spotify.mobile.android.ui.contextmenu.y3
        public String g() {
            throw new UnsupportedOperationException();
        }

        @Override // com.spotify.mobile.android.ui.contextmenu.y3
        public String j() {
            throw new UnsupportedOperationException();
        }

        @Override // com.spotify.mobile.android.ui.contextmenu.y3
        public boolean m() {
            return true;
        }
    }

    y3(com.spotify.instrumentation.a aVar, String str, String str2, String str3, boolean z, f fVar, Map<String, String> map) {
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = fVar;
        this.g = map;
    }

    public static <T> y3<T> a(com.spotify.instrumentation.a aVar, String str, String str2, String str3, boolean z, T t) {
        return new q3(aVar, str, str2, str3, z, null, t);
    }

    public static <T> y3<T> b(y3<T> y3Var, T t) {
        return new q3(((y3) y3Var).a, y3Var.j(), y3Var.g(), ((y3) y3Var).d, ((y3) y3Var).e, ((y3) y3Var).g, t);
    }

    public static <T> y3<T> k(com.spotify.instrumentation.a aVar, String str, String str2) {
        return new a4(aVar, str, str2);
    }

    public static <T> y3<T> l(com.spotify.instrumentation.a aVar, String str, String str2, String str3, boolean z, Map<String, String> map) {
        return new a4(aVar, str, str2, str3, z, map);
    }

    public boolean c() {
        return this.e;
    }

    public Map<String, String> d() {
        return this.g;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        if (this.a != y3Var.a) {
            return false;
        }
        String str = this.b;
        if (str == null ? y3Var.b != null : !str.equals(y3Var.b)) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null ? y3Var.d != null : !str2.equals(y3Var.d)) {
            return false;
        }
        String str3 = this.c;
        String str4 = y3Var.c;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public abstract T f();

    public String g() {
        return this.c;
    }

    public f h() {
        return this.f;
    }

    public int hashCode() {
        com.spotify.instrumentation.a aVar = this.a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public com.spotify.instrumentation.a i() {
        return this.a;
    }

    public String j() {
        return this.b;
    }

    public abstract boolean m();
}
