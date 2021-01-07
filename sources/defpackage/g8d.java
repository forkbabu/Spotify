package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.music.json.e;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.sociallistening.impl.eventsources.f;
import com.spotify.music.sociallistening.models.JoinType;
import com.spotify.music.sociallistening.models.b;
import defpackage.o8d;
import io.reactivex.disposables.d;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: g8d  reason: default package */
public final class g8d implements f4d, efd {
    private final a a;
    private final io.reactivex.subjects.a<b> b;
    private final PublishSubject<o8d> c;
    private final d d = new d();
    private final d8d e;
    private final w7d f;
    private final x7d g;
    private final v7d h;
    private final g<SessionState> i;
    private final ConnectManager j;
    private final y k;
    private final y l;
    private final y m;

    /* renamed from: g8d$a */
    public static final class a extends com.spotify.music.json.d {
        a(com.spotify.music.json.g gVar, com.spotify.music.json.g gVar2) {
            super(gVar2);
        }

        @Override // com.spotify.music.json.d
        public e b(e eVar) {
            h.e(eVar, "builder");
            eVar.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            h.d(eVar, "builder.configure(\n     …TIES, false\n            )");
            return eVar;
        }
    }

    public g8d(w7d w7d, x7d x7d, v7d v7d, g<SessionState> gVar, ConnectManager connectManager, y yVar, y yVar2, y yVar3, com.spotify.music.json.g gVar2) {
        h.e(w7d, "socialConnectEndpoint");
        h.e(x7d, "socialListeningCoreEndpoint");
        h.e(v7d, "serverPushNotificationsEndpoint");
        h.e(gVar, "sessionStateFlowable");
        h.e(connectManager, "connectManager");
        h.e(yVar, "computationScheduler");
        h.e(yVar2, "mainThreadScheduler");
        h.e(yVar3, "ioScheduler");
        h.e(gVar2, "objectMapperFactory");
        this.f = w7d;
        this.g = x7d;
        this.h = v7d;
        this.i = gVar;
        this.j = connectManager;
        this.k = yVar;
        this.l = yVar2;
        this.m = yVar3;
        this.a = new a(gVar2, gVar2);
        io.reactivex.subjects.a<b> i1 = io.reactivex.subjects.a.i1(b.n);
        h.d(i1, "BehaviorSubject.createDe…alListeningState.DEFAULT)");
        this.b = i1;
        PublishSubject<o8d> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<SocialListeningImplEvent>()");
        this.c = h1;
        this.e = new d8d(yVar2);
    }

    public static final MobiusLoop.h o(g8d g8d, s sVar) {
        MobiusLoop.f h2 = i.c(e8d.a, w9d.a.b(g8d.f, g8d.g, g8d.j, g8d.e, g8d.m)).e(f8d.a).b(new c8d(0, g8d)).d(new c8d(1, g8d)).h(f.a(sVar, g8d.h, g8d.i, g8d.a, g8d.k));
        h.d(h2, "RxMobius.loop(\n         …      )\n                )");
        DebugFlag debugFlag = DebugFlag.SOCIAL_LISTENING_MOBIUS_LOGGING;
        return h2;
    }

    @Override // defpackage.f4d
    public s<b> a() {
        return this.b.E();
    }

    @Override // defpackage.f4d
    public void c(String str) {
        h.e(str, "joinToken");
        this.c.onNext(new o8d.j(str));
    }

    @Override // defpackage.f4d
    public void f() {
        this.c.onNext(o8d.l.a);
    }

    @Override // defpackage.f4d
    public void i() {
        this.c.onNext(o8d.h.a);
    }

    @Override // defpackage.f4d
    public void j(boolean z) {
        this.c.onNext(new o8d.k(z));
    }

    @Override // defpackage.f4d
    public b k() {
        b j1 = this.b.j1();
        h.c(j1);
        h.d(j1, "socialListeningStateBehaviorSubject.value!!");
        return j1;
    }

    @Override // defpackage.f4d
    public void l(String str, boolean z, JoinType joinType) {
        h.e(str, "token");
        h.e(joinType, "joinType");
        this.c.onNext(new o8d.f(str, z, joinType));
    }

    @Override // defpackage.f4d
    public s<com.spotify.music.sociallistening.models.a> m() {
        return this.e.b();
    }

    @Override // defpackage.efd
    public void start() {
        d dVar = this.d;
        s B = s.B(new l8d(this));
        h.d(B, "Observable.defer(\n      …         }\n            })");
        s h1 = B.o0(this.l).M(h8d.a, Functions.c).M(Functions.f(), new i8d(this)).N(new j8d(this)).v0(1).h1();
        h.d(h1, "socialListeningMobiusLoo…)\n            .refCount()");
        dVar.b(h1.subscribe());
    }

    @Override // defpackage.efd
    public void stop() {
        this.d.b(EmptyDisposable.INSTANCE);
    }
}
