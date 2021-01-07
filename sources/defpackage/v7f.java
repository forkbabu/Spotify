package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: v7f  reason: default package */
public final /* synthetic */ class v7f implements n {
    public static final /* synthetic */ v7f a = new v7f();

    private /* synthetic */ v7f() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return playerState.playbackId().isPresent() && !MoreObjects.isNullOrEmpty(playerState.playbackId().get());
    }
}
