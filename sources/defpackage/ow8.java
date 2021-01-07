package defpackage;

import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.radio.formatlist.d;

/* renamed from: ow8  reason: default package */
public final class ow8 implements fjf<nw8> {
    private final wlf<t> a;
    private final wlf<d> b;

    public ow8(wlf<t> wlf, wlf<d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nw8(this.a.get(), this.b.get());
    }
}
