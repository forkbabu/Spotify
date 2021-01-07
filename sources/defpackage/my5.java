package defpackage;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.music.playback.api.f;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: my5  reason: default package */
public final class my5 implements fjf<ly5> {
    private final wlf<y> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<d> c;
    private final wlf<hy5> d;
    private final wlf<ConnectManager> e;
    private final wlf<f> f;

    public my5(wlf<y> wlf, wlf<g<PlayerState>> wlf2, wlf<d> wlf3, wlf<hy5> wlf4, wlf<ConnectManager> wlf5, wlf<f> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ly5(this.a.get(), this.b.get(), this.c, this.d.get(), this.e.get(), this.f.get());
    }
}
