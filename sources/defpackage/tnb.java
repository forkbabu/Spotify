package defpackage;

import com.spotify.music.newplaying.scroll.a;
import com.spotify.player.model.PlayerState;
import kotlin.jvm.internal.h;

/* renamed from: tnb  reason: default package */
public final class tnb implements a {
    private final boolean a;

    public tnb(boolean z) {
        this.a = z;
    }

    @Override // com.spotify.music.newplaying.scroll.a
    public boolean a(PlayerState playerState) {
        h.e(playerState, "playerState");
        return this.a;
    }
}
