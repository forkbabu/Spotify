package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.endpoints.v;
import com.spotify.rxjava2.p;
import com.spotify.rxjava2.q;
import io.reactivex.disposables.c;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.y;

/* access modifiers changed from: package-private */
/* renamed from: b86  reason: default package */
public class b86 {
    private final q a = new q();
    private final y76 b;
    private final OffliningLogger c;
    private final y d;
    private final i e;
    private final m8c f;
    private final h8c g;
    private final t h;
    private final CompletableSubject i = CompletableSubject.R();
    private final io.reactivex.subjects.a<h76> j = io.reactivex.subjects.a.h1();
    private final p k = new p();
    private k86 l;
    private h76 m;

    /* renamed from: b86$a */
    class a implements f8c {
        final /* synthetic */ v a;
        final /* synthetic */ String b;

        a(v vVar, String str) {
            this.a = vVar;
            this.b = str;
        }

        @Override // defpackage.f8c
        public void a(boolean z) {
            b86.a(b86.this, z);
        }

        @Override // defpackage.f8c
        public void b(boolean z) {
            io.reactivex.a aVar;
            if (z) {
                aVar = this.a.c(this.b);
            } else {
                aVar = this.a.d(this.b);
            }
            b86.this.a.a(aVar.subscribe(r76.a, s76.a));
        }
    }

    public b86(y76 y76, OffliningLogger offliningLogger, y yVar, String str, v vVar, i iVar, m8c m8c, t tVar) {
        this.d = yVar;
        this.e = iVar;
        this.b = y76;
        this.c = offliningLogger;
        this.f = m8c;
        this.h = tVar;
        this.g = new h8c(new w76(this), new a(vVar, str));
    }

    static void a(b86 b86, boolean z) {
        b86.a.a(b86.e.c(b86.m.l().getUri(), Optional.fromNullable(b86.m.f().a()), z).subscribe(t76.a, v76.a));
    }

    public static void e(b86 b86, h76 h76) {
        b86.m = h76;
        b86.g.c(new c86(h76));
        boolean z = true;
        boolean z2 = h76.d() || h76.b();
        ((l86) b86.l).k(!h76.m() && z2);
        ((l86) b86.l).q(!h76.m() && !z2);
        k86 k86 = b86.l;
        if (!h76.d() || !h76.c() || h76.b()) {
            z = false;
        }
        ((l86) k86).j(z);
    }

    public void c(k86 k86) {
        this.l = k86;
        if (k86 != null) {
            this.k.b(this.j.subscribe(new u76(this)));
            this.f.d(this.g);
            this.f.c();
            return;
        }
        this.k.b(c.a());
        this.f.a();
        this.f.b(this.g);
    }

    public io.reactivex.a d() {
        return this.i;
    }

    public /* synthetic */ void f(com.spotify.playlist.models.offline.a aVar) {
        k86 k86 = this.l;
        if (k86 != null) {
            ((l86) k86).b(aVar);
        }
    }

    public /* synthetic */ void g(h76 h76) {
        this.j.onNext(h76);
        this.i.onComplete();
    }

    public void h() {
        this.h.b("spotify:internal:preferences", this.b.b(this.m.l().getUri(), "spotify:internal:preferences"));
    }

    public void i(boolean z) {
        this.g.b(z);
        String uri = this.m.l().getUri();
        this.b.a(uri, z);
        this.c.a(uri, OffliningLogger.SourceElement.HEADER_TOGGLE, z);
    }

    public void j(t.b bVar) {
        this.a.c();
        q qVar = this.a;
        s<h76> o0 = bVar.a().b().o0(this.d);
        q76 q76 = new q76(this);
        CompletableSubject completableSubject = this.i;
        completableSubject.getClass();
        qVar.a(o0.subscribe(q76, new x76(completableSubject)));
    }

    public void k() {
        this.a.c();
    }
}
