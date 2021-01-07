package defpackage;

import com.spotify.mobile.android.util.v;

/* renamed from: tx9  reason: default package */
public final class tx9 implements fjf<sx9> {
    private final wlf<v> a;
    private final wlf<fx9> b;
    private final wlf<yn1> c;
    private final wlf<yw9> d;
    private final wlf<Boolean> e;

    public tx9(wlf<v> wlf, wlf<fx9> wlf2, wlf<yn1> wlf3, wlf<yw9> wlf4, wlf<Boolean> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sx9(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().booleanValue());
    }
}
