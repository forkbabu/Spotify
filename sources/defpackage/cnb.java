package defpackage;

import com.spotify.music.newplaying.scroll.a;
import com.spotify.player.model.PlayerState;

/* renamed from: cnb  reason: default package */
public class cnb implements a {
    private final kcb a;

    public cnb(kcb kcb) {
        this.a = kcb;
    }

    @Override // com.spotify.music.newplaying.scroll.a
    public boolean a(PlayerState playerState) {
        return this.a.b() && lcb.c(playerState.track().get());
    }
}
