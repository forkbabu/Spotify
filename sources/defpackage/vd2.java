package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: vd2  reason: default package */
public final /* synthetic */ class vd2 implements l {
    public final /* synthetic */ cqe a;

    public /* synthetic */ vd2(cqe cqe) {
        this.a = cqe;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        cqe cqe = this.a;
        PlayerState playerState = (PlayerState) obj;
        if (playerState.isPaused()) {
            return s.h();
        }
        if (playerState.playbackSpeed().or((Optional<Double>) Double.valueOf(0.0d)).doubleValue() == 0.0d) {
            return s.g();
        }
        return s.i(playerState.position(cqe.d()).or((Optional<Long>) 0L).longValue());
    }
}
