package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: s7f  reason: default package */
public final /* synthetic */ class s7f implements n {
    public final /* synthetic */ boolean a;

    public /* synthetic */ s7f(boolean z) {
        this.a = z;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return playerState.isPlaying() && !playerState.isPaused() && (this.a || "voice".equals(playerState.playOrigin().featureIdentifier()));
    }
}
