package defpackage;

import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.PlayerState;

/* renamed from: gq2  reason: default package */
public class gq2 implements a {
    private final ko2 a;
    private final wzb b;

    public gq2(ko2 ko2, wzb wzb) {
        this.a = ko2;
        this.b = wzb;
    }

    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        return this.a.a() && this.b.a(playerState);
    }
}
