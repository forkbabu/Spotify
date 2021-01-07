package defpackage;

import com.spotify.music.features.playlistentity.l;

/* renamed from: wx6  reason: default package */
public final class wx6 implements fjf<vx6> {
    private final wlf<wt6> a;
    private final wlf<l> b;

    public wx6(wlf<wt6> wlf, wlf<l> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vx6(this.a.get(), this.b.get());
    }
}
