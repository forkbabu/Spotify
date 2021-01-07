package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: mjc  reason: default package */
public final /* synthetic */ class mjc implements l {
    public final /* synthetic */ y a;

    public /* synthetic */ mjc(y yVar) {
        this.a = yVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        y yVar = this.a;
        PlayerState playerState = (PlayerState) obj;
        if (!playerState.isPaused() && playerState.isPlaying()) {
            return s.n(s.i0(playerState), s.f0(0, 15, TimeUnit.SECONDS, yVar), njc.a);
        }
        return s.i0(playerState);
    }
}
