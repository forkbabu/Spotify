package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: xq3  reason: default package */
public final /* synthetic */ class xq3 implements n {
    public static final /* synthetic */ xq3 a = new xq3();

    private /* synthetic */ xq3() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return playerState.isPlaying() && playerState.track().isPresent();
    }
}
