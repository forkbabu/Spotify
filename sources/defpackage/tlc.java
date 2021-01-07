package defpackage;

import com.spotify.music.podcast.freetierlikes.tabs.c;
import com.spotify.music.podcast.freetierlikes.tabs.f;

/* renamed from: tlc  reason: default package */
public final class tlc implements fjf<slc> {
    private final wlf<klc> a;
    private final wlf<opa> b;
    private final wlf<f> c;
    private final wlf<c> d;

    public tlc(wlf<klc> wlf, wlf<opa> wlf2, wlf<f> wlf3, wlf<c> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new slc(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
