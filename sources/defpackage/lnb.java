package defpackage;

import com.spotify.music.newplaying.scroll.a;
import com.spotify.player.model.PlayerState;

/* renamed from: lnb  reason: default package */
public class lnb implements a {
    private final boolean a;

    public lnb(boolean z) {
        this.a = z;
    }

    @Override // com.spotify.music.newplaying.scroll.a
    public boolean a(PlayerState playerState) {
        return this.a;
    }
}
