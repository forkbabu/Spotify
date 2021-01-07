package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: pzb  reason: default package */
public final class pzb implements fjf<ozb> {
    private final wlf<InteractionLogger> a;
    private final wlf<cqe> b;
    private final wlf<c> c;
    private final wlf<a> d;
    private final wlf<String> e;
    private final wlf<jz1> f;

    public pzb(wlf<InteractionLogger> wlf, wlf<cqe> wlf2, wlf<c> wlf3, wlf<a> wlf4, wlf<String> wlf5, wlf<jz1> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ozb(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
