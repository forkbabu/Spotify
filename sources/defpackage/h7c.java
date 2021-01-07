package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.nowplaying.videoads.widget.view.c;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: h7c  reason: default package */
public class h7c {
    private final g<PlayerState> a;
    private final cqe b;
    private final p c = new p();
    private c d;

    public h7c(g<PlayerState> gVar, cqe cqe) {
        this.a = gVar;
        this.b = cqe;
    }

    public static void a(h7c h7c, PlayerState playerState) {
        long longValue = playerState.position(h7c.b.d()).or((Optional<Long>) 0L).longValue();
        long longValue2 = playerState.duration().or((Optional<Long>) 0L).longValue();
        Optional<Double> playbackSpeed = playerState.playbackSpeed();
        Double valueOf = Double.valueOf(0.0d);
        long j = playbackSpeed.or(valueOf).doubleValue() == 0.0d ? longValue : longValue2;
        h7c.d.a(longValue2);
        h7c.d.b(longValue, j, playerState.playbackSpeed().or((Optional<Double>) valueOf).floatValue());
    }

    public void b(c cVar) {
        this.d = cVar;
        this.c.b(this.a.subscribe(new v6c(this)));
    }

    public void c() {
        this.c.a();
    }
}
