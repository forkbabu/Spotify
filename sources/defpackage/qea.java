package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.providers.v;
import com.spotify.messages.ExternalAccessoryRemoteInteraction;
import com.spotify.ubi.specification.factories.z0;
import defpackage.lea;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.z;

/* renamed from: qea  reason: default package */
public final class qea implements pea {
    private final z0 a = new z0();
    private final gl0<u> b;
    private final tea c;
    private final v d;
    private final ere e;
    private final oea f;
    private final lea g;

    /* renamed from: qea$a */
    static final class a<T, R> implements l<String, nqe> {
        final /* synthetic */ qea a;
        final /* synthetic */ boolean b;

        a(qea qea, boolean z) {
            this.a = qea;
            this.b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public nqe apply(String str) {
            String str2 = str;
            kotlin.jvm.internal.h.e(str2, "trackUri");
            if (this.b) {
                return this.a.a.f(str2);
            }
            return this.a.a.j(str2);
        }
    }

    /* renamed from: qea$b */
    static final class b<T, R> implements l<nqe, d0<? extends String>> {
        final /* synthetic */ qea a;
        final /* synthetic */ boolean b;
        final /* synthetic */ yda c;

        b(qea qea, boolean z, yda yda) {
            this.a = qea;
            this.b = z;
            this.c = yda;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends String> apply(nqe nqe) {
            nqe nqe2 = nqe;
            kotlin.jvm.internal.h.e(nqe2, "event");
            Logger.b("log like: %s, isLiked ? %s, %s", nqe2, Boolean.valueOf(this.b), this.c);
            return qea.D(this.a, this.c, nqe2, null, 4);
        }
    }

    /* renamed from: qea$c */
    static final class c<T, R> implements l<String, d0<? extends String>> {
        final /* synthetic */ qea a;
        final /* synthetic */ yda b;

        c(qea qea, yda yda) {
            this.a = qea;
            this.b = yda;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends String> apply(String str) {
            String str2 = str;
            kotlin.jvm.internal.h.e(str2, "trackUri");
            Logger.b("log pause: %s, %s", str2, this.b);
            qea qea = this.a;
            yda yda = this.b;
            nqe g = qea.a.g(str2);
            kotlin.jvm.internal.h.d(g, "ubiEventFactory.hitPause(trackUri)");
            return qea.D(qea, yda, g, null, 4);
        }
    }

    /* renamed from: qea$d */
    static final class d<T, R> implements l<String, d0<? extends String>> {
        final /* synthetic */ qea a;
        final /* synthetic */ yda b;

        d(qea qea, yda yda) {
            this.a = qea;
            this.b = yda;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends String> apply(String str) {
            String str2 = str;
            kotlin.jvm.internal.h.e(str2, "trackUri");
            Logger.b("log resume: %s, %s", str2, this.b);
            qea qea = this.a;
            yda yda = this.b;
            nqe n = qea.a.n(str2);
            kotlin.jvm.internal.h.d(n, "ubiEventFactory.hitResume(trackUri)");
            return qea.D(qea, yda, n, null, 4);
        }
    }

    /* renamed from: qea$e */
    static final class e<T, R> implements l<String, nqe> {
        final /* synthetic */ qea a;
        final /* synthetic */ int b;

        e(qea qea, int i) {
            this.a = qea;
            this.b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public nqe apply(String str) {
            String str2 = str;
            kotlin.jvm.internal.h.e(str2, "trackUri");
            return this.a.a.r(str2, Integer.valueOf(this.b));
        }
    }

    /* renamed from: qea$f */
    static final class f<T, R> implements l<nqe, d0<? extends String>> {
        final /* synthetic */ qea a;
        final /* synthetic */ int b;
        final /* synthetic */ yda c;

        f(qea qea, int i, yda yda) {
            this.a = qea;
            this.b = i;
            this.c = yda;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends String> apply(nqe nqe) {
            nqe nqe2 = nqe;
            kotlin.jvm.internal.h.e(nqe2, "event");
            Logger.b("log set speed: %s, %s", Integer.valueOf(this.b), this.c);
            return qea.D(this.a, this.c, nqe2, null, 4);
        }
    }

