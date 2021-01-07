package defpackage;

import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* renamed from: wzb  reason: default package */
public class wzb implements a {
    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        ContextTrack contextTrack = playerState.track().get();
        return kxd.i(contextTrack) || kxd.j(contextTrack);
    }
}
