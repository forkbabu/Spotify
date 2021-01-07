package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.libs.connect.g;
import com.spotify.music.libs.viewuri.c;

/* renamed from: rrb  reason: default package */
public final class rrb implements fjf<g> {
    private final wlf<kqd> a;
    private final wlf<mba> b;
    private final wlf<a> c;
    private final wlf<c> d;

    public rrb(wlf<kqd> wlf, wlf<mba> wlf2, wlf<a> wlf3, wlf<c> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mrb(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
