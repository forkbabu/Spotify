package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistentity.w;
import com.spotify.music.offlinetrials.limited.logging.OfflineUserMixImpressionLogger;
import defpackage.hm6;
import defpackage.sm6;

/* renamed from: nm6  reason: default package */
public final class nm6 implements fjf<mm6> {
    private final wlf<Context> a;
    private final wlf<hm6.a> b;
    private final wlf<sm6.a> c;
    private final wlf<w> d;
    private final wlf<xk6> e;
    private final wlf<vk6> f;
    private final wlf<OfflineUserMixImpressionLogger.a> g;

    public nm6(wlf<Context> wlf, wlf<hm6.a> wlf2, wlf<sm6.a> wlf3, wlf<w> wlf4, wlf<xk6> wlf5, wlf<vk6> wlf6, wlf<OfflineUserMixImpressionLogger.a> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mm6(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