    /* renamed from: qea$g */
    static final class g<T, R> implements l<String, d0<? extends String>> {
        final /* synthetic */ qea a;
        final /* synthetic */ yda b;

        g(qea qea, yda yda) {
            this.a = qea;
            this.b = yda;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends String> apply(String str) {
            String str2 = str;
            kotlin.jvm.internal.h.e(str2, "uriToBeSkipped");
            Logger.b("log skip to next: %s, %s", str2, this.b);
            qea qea = this.a;
            yda yda = this.b;
            nqe v = qea.a.v(str2);
            kotlin.jvm.internal.h.d(v, "ubiEventFactory.hitSkipToNext(uriToBeSkipped)");
            return qea.D(qea, yda, v, null, 4);
        }
    }

    /* renamed from: qea$h */
    static final class h<T, R> implements l<String, d0<? extends String>> {
        final /* synthetic */ qea a;
        final /* synthetic */ yda b;

        h(qea qea, yda yda) {
            this.a = qea;
            this.b = yda;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends String> apply(String str) {
            String str2 = str;
            kotlin.jvm.internal.h.e(str2, "uriToBeSkipped");
            Logger.b("log skip to previous: %s, %s", str2, this.b);
            qea qea = this.a;
            yda yda = this.b;
            nqe w = qea.a.w(str2);
            kotlin.jvm.internal.h.d(w, "ubiEventFactory.hitSkipToPrevious(uriToBeSkipped)");
            return qea.D(qea, yda, w, null, 4);
        }
    }

    public qea(gl0<u> gl0, tea tea, v vVar, ere ere, oea oea, lea lea) {
        kotlin.jvm.internal.h.e(gl0, "gabitoEventSender");
        kotlin.jvm.internal.h.e(tea, "playerStatePreconditions");
        kotlin.jvm.internal.h.e(vVar, "remoteActiveDeviceLoggingIdProvider");
        kotlin.jvm.internal.h.e(ere, "ubiEventSender");
        kotlin.jvm.internal.h.e(oea, "currentAudioRouteIdProvider");
        kotlin.jvm.internal.h.e(lea, "connectedA2dpDevicesProvider");
        this.b = gl0;
        this.c = tea;
        this.d = vVar;
        this.e = ere;
        this.f = oea;
        this.g = lea;
    }

    private final boolean C(String str) {
        return (kotlin.jvm.internal.h.a("", str) ^ true) && (kotlin.jvm.internal.h.a("unknown", str) ^ true);
    }

    static z D(qea qea, yda yda, nqe nqe, nqe nqe2, int i) {
        int i2 = i & 4;
        qea.getClass();
        z h2 = z.h(new rea(qea, nqe, yda));
        kotlin.jvm.internal.h.d(h2, "Single.defer {\n         …entToSend.id())\n        }");
        return h2;
    }

