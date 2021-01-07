package defpackage;

import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.player.model.PlayerState;
import com.spotify.voice.api.model.k;
import com.spotify.voice.api.model.l;
import io.reactivex.g;
import io.reactivex.z;

/* renamed from: wse  reason: default package */
public final class wse implements fjf<z<k>> {
    private final wlf<g<PlayerState>> a;
    private final wlf<l> b;
    private final wlf<WebgateTokenProvider> c;

    public wse(wlf<g<PlayerState>> wlf, wlf<l> wlf2, wlf<WebgateTokenProvider> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return z.Q(this.a.get().E(), z.y(new kse(this.c.get())).D(mse.a), this.b.get().d(), pse.a);
    }
}
