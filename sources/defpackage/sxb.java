package defpackage;

import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.PlayerState;

/* renamed from: sxb  reason: default package */
public class sxb implements a {
    private final boolean a;
    private final cmd b;

    public sxb(boolean z, cmd cmd) {
        this.a = z;
        this.b = cmd;
    }

    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        return !this.a && this.b.a();
    }
}
