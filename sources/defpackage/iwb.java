package defpackage;

import com.spotify.music.feedback.b;
import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.PlayerState;

/* renamed from: iwb  reason: default package */
public class iwb implements a {
    private final b a;

    public iwb(b bVar) {
        this.a = bVar;
    }

    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        return this.a.a(playerState) || agd.i(playerState.contextUri()) || agd.h(playerState.contextUri());
    }
}
