package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;
import kotlin.jvm.internal.h;

/* renamed from: mnc  reason: default package */
final class mnc<T1, T2, R> implements c<PlayerState, Long, PlayerState> {
    public static final mnc a = new mnc();

    mnc() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public PlayerState a(PlayerState playerState, Long l) {
        PlayerState playerState2 = playerState;
        l.longValue();
        h.e(playerState2, "playerState1");
        return playerState2;
    }
}
