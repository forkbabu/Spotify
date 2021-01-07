package defpackage;

import com.spotify.music.features.playlistentity.l;

/* renamed from: cx6  reason: default package */
public final class cx6 implements fjf<bx6> {
    private final wlf<wt6> a;
    private final wlf<l> b;

    public cx6(wlf<wt6> wlf, wlf<l> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bx6(this.a.get(), this.b.get());
    }
}
