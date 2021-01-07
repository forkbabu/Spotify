package defpackage;

import android.content.Context;
import com.spotify.http.u;
import io.reactivex.y;

/* renamed from: h11  reason: default package */
public final class h11 implements fjf<g11> {
    private final wlf<Context> a;
    private final wlf<y> b;
    private final wlf<u> c;
    private final wlf<o11> d;

    public h11(wlf<Context> wlf, wlf<y> wlf2, wlf<u> wlf3, wlf<o11> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g11(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
