package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.d0;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.k;
import io.reactivex.s;
import io.reactivex.z;

/* access modifiers changed from: package-private */
/* renamed from: io6  reason: default package */
public class io6 {
    private final cfc a;
    private final d b;
    private final g<PlayerState> c;
    private final cqe d;
    private final bre e;
    private final k<PlayerState, Boolean> f = new mn6(this);
    private final k<PlayerState, Boolean> g = new nn6(this);
    private final k<PlayerState, uo6> h = new a();

    /* access modifiers changed from: package-private */
    /* renamed from: io6$a */
    public class a implements k<PlayerState, uo6> {
        a() {
        }

        @Override // io.reactivex.k
        public tpf<uo6> a(g<PlayerState> gVar) {
            return gVar.O(new ln6(this));
        }
    }

    io6(String str, d dVar, g<PlayerState> gVar, cqe cqe, bre bre) {
        this.a = new cfc(str);
        this.b = dVar;
        this.c = gVar;
        this.d = cqe;
        this.e = bre;
    }

    /* access modifiers changed from: private */
    public boolean d(PlayerState playerState) {
        return new cfc(playerState.contextUri()).equals(this.a) && playerState.isPlaying();
    }

    /* access modifiers changed from: private */
    public boolean f(PlayerState playerState) {
        return d(playerState) && !playerState.isPaused();
    }

    private LoggingParams l(String str) {
        return LoggingParams.builder().interactionId(str).commandInitiatedTime(Long.valueOf(this.d.d())).pageInstanceId(this.e.get()).build();
    }

    public s<Boolean> b(String str) {
        return new v(this.c.F(new un6(this, str)));
    }

    public s<Boolean> c() {
        g<R> l = this.c.l(this.f);
        l.getClass();
        return new v(l);
    }

    public s<Boolean> e() {
        g<R> l = this.c.l(this.g);
        l.getClass();
        return new v(l);
    }

    public tpf h(String str, PlayerState playerState) {
        return g.N(Boolean.valueOf(str.equals(playerState.track().transform(gn6.a).orNull()) && d(playerState)));
    }

    public e i(String str, String str2, PlayerState playerState) {
        io.reactivex.a aVar = b.a;
        if (!f(playerState)) {
            return aVar;
        }
        Optional<ContextTrack> track = playerState.track();
        if (!track.isPresent() || !playerState.restrictions().disallowSkippingNextReasons().isEmpty() || !rw.equal(track.get().uri(), str)) {
            return aVar;
        }
        z<zwd> a2 = this.b.a(c.j(SkipToNextTrackCommand.builder().loggingParams(l(str2)).build()));
        a2.getClass();
        return new i(a2);
    }

    public d0 j(String str, PlayerState playerState) {
        if (f(playerState)) {
            return this.b.a(c.d(PauseCommand.builder().loggingParams(l(str)).build())).A(rn6.a);
        }
        if (d(playerState) && playerState.isPaused()) {
            return this.b.a(c.f(ResumeCommand.builder().loggingParams(l(str)).build())).A(pn6.a);
        }
        return z.z(Optional.absent());
    }

    public s<uo6> m() {
        return new v(this.c.l(this.h).s());
    }

    public io.reactivex.a n(String str, String str2) {
        return this.c.E().t(new sn6(this, str, str2));
    }

    public z<Optional<Boolean>> o(String str) {
        return this.c.E().s(new qn6(this, str));
    }
}
