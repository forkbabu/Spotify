package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: m81  reason: default package */
public final class m81 implements fjf<l81> {
    private final wlf<ere> a;
    private final wlf<c.a> b;

    public m81(wlf<ere> wlf, wlf<c.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l81(this.a.get(), this.b.get());
    }
}
