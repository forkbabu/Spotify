package defpackage;

import com.spotify.mobius.s;
import com.spotify.mobius.t;
import com.spotify.player.model.PlayerState;
import com.spotify.voice.external.experience.domain.model.b;

/* renamed from: rcf  reason: default package */
public final /* synthetic */ class rcf implements t {
    public final /* synthetic */ PlayerState a;

    public /* synthetic */ rcf(PlayerState playerState) {
        this.a = playerState;
    }

    @Override // com.spotify.mobius.t
    public final s a(Object obj) {
        return mef.c((b) obj, !this.a.isPaused());
    }
}
