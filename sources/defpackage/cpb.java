package defpackage;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: cpb  reason: default package */
public final class cpb implements fjf<bpb> {
    private final wlf<g<Ad>> a;
    private final wlf<g<PlayerState>> b;

    public cpb(wlf<g<Ad>> wlf, wlf<g<PlayerState>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bpb(this.a.get(), this.b.get());
    }
}
