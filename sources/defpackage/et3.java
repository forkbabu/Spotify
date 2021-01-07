package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.g;

/* renamed from: et3  reason: default package */
public final class et3 implements fjf<g<Boolean>> {
    private final wlf<g<Ad>> a;

    public et3(wlf<g<Ad>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().O(at3.a);
    }
}
