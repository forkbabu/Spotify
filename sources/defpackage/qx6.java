package defpackage;

import com.spotify.music.features.renameplaylist.d;

/* renamed from: qx6  reason: default package */
public final class qx6 implements fjf<px6> {
    private final wlf<wt6> a;
    private final wlf<d> b;

    public qx6(wlf<wt6> wlf, wlf<d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new px6(this.a.get(), this.b.get());
    }
}
