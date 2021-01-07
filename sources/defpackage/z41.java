package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.t;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.play.f;
import io.reactivex.disposables.a;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: z41  reason: default package */
public class z41 {
    private final g<PlayerState> a;
    private final f b;
    private final d c;
    private final lxd d;
    private final t e;
    private final c51 f;
    private final a g = new a();
    private final y h;
    private final oc1 i;
    private final ConnectManager j;
    private final j4a k;
    private final s<Boolean> l;
    private final o4a m;
    private final d51 n;
    private final bre o;
    private PlayerState p = PlayerState.EMPTY;

    z41(y yVar, j4a j4a, s<Boolean> sVar, g<PlayerState> gVar, f fVar, d dVar, lxd lxd, t tVar, c51 c51, oc1 oc1, ConnectManager connectManager, o4a o4a, d51 d51, bre bre) {
        this.h = yVar;
        this.k = j4a;
        this.l = sVar;
        this.a = gVar;
        this.b = fVar;
        this.c = dVar;
        this.d = lxd;
        this.e = tVar;
        this.f = c51;
        this.i = oc1;
        this.j = connectManager;
        this.m = o4a;
        this.n = d51;
        this.o = bre;
    }

    public static void a(z41 z41, PlayerContext playerContext) {
        z41.g.b(z41.b.a(z41.d.a(Context.fromUri(playerContext.uri())).loggingParams(LoggingParams.builder().interactionId(((e51) z41.n).a(playerContext.uri())).pageInstanceId(z41.o.get()).build()).build()).subscribe());
    }

    public /* synthetic */ void b(PlayerState playerState) {
        this.p = playerState;
    }

    public Boolean c(Boolean bool, GaiaDevice gaiaDevice) {
        return Boolean.valueOf(bool.booleanValue() && !this.i.a(gaiaDevice));
    }

    public void d(Boolean bool, Throwable th) {
        Optional<ContextTrack> track = this.p.track();
        this.e.d();
        if (track.isPresent()) {
            ContextTrack contextTrack = track.get();
            if (!kxd.l(contextTrack) || Boolean.parseBoolean(contextTrack.metadata().get("is_backgroundable"))) {
                this.g.b(this.c.a(c.e()).subscribe());
                return;
            }
        }
        this.g.b(this.f.a().n(q41.a).subscribe(new r41(this)));
    }

    public void e() {
        this.g.e(this.a.subscribe(new v41(this)), s.m(this.a.C(u41.a).E().P(), this.k.b(), this.l, x41.a).a1(this.j.p(z41.class.getSimpleName()), new t41(this)).a1(this.m.b().j0(s41.a).G0((R) Boolean.FALSE), w41.a).Q(o41.a).T().B(this.h).subscribe(new p41(this)));
    }

    public void f() {
        this.g.f();
    }
}
