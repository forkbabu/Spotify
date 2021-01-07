package defpackage;

import com.spotify.player.model.ContextTrack;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;
import io.reactivex.g;

/* renamed from: f7c  reason: default package */
public final class f7c implements fjf<e7c> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<AndroidLibsAdsCommonProperties> b;

    public f7c(wlf<g<ContextTrack>> wlf, wlf<AndroidLibsAdsCommonProperties> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e7c(this.a.get(), this.b.get());
    }
}
