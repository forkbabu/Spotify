package defpackage;

import android.os.Build;
import com.google.common.base.Optional;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.j;
import com.spotify.messages.AudioRouteSegmentEnd;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* renamed from: cea  reason: default package */
public final class cea implements oea {
    private static final String k = "cea";
    private final q a = new q();
    private gea b;
    private String c;
    private ConnectManager.ConnectState d;
    private final dea e;
    private final gl0<u> f;
    private final io.reactivex.g<PlayerState> g;
    private final y h;
    private final iea i;
    private final j j;

    /* renamed from: cea$a */
    /* compiled from: java-style lambda group */
    static final class a<T> implements io.reactivex.functions.g<Throwable> {
        public static final a b = new a(0);
        public static final a c = new a(1);
        public static final a f = new a(2);
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public final void accept(Throwable th) {
            int i = this.a;
            if (i == 0) {
                Assertion.g(th.toString());
            } else if (i == 1) {
                Assertion.g(th.toString());
            } else if (i == 2) {
                Assertion.g(th.toString());
            } else {
                throw null;
            }
        }
    }

    /* renamed from: cea$b */
    static final class b<T> implements io.reactivex.functions.g<String> {
        final /* synthetic */ cea a;

        b(cea cea, s sVar, s sVar2) {
            this.a = cea;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(String str) {
            String str2 = str;
            cea cea = this.a;
            kotlin.jvm.internal.h.d(str2, "it");
            cea.d(cea, str2);
        }
    }

    /* renamed from: cea$c */
    static final class c<T> implements io.reactivex.functions.g<Pair<? extends gea, ? extends String>> {
        final /* synthetic */ cea a;

        c(cea cea, s sVar, s sVar2) {
            this.a = cea;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Pair<? extends gea, ? extends String> pair) {
            Pair<? extends gea, ? extends String> pair2 = pair;
            cea cea = this.a;
            Object c = pair2.c();
            kotlin.jvm.internal.h.d(c, "it.first");
            Object d = pair2.d();
            kotlin.jvm.internal.h.d(d, "it.second");
            cea.e(cea, (gea) c, (String) d);
        }
    }

    /* renamed from: cea$d */
    static final class d<T> implements io.reactivex.functions.g<ConnectManager.ConnectState> {
        final /* synthetic */ cea a;

        d(cea cea, s sVar, s sVar2) {
            this.a = cea;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(ConnectManager.ConnectState connectState) {
            ConnectManager.ConnectState connectState2 = connectState;
            cea cea = this.a;
            kotlin.jvm.internal.h.d(connectState2, "it");
            cea.c(cea, connectState2);
        }
    }

    /* renamed from: cea$e */
    static final class e<T, R> implements l<PlayerState, Optional<String>> {
        public static final e a = new e();

        e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Optional<String> apply(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            kotlin.jvm.internal.h.e(playerState2, "it");
            return playerState2.playbackId();
        }
    }

    /* renamed from: cea$f */
    static final class f<T> implements n<Optional<String>> {
        public static final f a = new f();

        f() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(Optional<String> optional) {
            Optional<String> optional2 = optional;
            kotlin.jvm.internal.h.e(optional2, "it");
            return optional2.isPresent();
        }
    }

    /* renamed from: cea$g */
    static final class g<T, R> implements l<Optional<String>, String> {
        public static final g a = new g();

        g() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public String apply(Optional<String> optional) {
            Optional<String> optional2 = optional;
            kotlin.jvm.internal.h.e(optional2, "it");
            return optional2.get();
        }
    }

    /* renamed from: cea$h */
    static final class h<T1, T2, R> implements io.reactivex.functions.c<gea, String, Pair<? extends gea, ? extends String>> {
        public static final h a = new h();

        h() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public Pair<? extends gea, ? extends String> a(gea gea, String str) {
            gea gea2 = gea;
            String str2 = str;
            kotlin.jvm.internal.h.e(gea2, "route");
            kotlin.jvm.internal.h.e(str2, "playbackId");
            return new Pair<>(gea2, str2);
        }
    }

    /* renamed from: cea$i */
    static final class i<T, R> implements l<gea, gea> {
        final /* synthetic */ cea a;

        i(cea cea) {
            this.a = cea;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public gea apply(gea gea) {
            gea gea2 = gea;
            kotlin.jvm.internal.h.e(gea2, "route");
            return cea.b(this.a, gea2);
        }
    }

