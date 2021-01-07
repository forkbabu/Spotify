package defpackage;

import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.PlayerState;

/* renamed from: cp2  reason: default package */
public class cp2 implements a {
    private final ko2 a;

    public cp2(ko2 ko2) {
        this.a = ko2;
    }

    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        return this.a.a();
    }
}
