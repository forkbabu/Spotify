package defpackage;

import com.spotify.libs.search.history.i;

/* renamed from: w58  reason: default package */
public final class w58 implements fjf<v58> {
    private final wlf<qe8> a;
    private final wlf<lb8> b;
    private final wlf<j81> c;
    private final wlf<i> d;
    private final wlf<s6b> e;

    public w58(wlf<qe8> wlf, wlf<lb8> wlf2, wlf<j81> wlf3, wlf<i> wlf4, wlf<s6b> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static w58 a(wlf<qe8> wlf, wlf<lb8> wlf2, wlf<j81> wlf3, wlf<i> wlf4, wlf<s6b> wlf5) {
        return new w58(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v58(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
