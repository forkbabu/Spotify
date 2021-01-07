package defpackage;

import com.google.common.base.Optional;
import com.google.protobuf.ByteString;
import com.google.protobuf.u;
import com.spotify.messages.CanvasState;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import java.util.HashSet;
import java.util.Set;

/* renamed from: mm2  reason: default package */
public class mm2 {
    private static final Set<String> e = new HashSet();
    public static final /* synthetic */ int f = 0;
    private final PublishSubject<jm2> a = PublishSubject.h1();
    private final p b = new p();
    private final s<PlayerState> c;
    private final gl0<u> d;

    public mm2(g<PlayerState> gVar, gl0<u> gl0) {
        gVar.getClass();
        this.c = new v(gVar);
        this.d = gl0;
    }

    /* access modifiers changed from: private */
    public static CanvasState a(PlayerState playerState, boolean z) {
        String str;
        Optional<ContextTrack> track = playerState.track();
        CanvasState.b s = CanvasState.s();
        s.s(ByteString.h(z42.u(playerState.playbackId().or((Optional<String>) ""))));
        if (track.isPresent()) {
            str = track.get().metadata().get("canvas.id");
        } else {
            str = "";
        }
        s.o(str);
        s.p(track.transform(zl2.a).or((Optional<V>) ""));
        s.t((double) playerState.positionAsOfTimestamp().or((Optional<Long>) 0L).longValue());
        s.u("visible_full");
        s.n(playerState.isPaused() ? "paused" : "playing");
        s.m("foreground");
        s.q(z ? "loaded" : "not_loaded");
        s.r("spotify:app:canvas");
        return (CanvasState) s.build();
    }

    static /* synthetic */ Optional b(jm2 jm2, PlayerState playerState) {
        if (playerState.track().transform(zl2.a).or((Optional<V>) "").equals(jm2.a())) {
            return Optional.of(a(playerState, jm2.b()));
        }
        return Optional.absent();
    }

    public void d(String str) {
        e.add(str);
        this.a.onNext(new jm2(str, true));
    }

    public void e(String str) {
        this.a.onNext(new jm2(str, false));
    }

    public void f(String str) {
        e.remove(str);
        this.a.onNext(new jm2(str, false));
    }

    public void g() {
        p pVar = this.b;
        s E = s.k0(this.a.a1(this.c, em2.a).Q(am2.a).j0(gm2.a), this.c.Q(cm2.a).x0(dm2.a).E().j0(bm2.a)).E();
        gl0<u> gl0 = this.d;
        gl0.getClass();
        pVar.b(E.subscribe(new hm2(gl0), fm2.a));
    }

    public void h() {
        e.clear();
        this.b.a();
    }
}
