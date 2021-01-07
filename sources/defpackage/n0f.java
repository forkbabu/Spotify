package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: n0f  reason: default package */
public final /* synthetic */ class n0f implements n {
    public static final /* synthetic */ n0f a = new n0f();

    private /* synthetic */ n0f() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return playerState.track().isPresent() && !kxd.f(playerState.track().get());
    }
}
