package defpackage;

import android.os.Bundle;
import com.spotify.music.features.playlistentity.header.o0;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.w;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.q;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: oq6  reason: default package */
public final class oq6 {
    private final q a = new q();
    private final CompletableSubject b;
    private final io.reactivex.subjects.a<h76> c;
    private final q d;
    private boolean e;
    private rq6 f;
    private Boolean g;
    private oo6 h;
    private final o0 i;
    private final w j;
    private final String k;
    private final y l;
    private final com.spotify.music.features.playlistentity.configuration.g m;

    /* access modifiers changed from: package-private */
    /* renamed from: oq6$a */
    public static final class a<T> implements io.reactivex.functions.g<h76> {
        final /* synthetic */ oq6 a;

        a(oq6 oq6) {
            this.a = oq6;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(h76 h76) {
            h76 h762 = h76;
            h.e(h762, "playlistMetadata");
            oq6.d(this.a, h762);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: oq6$b */
    public static final class b<T> implements io.reactivex.functions.g<w.b> {
        final /* synthetic */ oq6 a;
        final /* synthetic */ rq6 b;

        b(oq6 oq6, rq6 rq6) {
            this.a = oq6;
            this.b = rq6;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(w.b bVar) {
            w.b bVar2 = bVar;
            if (bVar2 != null) {
                this.b.B(this.a.j.d(bVar2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: oq6$c */
    public static final class c<T> implements io.reactivex.functions.g<Boolean> {
        final /* synthetic */ oq6 a;

        c(oq6 oq6) {
            this.a = oq6;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            oq6.e(this.a, bool.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: oq6$d */
    public static final class d implements io.reactivex.functions.a {
        public static final d a = new d();

        d() {
        }

        @Override // io.reactivex.functions.a
        public final void run() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: oq6$e */
    public static final class e<T> implements io.reactivex.functions.g<Boolean> {
        public static final e a = new e();

        e() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: oq6$f */
    public static final class f<T> implements io.reactivex.functions.g<h76> {
        final /* synthetic */ oq6 a;

        f(oq6 oq6) {
            this.a = oq6;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: io.reactivex.subjects.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(h76 h76) {
            h76 h762 = h76;
            h.e(h762, "playlistMetadata");
            this.a.c.onNext(h762);
            this.a.b.onComplete();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: oq6$g */
    public static final class g<T> implements io.reactivex.functions.g<Throwable> {
        final /* synthetic */ oq6 a;

        g(oq6 oq6) {
            this.a = oq6;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Throwable th2 = th;
            h.e(th2, "e");
            this.a.b.onError(th2);
        }
    }

    public oq6(o0 o0Var, w wVar, String str, y yVar, com.spotify.music.features.playlistentity.configuration.g gVar) {
        h.e(o0Var, "logger");
        h.e(wVar, "scrollToPositionInSection");
        h.e(str, "playlistUri");
        h.e(yVar, "schedulerMainThread");
        h.e(gVar, "configuration");
        this.i = o0Var;
        this.j = wVar;
        this.k = str;
        this.l = yVar;
        this.m = gVar;
        CompletableSubject R = CompletableSubject.R();
        h.d(R, "CompletableSubject.create()");
        this.b = R;
        io.reactivex.subjects.a<h76> h1 = io.reactivex.subjects.a.h1();
        h.d(h1, "BehaviorSubject.create<PlaylistMetadata>()");
        this.c = h1;
        this.d = new q();
    }

    public static final void d(oq6 oq6, h76 h76) {
        oq6.getClass();
        j l2 = h76.l();
        rq6 rq6 = oq6.f;
        if (rq6 != null) {
            rq6.E();
        }
        rq6 rq62 = oq6.f;
        if (rq62 != null) {
            rq62.I(l2.j());
        }
        long e2 = h76.e() / 60;
        long j2 = e2 / 60;
        long j3 = e2 - (60 * j2);
        rq6 rq63 = oq6.f;
        if (rq63 != null) {
            rq63.H(h76.k(), j2, j3);
        }
    }

    public static final void e(oq6 oq6, boolean z) {
        oq6.e = z;
        rq6 rq6 = oq6.f;
        if (rq6 != null) {
            boolean c2 = oq6.m.b().c();
            if (oq6.m.b().e() || !z) {
                rq6.G(c2);
            } else {
                rq6.F(c2);
            }
        }
    }

    public final void f(rq6 rq6) {
        this.f = rq6;
        if (rq6 == null) {
            this.d.c();
            return;
        }
        Boolean bool = this.g;
        if (bool != null) {
            rq6.C(bool.booleanValue());
            this.g = null;
        }
        this.d.a(this.c.subscribe(new a(this)));
        this.d.a(this.j.b().o0(this.l).subscribe(new b(this, rq6)));
        if (this.m.d()) {
            q qVar = this.d;
            oo6 oo6 = this.h;
            if (oo6 != null) {
                qVar.a(oo6.b().o0(this.l).subscribe(new c(this)));
            } else {
                h.k("player");
                throw null;
            }
        }
    }

    public final io.reactivex.a g() {
        return this.b;
    }

    public final void h() {
        String str;
        io.reactivex.a aVar;
        boolean b2 = this.m.b().b();
        if (this.m.b().e()) {
            String b3 = this.i.b(this.k);
            if (b2) {
                oo6 oo6 = this.h;
                if (oo6 != null) {
                    h.d(b3, "interactionId");
                    aVar = oo6.h(b3);
                } else {
                    h.k("player");
                    throw null;
                }
            } else {
                oo6 oo62 = this.h;
                if (oo62 != null) {
                    h.d(b3, "interactionId");
                    aVar = oo62.j(b3);
                } else {
                    h.k("player");
                    throw null;
                }
            }
            this.a.a(aVar.subscribe(d.a));
            return;
        }
        if (this.e) {
            str = this.i.a(this.k);
            h.d(str, "logger.logPauseButtonClicked(playlistUri)");
        } else {
            str = this.i.b(this.k);
            h.d(str, "logger.logPlayButtonClicked(playlistUri)");
        }
        q qVar = this.a;
        oo6 oo63 = this.h;
        if (oo63 != null) {
            qVar.a(oo63.a(b2, str).subscribe(e.a));
        } else {
            h.k("player");
            throw null;
        }
    }

    public final void i(Bundle bundle) {
        if (bundle != null) {
            this.g = Boolean.valueOf(bundle.getBoolean(oq6.class.getName()));
        }
    }

    public final void j(Bundle bundle) {
        h.e(bundle, "outState");
        rq6 rq6 = this.f;
        if (rq6 != null) {
            bundle.putBoolean(oq6.class.getName(), rq6.D());
        }
    }

    public final void k(t.b bVar) {
        h.e(bVar, "dependencies");
        this.h = bVar.b();
        this.a.c();
        this.a.a(bVar.a().b().E().o0(this.l).subscribe(new f(this), new g(this)));
    }

    public final void l() {
        this.a.c();
    }
}
