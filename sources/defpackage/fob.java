package defpackage;

import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* renamed from: fob  reason: default package */
public class fob implements a {
    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        ContextTrack contextTrack = playerState.track().get();
        if (!kxd.j(contextTrack) && kxd.f(contextTrack) && !kxd.m(contextTrack)) {
            return true;
        }
        return false;
    }
}
