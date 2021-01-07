package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.music.nowplaying.core.modes.a;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* renamed from: h5c  reason: default package */
public class h5c implements a {
    @Override // com.spotify.music.nowplaying.core.modes.a
    public boolean a(PlayerState playerState) {
        ContextTrack contextTrack = playerState.track().get();
        if ((kxd.f(contextTrack) && kxd.m(contextTrack)) || InterruptionUtil.isInterruptionUri(contextTrack.uri())) {
            return true;
        }
        return false;
    }
}