    public cea(dea dea, gl0<u> gl0, io.reactivex.g<PlayerState> gVar, y yVar, iea iea, j jVar) {
        kotlin.jvm.internal.h.e(dea, "audioRouteChangeController");
        kotlin.jvm.internal.h.e(gl0, "eventPublisher");
        kotlin.jvm.internal.h.e(gVar, "playerStateFlowable");
        kotlin.jvm.internal.h.e(yVar, "mainThreadScheduler");
        kotlin.jvm.internal.h.e(iea, "bluetoothA2dpRouteDeviceMatcher");
        kotlin.jvm.internal.h.e(jVar, "connectCore");
        this.e = dea;
        this.f = gl0;
        this.g = gVar;
        this.h = yVar;
        this.i = iea;
        this.j = jVar;
    }

    public static final gea b(cea cea, gea gea) {
        String a2;
        return (cea.f(gea) || gea.e() != 8 || (a2 = cea.i.a(gea)) == null) ? gea : gea.a(gea, a2, 0, null, null, 14);
    }

    public static final void c(cea cea, ConnectManager.ConnectState connectState) {
        cea.d = connectState;
        if (connectState == ConnectManager.ConnectState.ACTIVE) {
            gea gea = cea.b;
            String str = cea.c;
            if (gea != null && str != null) {
                cea.g(gea, str);
            }
        }
    }

    public static final void d(cea cea, String str) {
        if (!(cea.d == ConnectManager.ConnectState.ACTIVE)) {
            gea gea = cea.b;
            String str2 = cea.c;
            if (!(gea == null || str2 == null)) {
                cea.g(gea, str2);
            }
            cea.c = str;
        }
    }

    public static final void e(cea cea, gea gea, String str) {
        gea gea2 = cea.b;
        if (!(kotlin.jvm.internal.h.a(gea.d(), gea2 != null ? gea2.d() : null) && kotlin.jvm.internal.h.a(gea.b(), gea2.b()) && gea.e() == gea2.e())) {
            Logger.b("onRouteChange: %s, last route: %s", gea, cea.b);
            String str2 = cea.b != null ? "route_change" : "start_playback";
            AudioRouteSegmentEnd.b r = AudioRouteSegmentEnd.r();
            r.t(str2);
            r.o(gea.f());
            r.m(gea.c());
            r.p(str);
            if (cea.f(gea)) {
                kotlin.jvm.internal.h.d(r, "builder");
                r.n(gea.d());
            }
            gea gea3 = cea.b;
            if (gea3 != null) {
                kotlin.jvm.internal.h.d(r, "builder");
                r.s(gea3.f());
                r.q(gea3.c());
                if (cea.f(gea3)) {
                    r.r(gea3.d());
                }
            }
            GeneratedMessageLite build = r.build();
            kotlin.jvm.internal.h.d(build, "builder.build()");
            AudioRouteSegmentEnd audioRouteSegmentEnd = (AudioRouteSegmentEnd) build;
            Logger.b("logging audio route segment end: %s", audioRouteSegmentEnd);
            cea.f.c(audioRouteSegmentEnd);
            cea.b = gea;
        }
    }

    private final boolean f(gea gea) {
        return (gea.d().length() > 0) && (kotlin.jvm.internal.h.a(gea.d(), Build.MODEL) ^ true);
    }

    private final void g(gea gea, String str) {
        AudioRouteSegmentEnd.b r = AudioRouteSegmentEnd.r();
        r.t("end_song");
        r.o(gea.f());
        r.m(gea.c());
        r.p(str);
        if (f(gea)) {
            kotlin.jvm.internal.h.d(r, "builder");
            r.n(gea.d());
        }
        GeneratedMessageLite build = r.build();
        kotlin.jvm.internal.h.d(build, "builder.build()");
        AudioRouteSegmentEnd audioRouteSegmentEnd = (AudioRouteSegmentEnd) build;
        Logger.b("logging audio route segment end: %s", audioRouteSegmentEnd);
        this.f.c(audioRouteSegmentEnd);
    }

    @Override // defpackage.oea
    public String a() {
        gea gea = this.b;
        if (gea != null) {
            return gea.c();
        }
        return null;
    }

    public final void h() {
        this.e.start();
        v vVar = new v(this.g.O(e.a).C(f.a).O(g.a).s());
        s n = s.n(this.e.c().Q0(500, TimeUnit.MILLISECONDS, this.h).j0(new i(this)), vVar, h.a);
        kotlin.jvm.internal.h.d(n, "Observable.combineLatest…to playbackId }\n        )");
        q qVar = this.a;
        qVar.a(vVar.subscribe(new b(this, vVar, n), a.b));
        qVar.a(n.subscribe(new c(this, vVar, n), a.c));
        qVar.a(this.j.h(k).E().subscribe(new d(this, vVar, n), a.f));
    }

    public final void i() {
        this.e.stop();
        this.a.c();
        this.b = null;
        this.c = null;
    }
}
