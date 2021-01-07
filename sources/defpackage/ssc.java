package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;

/* renamed from: ssc  reason: default package */
public final class ssc implements fjf<rsc> {
    private final wlf<cqe> a;
    private final wlf<jz1> b;
    private final wlf<a> c;
    private final wlf<c> d;

    public ssc(wlf<cqe> wlf, wlf<jz1> wlf2, wlf<a> wlf3, wlf<c> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rsc(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
