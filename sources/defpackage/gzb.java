package defpackage;

import com.spotify.music.nowplaying.musicvideotoggle.widget.g;
import com.spotify.player.model.PlayerState;

/* renamed from: gzb  reason: default package */
public final class gzb implements fjf<g> {
    private final wlf<io.reactivex.g<PlayerState>> a;

    public gzb(wlf<io.reactivex.g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g(this.a.get());
    }
}
