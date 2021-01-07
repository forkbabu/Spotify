package defpackage;

import com.spotify.music.features.editplaylist.g;

/* renamed from: ax6  reason: default package */
public final class ax6 implements fjf<zw6> {
    private final wlf<wt6> a;
    private final wlf<g> b;

    public ax6(wlf<wt6> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zw6(this.a.get(), this.b.get());
    }
}
