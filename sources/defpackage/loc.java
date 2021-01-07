package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: loc  reason: default package */
public final class loc implements fjf<koc> {
    private final wlf<jz1> a;
    private final wlf<cqe> b;
    private final wlf<c> c;

    public loc(wlf<jz1> wlf, wlf<cqe> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new koc(this.a.get(), this.b.get(), this.c.get());
    }
}
