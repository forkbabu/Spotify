package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.g;

/* renamed from: n6c  reason: default package */
public final class n6c implements fjf<m6c> {
    private final wlf<g<Boolean>> a;
    private final wlf<g<Ad>> b;
    private final wlf<dv3> c;

    public n6c(wlf<g<Boolean>> wlf, wlf<g<Ad>> wlf2, wlf<dv3> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m6c(this.a.get(), this.b.get(), this.c.get());
    }
}
