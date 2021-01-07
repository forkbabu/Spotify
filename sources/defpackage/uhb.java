package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.e;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: uhb  reason: default package */
final class uhb<T, R> implements l<PlayerState, e> {
    final /* synthetic */ whb a;
    final /* synthetic */ String b;

    uhb(whb whb, String str) {
        this.a = whb;
        this.b = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public e apply(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "playerState");
        if (!h.a(this.b, playerState2.contextUri())) {
            return whb.c(this.a, this.b);
        }
        return whb.d(this.a, !playerState2.isPaused() && playerState2.isPlaying());
    }
}
