package defpackage;

import com.spotify.music.features.playlistentity.configuration.c;
import com.spotify.music.features.playlistentity.t;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.subjects.a;
import io.reactivex.y;

/* access modifiers changed from: package-private */
/* renamed from: eg6  reason: default package */
public class eg6 {
    private oo6 a;
    private final String b;
    private final y c;
    private final bg6 d;
    private final c e;
    private final q f = new q();
    private final q g = new q();
    private final CompletableSubject h = CompletableSubject.R();
    private final a<h76> i = a.h1();
    private boolean j;
    private ig6 k;

    public eg6(bg6 bg6, String str, y yVar, c cVar) {
        this.b = str;
        this.c = yVar;
        this.d = bg6;
        this.e = cVar;
    }

    public static void c(eg6 eg6, h76 h76) {
        eg6.getClass();
        boolean n = h76.n();
        ((jg6) eg6.k).k(!n);
    }

    public static void d(eg6 eg6, boolean z) {
        boolean c2 = eg6.e.a().c();
        if (eg6.e.a().e() || !z) {
            ((jg6) eg6.k).j(c2);
        } else {
            ((jg6) eg6.k).i(c2);
        }
        eg6.j = z;
    }

    public void a(ig6 ig6) {
        this.k = ig6;
        if (ig6 != null) {
            this.g.a(this.a.b().o0(this.c).subscribe(new vf6(this)));
            this.g.a(this.i.subscribe(new uf6(this)));
            return;
        }
        this.g.c();
    }

    public io.reactivex.a b() {
        return this.h;
    }

    public /* synthetic */ void e(h76 h76) {
        this.i.onNext(h76);
        this.h.onComplete();
    }

    public void f() {
        String str;
        io.reactivex.a aVar;
        boolean b2 = this.e.a().b();
        if (this.e.a().e()) {
            String b3 = this.d.b(this.b);
            q qVar = this.f;
            if (b2) {
                aVar = this.a.h(b3);
            } else {
                aVar = this.a.j(b3);
            }
            qVar.a(aVar.subscribe(tf6.a, wf6.a));
            return;
        }
        if (this.j) {
            str = this.d.a(this.b);
        } else {
            str = this.d.b(this.b);
        }
        this.f.a(this.a.a(b2, str).subscribe(sf6.a, xf6.a));
    }

    public void g(t.b bVar) {
        this.a = bVar.b();
        this.f.c();
        q qVar = this.f;
        s<h76> o0 = bVar.a().b().E().o0(this.c);
        yf6 yf6 = new yf6(this);
        CompletableSubject completableSubject = this.h;
        completableSubject.getClass();
        qVar.a(o0.subscribe(yf6, new ag6(completableSubject)));
    }

    public void h() {
        this.f.c();
    }
}
