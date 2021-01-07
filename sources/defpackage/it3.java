package defpackage;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: it3  reason: default package */
public final class it3 implements fjf<ht3> {
    private final wlf<g<Ad>> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<g<Long>> c;
    private final wlf<y> d;

    public it3(wlf<g<Ad>> wlf, wlf<g<PlayerState>> wlf2, wlf<g<Long>> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ht3(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
