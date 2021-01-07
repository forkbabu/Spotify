package defpackage;

import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.y8;

/* renamed from: ryb  reason: default package */
public class ryb implements a {
    private final boolean a;
    private final szb b;
    private final y8 c;

    public ryb(boolean z, szb szb, y8 y8Var) {
        this.a = z;
        this.b = szb;
        this.c = y8Var;
    }

    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        if (!this.c.a() || !this.a || !playerState.track().isPresent()) {
            return false;
        }
        return this.b.d(playerState.track().get().uri());
    }
}
