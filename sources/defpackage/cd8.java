package defpackage;

import com.spotify.libs.search.history.h;

/* renamed from: cd8  reason: default package */
public final class cd8 implements fjf<bd8> {
    private final wlf<dd8> a;
    private final wlf<h> b;

    public cd8(wlf<dd8> wlf, wlf<h> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bd8(this.a.get(), this.b.get());
    }
}
