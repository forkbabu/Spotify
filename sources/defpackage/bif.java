package defpackage;

import com.spotify.music.json.g;
import retrofit2.w;

/* renamed from: bif  reason: default package */
public final class bif implements fjf<aif> {
    private final wlf<w> a;
    private final wlf<g> b;

    public bif(wlf<w> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new aif(this.a.get(), this.b.get());
    }
}