    public static final ExternalAccessoryRemoteInteraction w(qea qea, yda yda, nqe nqe, String str, String str2) {
        qea.getClass();
        ExternalAccessoryRemoteInteraction.b z = ExternalAccessoryRemoteInteraction.z();
        z.q(nqe.e().d());
        z.v(nqe.b());
        String d2 = yda.d();
        kotlin.jvm.internal.h.d(d2, "description.integrationType");
        String str3 = "app_to_app";
        if (qea.C(d2)) {
            String d3 = yda.d();
            kotlin.jvm.internal.h.d(d3, "description.integrationType");
            String i = yda.i();
            kotlin.jvm.internal.h.d(i, "description.transportType");
            if (!(kotlin.jvm.internal.h.a("inter_app", d3) && kotlin.jvm.internal.h.a("bluetooth", i))) {
                kotlin.jvm.internal.h.d(z, "builder");
                String d4 = yda.d();
                kotlin.jvm.internal.h.d(d4, "description.integrationType");
                String i2 = yda.i();
                kotlin.jvm.internal.h.d(i2, "description.transportType");
                if (kotlin.jvm.internal.h.a(d4, "AndroidAuto")) {
                    d4 = "android_auto";
                } else if (kotlin.jvm.internal.h.a(d4, "inter_app") && kotlin.jvm.internal.h.a(i2, str3)) {
                    d4 = "app_remote";
                } else if (kotlin.jvm.internal.h.a(d4, "SpotifyGo") || kotlin.jvm.internal.h.a(d4, "SpotOn")) {
                    d4 = "spotify_one_touch";
                }
                z.u(d4);
            }
        }
        String g2 = yda.g();
        kotlin.jvm.internal.h.d(g2, "description.protocol");
        if (qea.C(g2)) {
            kotlin.jvm.internal.h.d(z, "builder");
            z.x(yda.g());
        }
        String i3 = yda.i();
        kotlin.jvm.internal.h.d(i3, "description.transportType");
        if (qea.C(i3)) {
            kotlin.jvm.internal.h.d(z, "builder");
            String i4 = yda.i();
            kotlin.jvm.internal.h.d(i4, "description.transportType");
            if (!kotlin.jvm.internal.h.a(i4, "android_media_session")) {
                str3 = i4;
            }
            z.A(str3);
        }
        String a2 = yda.a();
        kotlin.jvm.internal.h.d(a2, "description.category");
        if (qea.C(a2)) {
            kotlin.jvm.internal.h.d(z, "builder");
            z.p(yda.a());
        }
        String f2 = yda.f();
        kotlin.jvm.internal.h.d(f2, "description.name");
        if (qea.C(f2)) {
            kotlin.jvm.internal.h.d(z, "builder");
            z.o(yda.f());
        }
        String c2 = yda.c();
        kotlin.jvm.internal.h.d(c2, "description.company");
        if (qea.C(c2)) {
            kotlin.jvm.internal.h.d(z, "builder");
            z.s(yda.c());
        }
        String e2 = yda.e();
        kotlin.jvm.internal.h.d(e2, "description.model");
        if (qea.C(e2)) {
            kotlin.jvm.internal.h.d(z, "builder");
            z.w(yda.e());
        }
        String j = yda.j();
        kotlin.jvm.internal.h.d(j, "description.version");
        if (qea.C(j)) {
            kotlin.jvm.internal.h.d(z, "builder");
            z.B(yda.j());
        }
        String b2 = yda.b();
        kotlin.jvm.internal.h.d(b2, "description.clientId");
        if (qea.C(b2)) {
            kotlin.jvm.internal.h.d(z, "builder");
            z.t(yda.b());
        }
        String h2 = yda.h();
        kotlin.jvm.internal.h.d(h2, "description.senderId");
        if (qea.C(h2)) {
            kotlin.jvm.internal.h.d(z, "builder");
            z.z(yda.h());
        }
        if (str != null) {
            kotlin.jvm.internal.h.d(z, "builder");
            z.y(str);
        }
        if (str2 != null) {
            kotlin.jvm.internal.h.d(z, "builder");
            z.r(str2);
        }
        kotlin.jvm.internal.h.d(z, "builder");
        if (kotlin.jvm.internal.h.a(z.m(), "com.android.bluetooth") && !z.n()) {
            Logger.b("Attempting to find BT name of the remote accessory..", new Object[0]);
            lea.a a3 = qea.g.a();
            if (a3 != null) {
                Logger.b("Only one BT device connected, matching name with it", new Object[0]);
                z.o(a3.b());
            }
        }
        GeneratedMessageLite build = z.build();
        kotlin.jvm.internal.h.d(build, "builder.build()");
        return (ExternalAccessoryRemoteInteraction) build;
    }

    @Override // defpackage.pea
    public z<String> a(yda yda) {
        kotlin.jvm.internal.h.e(yda, "description");
        Logger.b("log repeat one: %s", yda);
        nqe m = this.a.m();
        kotlin.jvm.internal.h.d(m, "ubiEventFactory.hitRepeatOneEnable()");
        return D(this, yda, m, null, 4);
    }

    @Override // defpackage.pea
    public z<String> b(yda yda) {
        kotlin.jvm.internal.h.e(yda, "description");
        Logger.b("log increase volume: %s", yda);
        nqe e2 = this.a.e();
        kotlin.jvm.internal.h.d(e2, "ubiEventFactory.hitIncreaseVolume()");
        return D(this, yda, e2, null, 4);
    }

