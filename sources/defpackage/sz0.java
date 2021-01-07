package defpackage;

import com.spotify.libs.search.online.entity.c;

/* renamed from: sz0  reason: default package */
public final class sz0 implements fjf<rz0> {
    private final wlf<oz0> a;
    private final wlf<String> b;
    private final wlf<c> c;
    private final wlf<cqe> d;
    private final wlf<Boolean> e;
    private final wlf<Boolean> f;
    private final wlf<Boolean> g;
    private final wlf<Boolean> h;

    public sz0(wlf<oz0> wlf, wlf<String> wlf2, wlf<c> wlf3, wlf<cqe> wlf4, wlf<Boolean> wlf5, wlf<Boolean> wlf6, wlf<Boolean> wlf7, wlf<Boolean> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static sz0 a(wlf<oz0> wlf, wlf<String> wlf2, wlf<c> wlf3, wlf<cqe> wlf4, wlf<Boolean> wlf5, wlf<Boolean> wlf6, wlf<Boolean> wlf7, wlf<Boolean> wlf8) {
        return new sz0(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rz0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().booleanValue(), this.f.get().booleanValue(), this.g.get().booleanValue(), this.h.get().booleanValue());
    }
}
