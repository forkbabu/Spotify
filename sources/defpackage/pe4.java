package defpackage;

import io.reactivex.k;
import okhttp3.e0;
import retrofit2.v;

/* renamed from: pe4  reason: default package */
public final class pe4 implements fjf<oe4> {
    private final wlf<se4> a;
    private final wlf<o1e<b91>> b;
    private final wlf<cf4> c;
    private final wlf<k<v<e0>, b91>> d;
    private final wlf<h81> e;

    public pe4(wlf<se4> wlf, wlf<o1e<b91>> wlf2, wlf<cf4> wlf3, wlf<k<v<e0>, b91>> wlf4, wlf<h81> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new oe4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e);
    }
}