    @Override // defpackage.pea
    public z<String> c(yda yda, long j) {
        kotlin.jvm.internal.h.e(yda, "description");
        Logger.b("log seek by: %s, %s", Long.valueOf(j), yda);
        nqe p = this.a.p(Integer.valueOf((int) j));
        kotlin.jvm.internal.h.d(p, "ubiEventFactory.hitSeekB…e(msSeekedOffset.toInt())");
        return D(this, yda, p, null, 4);
    }

    @Override // defpackage.pea
    public z<String> d(yda yda) {
        kotlin.jvm.internal.h.e(yda, "description");
        Logger.b("log decrease volume: %s", yda);
        nqe c2 = this.a.c();
        kotlin.jvm.internal.h.d(c2, "ubiEventFactory.hitDecreaseVolume()");
        return D(this, yda, c2, null, 4);
    }

    @Override // defpackage.pea
    public z<String> e(yda yda, float f2) {
        kotlin.jvm.internal.h.e(yda, "description");
        int i = (int) (f2 * ((float) 100));
        Logger.b("log set volume: %s, %d", yda, Integer.valueOf(i));
        nqe s = this.a.s(Integer.valueOf(i));
        kotlin.jvm.internal.h.d(s, "ubiEventFactory.hitSetVolume(volume)");
        return D(this, yda, s, null, 4);
    }

    @Override // defpackage.pea
    public z<String> f(yda yda) {
        kotlin.jvm.internal.h.e(yda, "description");
        z<R> s = this.c.a().s(new h(this, yda));
        kotlin.jvm.internal.h.d(s, "playerStatePreconditions…          )\n            }");
        return s;
    }

    @Override // defpackage.pea
    public z<String> g(yda yda, long j) {
        kotlin.jvm.internal.h.e(yda, "description");
        Logger.b("log seek to: %s, %s", Long.valueOf(j), yda);
        nqe q = this.a.q(Integer.valueOf((int) j));
        kotlin.jvm.internal.h.d(q, "ubiEventFactory.hitSeekToTime(msToSeekTo.toInt())");
        return D(this, yda, q, null, 4);
    }

    @Override // defpackage.pea
    public z<String> h(yda yda) {
        kotlin.jvm.internal.h.e(yda, "description");
        z<R> s = this.c.a().s(new d(this, yda));
        kotlin.jvm.internal.h.d(s, "playerStatePreconditions…(trackUri))\n            }");
        return s;
    }

    @Override // defpackage.pea
    public z<String> i(yda yda, boolean z) {
        kotlin.jvm.internal.h.e(yda, "description");
        Logger.b("log shuffle, enable = %s : %s", Boolean.valueOf(z), yda);
        nqe u = z ? this.a.u() : this.a.t();
        kotlin.jvm.internal.h.d(u, "event");
        return D(this, yda, u, null, 4);
    }

    @Override // defpackage.pea
    public z<String> j(yda yda, boolean z) {
        kotlin.jvm.internal.h.e(yda, "description");
        z<R> s = this.c.a().A(new a(this, z)).s(new b(this, z, yda));
        kotlin.jvm.internal.h.d(s, "playerStatePreconditions…ion, event)\n            }");
        return s;
    }

    @Override // defpackage.pea
    public z<String> k(yda yda, int i) {
        kotlin.jvm.internal.h.e(yda, "description");
        z<R> s = this.c.a().A(new e(this, i)).s(new f(this, i, yda));
        kotlin.jvm.internal.h.d(s, "playerStatePreconditions…ion, event)\n            }");
        return s;
    }

    @Override // defpackage.pea
    public z<String> l(yda yda, String str) {
        kotlin.jvm.internal.h.e(yda, "description");
        kotlin.jvm.internal.h.e(str, "query");
        Logger.b("log search: %s %s", str, yda);
        nqe o = this.a.o();
        kotlin.jvm.internal.h.d(o, "ubiEventFactory.hitSearch()");
        return D(this, yda, o, null, 4);
    }

