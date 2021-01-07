package defpackage;

import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.PlayerState;

/* renamed from: ftb  reason: default package */
public class ftb implements a {
    private final m41 a;
    private final ep2 b;

    public ftb(m41 m41, ep2 ep2) {
        this.a = m41;
        this.b = ep2;
    }

    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        return this.a.b() && !this.b.a();
    }
}
