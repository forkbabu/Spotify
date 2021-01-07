package defpackage;

import com.spotify.mobile.android.util.t;

/* renamed from: pe7  reason: default package */
public final class pe7 implements fjf<oe7> {
    private final wlf<ne7> a;
    private final wlf<se7> b;
    private final wlf<cqe> c;
    private final wlf<t> d;
    private final wlf<String> e;

    public pe7(wlf<ne7> wlf, wlf<se7> wlf2, wlf<cqe> wlf3, wlf<t> wlf4, wlf<String> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new oe7(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
