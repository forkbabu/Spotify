package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;

/* renamed from: d1c  reason: default package */
public final class d1c implements fjf<c1c> {
    private final wlf<ere> a;
    private final wlf<a> b;
    private final wlf<c> c;

    public d1c(wlf<ere> wlf, wlf<a> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c1c(this.a.get(), this.b.get(), this.c.get());
    }
}
