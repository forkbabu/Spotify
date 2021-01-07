package defpackage;

import io.reactivex.k;
import io.reactivex.y;

/* renamed from: mc4  reason: default package */
public final class mc4 implements fjf<lc4> {
    private final wlf<hf4> a;
    private final wlf<dc4> b;
    private final wlf<k<b91, String>> c;
    private final wlf<bj9> d;
    private final wlf<y> e;
    private final wlf<efa> f;

    public mc4(wlf<hf4> wlf, wlf<dc4> wlf2, wlf<k<b91, String>> wlf3, wlf<bj9> wlf4, wlf<y> wlf5, wlf<efa> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lc4(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
