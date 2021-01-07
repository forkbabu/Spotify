package defpackage;

import com.spotify.music.libs.collection.util.l;

/* renamed from: x7a  reason: default package */
public final class x7a implements fjf<w7a> {
    private final wlf<y7a> a;
    private final wlf<l> b;

    public x7a(wlf<y7a> wlf, wlf<l> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w7a(this.a.get(), this.b.get());
    }
}
