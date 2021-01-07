package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: xo3  reason: default package */
public final /* synthetic */ class xo3 implements l {
    public static final /* synthetic */ xo3 a = new xo3();

    private /* synthetic */ xo3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return Boolean.valueOf(playerState.isPlaying() && !playerState.isPaused());
    }
}
