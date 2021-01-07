package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: mub  reason: default package */
public final /* synthetic */ class mub implements l {
    public static final /* synthetic */ mub a = new mub();

    private /* synthetic */ mub() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return Boolean.valueOf(playerState.playbackSpeed().or(Double.valueOf(0.0d)).doubleValue() > 0.1d && !playerState.isPaused());
    }
}
