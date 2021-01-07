package defpackage;

import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.PlayerState;

/* renamed from: rp2  reason: default package */
public class rp2 implements a {
    private final ko2 a;
    private final iwb b;
    private final axb c;

    public rp2(ko2 ko2, iwb iwb, axb axb) {
        this.a = ko2;
        this.b = iwb;
        this.c = axb;
    }

    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        return this.a.a() && (this.b.a(playerState) || this.c.a(playerState));
    }
}