    @Override // defpackage.pea
    public z<String> m(yda yda) {
        kotlin.jvm.internal.h.e(yda, "description");
        String b2 = this.d.b();
        Logger.b("log disconnect from remote device: %s %s", yda, b2);
        z0 z0Var = this.a;
        kotlin.jvm.internal.h.c(b2);
        nqe d2 = z0Var.d(b2);
        kotlin.jvm.internal.h.d(d2, "ubiEventFactory.hitDisco…eDevice(remoteDeviceId!!)");
        return D(this, yda, d2, null, 4);
    }

    @Override // defpackage.pea
    public z<String> n(yda yda, String str, nqe nqe) {
        kotlin.jvm.internal.h.e(yda, "description");
        kotlin.jvm.internal.h.e(str, "uriToPlay");
        Logger.b("log play: %s, %s", str, yda);
        nqe h2 = this.a.h(str);
        kotlin.jvm.internal.h.d(h2, "ubiEventFactory.hitPlay(uriToPlay)");
        if (nqe == null) {
            nqe = h2;
        }
        z<String> h3 = z.h(new rea(this, nqe, yda));
        kotlin.jvm.internal.h.d(h3, "Single.defer {\n         …entToSend.id())\n        }");
        return h3;
    }

    @Override // defpackage.pea
    public z<String> o(yda yda) {
        kotlin.jvm.internal.h.e(yda, "description");
        Logger.b("log repeat off: %s", yda);
        nqe k = this.a.k();
        kotlin.jvm.internal.h.d(k, "ubiEventFactory.hitRepeatDisable()");
        return D(this, yda, k, null, 4);
    }

    @Override // defpackage.pea
    public z<String> p(yda yda) {
        kotlin.jvm.internal.h.e(yda, "description");
        Logger.b("log repeat all: %s", yda);
        nqe l = this.a.l();
        kotlin.jvm.internal.h.d(l, "ubiEventFactory.hitRepeatEnable()");
        return D(this, yda, l, null, 4);
    }

    @Override // defpackage.pea
    public z<String> q(yda yda, String str) {
        kotlin.jvm.internal.h.e(yda, "description");
        kotlin.jvm.internal.h.e(str, "destinationUri");
        Logger.b("log ui navigate: %s, %s", str, yda);
        nqe x = this.a.x(str);
        kotlin.jvm.internal.h.d(x, "ubiEventFactory.hitUiNavigate(destinationUri)");
        return D(this, yda, x, null, 4);
    }

    @Override // defpackage.pea
    public z<String> r(yda yda) {
        kotlin.jvm.internal.h.e(yda, "description");
        Logger.b("log play something: %s", yda);
        nqe i = this.a.i();
        kotlin.jvm.internal.h.d(i, "ubiEventFactory.hitPlaySomething()");
        return D(this, yda, i, null, 4);
    }

    @Override // defpackage.pea
    public z<String> s(yda yda) {
        kotlin.jvm.internal.h.e(yda, "description");
        z<R> s = this.c.a().s(new g(this, yda));
        kotlin.jvm.internal.h.d(s, "playerStatePreconditions…          )\n            }");
        return s;
    }

    @Override // defpackage.pea
    public z<String> t(yda yda, String str) {
        kotlin.jvm.internal.h.e(yda, "description");
        kotlin.jvm.internal.h.e(str, "uriToQueue");
        Logger.b("log queue item: %s, %s", str, yda);
        nqe a2 = this.a.a(str);
        kotlin.jvm.internal.h.d(a2, "ubiEventFactory.hitAddItemToQueue(uriToQueue)");
        return D(this, yda, a2, null, 4);
    }

    @Override // defpackage.pea
    public z<String> u(yda yda) {
        kotlin.jvm.internal.h.e(yda, "description");
        z<R> s = this.c.a().s(new c(this, yda));
        kotlin.jvm.internal.h.d(s, "playerStatePreconditions…(trackUri))\n            }");
        return s;
    }

    @Override // defpackage.pea
    public z<String> v(yda yda, String str) {
        kotlin.jvm.internal.h.e(yda, "description");
        kotlin.jvm.internal.h.e(str, "uri");
        Logger.b("log create radio: %s, %s", str, yda);
        nqe b2 = this.a.b(str);
        kotlin.jvm.internal.h.d(b2, "ubiEventFactory.hitCreateRadio(uri)");
        return D(this, yda, b2, null, 4);
    }
}
