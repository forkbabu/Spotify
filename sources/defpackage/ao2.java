package defpackage;

import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* renamed from: ao2  reason: default package */
public class ao2 implements a {
    private final ko2 a;

    public ao2(ko2 ko2) {
        this.a = ko2;
    }

    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        ContextTrack contextTrack = playerState.track().get();
        if (!kxd.j(contextTrack) && this.a.a() && kxd.f(contextTrack)) {
            return true;
        }
        return false;
    }
}
