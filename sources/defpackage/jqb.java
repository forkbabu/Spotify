package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.g;

/* renamed from: jqb  reason: default package */
public final class jqb implements fjf<iqb> {
    private final wlf<g<Ad>> a;

    public jqb(wlf<g<Ad>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new iqb(this.a.get());
    }
}
