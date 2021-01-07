package defpackage;

import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.PlayerState;

/* renamed from: axb  reason: default package */
public class axb implements a {
    private final boolean a;

    public axb(boolean z) {
        this.a = z;
    }

    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        return !this.a;
    }
}
