package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: rgf  reason: default package */
public final /* synthetic */ class rgf implements l {
    public static final /* synthetic */ rgf a = new rgf();

    private /* synthetic */ rgf() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        if (!playerState.track().isPresent() || playerState.isPaused()) {
            return ugf.b();
        }
        return ugf.c(playerState.contextUri(), playerState.track().get().uri());
    }
}
