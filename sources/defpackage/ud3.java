package defpackage;

import com.spotify.android.flags.c;

/* renamed from: ud3  reason: default package */
public final class ud3 implements fjf<td3> {
    private final wlf<wk9> a;
    private final wlf<p71> b;
    private final wlf<j81> c;
    private final wlf<ere> d;
    private final wlf<c> e;

    public ud3(wlf<wk9> wlf, wlf<p71> wlf2, wlf<j81> wlf3, wlf<ere> wlf4, wlf<c> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static ud3 a(wlf<wk9> wlf, wlf<p71> wlf2, wlf<j81> wlf3, wlf<ere> wlf4, wlf<c> wlf5) {
        return new ud3(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new td3(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
