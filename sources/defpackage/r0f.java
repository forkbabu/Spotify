package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: r0f  reason: default package */
public final /* synthetic */ class r0f implements n {
    public static final /* synthetic */ r0f a = new r0f();

    private /* synthetic */ r0f() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return playerState.playbackId().isPresent() && !MoreObjects.isNullOrEmpty(playerState.playbackId().get());
    }
}
