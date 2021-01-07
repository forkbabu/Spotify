package defpackage;

import com.spotify.glue.dialogs.g;
import com.spotify.music.features.playlistentity.c0;
import com.spotify.music.features.playlistentity.w;
import defpackage.wh6;

/* renamed from: vj6  reason: default package */
public final class vj6 implements fjf<uj6> {
    private final wlf<pj6> a;
    private final wlf<w> b;
    private final wlf<wh6.a> c;
    private final wlf<c0> d;
    private final wlf<g> e;

    public vj6(wlf<pj6> wlf, wlf<w> wlf2, wlf<wh6.a> wlf3, wlf<c0> wlf4, wlf<g> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uj6(this.a, this.b, this.c, this.d, this.e);
    }
}
