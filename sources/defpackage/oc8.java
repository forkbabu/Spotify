package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: oc8  reason: default package */
public final class oc8 implements fjf<nc8> {
    private final wlf<lc8> a;
    private final wlf<c.a> b;

    public oc8(wlf<lc8> wlf, wlf<c.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nc8(this.a.get(), this.b.get());
    }
}
