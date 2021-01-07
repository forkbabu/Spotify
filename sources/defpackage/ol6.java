package defpackage;

import android.os.Bundle;
import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.header.o0;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.w;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.subjects.a;
import io.reactivex.y;

/* renamed from: ol6  reason: default package */
class ol6 {
    private final q a = new q();
    private oo6 b;
    private final o0 c;
    private final g d;
    private final String e;
    private final w f;
    private final y g;
    private final CompletableSubject h = CompletableSubject.R();
    private final a<h76> i = a.h1();
    private final q j = new q();
    private boolean k;
    private sl6 l;
    private Boolean m;

    ol6(o0 o0Var, w wVar, String str, y yVar, g gVar) {
        this.c = o0Var;
        this.d = gVar;
        this.e = str;
        this.f = wVar;
        this.g = yVar;
    }

    public static void c(ol6 ol6, h76 h76) {
        ol6.getClass();
        j l2 = h76.l();
        ol6.l.D();
        ol6.l.H(l2.j());
        boolean z = false;
        boolean z2 = l2.o() >= 15;
        boolean z3 = !ol6.d.b().b();
        sl6 sl6 = ol6.l;
        if (z2 || z3) {
            z = true;
        }
        sl6.G(z);
    }

    public static void d(ol6 ol6, boolean z) {
        boolean c2 = ol6.d.b().c();
        if (ol6.d.b().e() || !z) {
            ol6.l.F(c2);
        } else {
            ol6.l.E(c2);
        }
        ol6.k = z;
    }

    public void a(sl6 sl6) {
        this.l = sl6;
        if (sl6 != null) {
            Boolean bool = this.m;
            if (bool != null) {
                sl6.B(bool.booleanValue());
                this.m = null;
            }
            this.j.a(this.i.subscribe(new al6(this)));
            this.j.a(this.f.b().o0(this.g).subscribe(new hl6(this), zk6.a));
            if (this.d.d()) {
                this.j.a(this.b.b().o0(this.g).subscribe(new cl6(this)));
                return;
            }
            return;
        }
        this.j.c();
    }

    public io.reactivex.a b() {
        return this.h;
    }

    public /* synthetic */ void e(w.b bVar) {
        this.l.u(this.f.d(bVar));
    }

    public /* synthetic */ void f(h76 h76) {
        this.i.onNext(h76);
        this.h.onComplete();
    }

    public void g() {
        String str;
        io.reactivex.a aVar;
        boolean b2 = this.d.b().b();
        if (this.d.b().e()) {
            String b3 = this.c.b(this.e);
            q qVar = this.a;
            if (b2) {
                aVar = this.b.h(b3);
            } else {
                aVar = this.b.j(b3);
            }
            qVar.a(aVar.subscribe(dl6.a, fl6.a));
            return;
        }
        if (this.k) {
            str = this.c.a(this.e);
        } else {
            str = this.c.b(this.e);
        }
        this.a.a(this.b.a(b2, str).subscribe(bl6.a, gl6.a));
    }

    public void h(Bundle bundle) {
        if (bundle != null) {
            this.m = Boolean.valueOf(bundle.getBoolean(ol6.class.getName()));
        }
    }

    public void i(Bundle bundle) {
        if (this.l != null) {
            bundle.putBoolean(ol6.class.getName(), this.l.C());
        }
    }

    public void j(t.b bVar) {
        this.b = bVar.b();
        this.a.c();
        q qVar = this.a;
        s<h76> o0 = bVar.a().b().E().o0(this.g);
        el6 el6 = new el6(this);
        CompletableSubject completableSubject = this.h;
        completableSubject.getClass();
        qVar.a(o0.subscribe(el6, new ml6(completableSubject)));
    }

    public void k() {
        this.a.c();
    }
}
