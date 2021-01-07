package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.g;

/* renamed from: c6c  reason: default package */
public final class c6c implements fjf<g<Ad>> {
    private final wlf<u5c> a;

    public c6c(wlf<u5c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().a();
    }
}
