package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: u7f  reason: default package */
public final /* synthetic */ class u7f implements n {
    public static final /* synthetic */ u7f a = new u7f();

    private /* synthetic */ u7f() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return playerState.track().isPresent() && !kxd.f(playerState.track().get());
    }
}
