package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* renamed from: cx7  reason: default package */
final class cx7<T> implements n<PlayerState> {
    public static final cx7 a = new cx7();

    cx7() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "it");
        Optional<ContextTrack> track = playerState2.track();
        h.d(track, "it.track()");
        return track.isPresent();
    }
}
