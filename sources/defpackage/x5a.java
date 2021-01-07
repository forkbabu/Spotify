package defpackage;

import io.reactivex.s;
import io.reactivex.y;

/* renamed from: x5a  reason: default package */
public final class x5a implements fjf<w5a> {
    private final wlf<y> a;
    private final wlf<s<d7a>> b;
    private final wlf<com.spotify.music.libs.carmodeengine.util.y> c;
    private final wlf<bhb> d;

    public x5a(wlf<y> wlf, wlf<s<d7a>> wlf2, wlf<com.spotify.music.libs.carmodeengine.util.y> wlf3, wlf<bhb> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w5a(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
