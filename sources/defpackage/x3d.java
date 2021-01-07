package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: x3d  reason: default package */
public final /* synthetic */ class x3d implements n {
    public static final /* synthetic */ x3d a = new x3d();

    private /* synthetic */ x3d() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return playerState.track().isPresent() && playerState.playbackId().isPresent();
    }
}
