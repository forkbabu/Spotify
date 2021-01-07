package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.h;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.w;
import com.spotify.playlist.endpoints.v;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.subjects.a;
import io.reactivex.y;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: nb6  reason: default package */
public class nb6 {
    private final q a = new q();
    private oo6 b;
    private final lb6 c;
    private final hb6 d;
    private final v e;
    private final String f;
    private final h g;
    private final w h;
    private final y i;
    private final Optional<kb6> j;
    private final CompletableSubject k = CompletableSubject.R();
    private final a<h76> l = a.h1();
    private final q m = new q();
    private boolean n;
    private rb6 o;
    private Boolean p;
    private j q;

    nb6(lb6 lb6, hb6 hb6, v vVar, w wVar, String str, y yVar, h hVar, Optional<kb6> optional) {
        this.c = lb6;
        this.d = hb6;
        this.e = vVar;
        this.f = str;
        this.g = hVar;
        this.j = optional;
        this.h = wVar;
        this.i = yVar;
    }

    public static void c(nb6 nb6, h76 h76) {
        nb6.getClass();
        Covers.Size size = Covers.Size.LARGE;
        j l2 = h76.l();
        nb6.q = l2;
        Map<String, String> f2 = l2.f();
        String str = f2.get("primary_color");
        if (str == null) {
            str = "#FFFFFF";
        }
        int parseColor = Color.parseColor(str);
        boolean z = true;
        boolean z2 = !MoreObjects.isNullOrEmpty(f2.get("image_url"));
        if (z2) {
            ((sb6) nb6.o).K(f2.get("image_url"), com.spotify.playlist.models.q.c(l2.c(), size), parseColor);
        } else {
            ((sb6) nb6.o).T(com.spotify.playlist.models.q.c(l2.c(), Covers.Size.NORMAL), com.spotify.playlist.models.q.c(l2.c(), size));
        }
        ((sb6) nb6.o).Q(parseColor);
        boolean n2 = h76.n();
        String str2 = "";
        if (!n2 || h76.a()) {
            String j2 = l2.j();
            ((sb6) nb6.o).V(j2);
            if (z2) {
                ((sb6) nb6.o).L(j2);
            } else {
                ((sb6) nb6.o).U(j2);
            }
        } else {
            ((sb6) nb6.o).V(str2);
            if (z2) {
                ((sb6) nb6.o).L(str2);
            } else {
                ((sb6) nb6.o).U(str2);
            }
        }
        ((sb6) nb6.o).R(!n2);
        String a2 = nb6.c.a(h76, nb6.g.f());
        if (nb6.j.isPresent()) {
            ((sb6) nb6.o).M(h76, a2, nb6.j.get());
        } else {
            ((sb6) nb6.o).X(!MoreObjects.isNullOrEmpty(a2));
            ((sb6) nb6.o).N(a2);
        }
        String d2 = l2.d();
        rb6 rb6 = nb6.o;
        CharSequence charSequence = str2;
        if (d2 != null) {
            charSequence = z42.m(d2);
        }
        ((sb6) rb6).I(charSequence);
        rb6 rb62 = nb6.o;
        if (!nb6.g.c() || l2.w()) {
            z = false;
        }
        ((sb6) rb62).W(z);
        ((sb6) nb6.o).J(l2.t());
    }

    public static void f(nb6 nb6, boolean z) {
        boolean c2 = nb6.g.b().c();
        if (nb6.g.b().e() || !z) {
            ((sb6) nb6.o).P(c2);
        } else {
            ((sb6) nb6.o).O(c2);
        }
        nb6.n = z;
    }

    public void a(rb6 rb6) {
        this.o = rb6;
        if (rb6 != null) {
            Boolean bool = this.p;
            if (bool != null) {
                ((sb6) rb6).F(bool.booleanValue());
                this.p = null;
            }
            this.m.a(this.l.subscribe(new wa6(this)));
            this.m.a(this.h.b().o0(this.i).subscribe(new ua6(this), ra6.a));
            if (this.g.d()) {
                this.m.a(this.b.b().o0(this.i).subscribe(new xa6(this)));
                return;
            }
            return;
        }
        this.m.c();
    }

    public io.reactivex.a b() {
        return this.k;
    }

    public /* synthetic */ void d(w.b bVar) {
        ((sb6) this.o).H(this.h.d(bVar));
    }

    public /* synthetic */ void e(h76 h76) {
        this.l.onNext(h76);
        this.k.onComplete();
    }

    public void g() {
        this.d.d(this.f);
        ((sb6) this.o).E(com.spotify.playlist.models.q.c(this.q.c(), Covers.Size.LARGE), com.spotify.playlist.models.q.c(this.q.c(), Covers.Size.XLARGE));
    }

    public void h() {
        io.reactivex.a aVar;
        boolean t = this.q.t();
        this.d.c(this.f, t);
        if (!t) {
            aVar = this.e.c(this.f);
        } else {
            aVar = this.e.d(this.f);
        }
        this.a.a(aVar.subscribe(oa6.a, pa6.a));
    }

    public void i() {
        String str;
        io.reactivex.a aVar;
        boolean b2 = this.g.b().b();
        if (this.g.b().e()) {
            String b3 = this.d.b(this.f);
            q qVar = this.a;
            if (b2) {
                aVar = this.b.h(b3);
            } else {
                aVar = this.b.j(b3);
            }
            qVar.a(aVar.subscribe(va6.a, qa6.a));
            return;
        }
        if (this.n) {
            str = this.d.a(this.f);
        } else {
            str = this.d.b(this.f);
        }
        this.a.a(this.b.a(b2, str).subscribe(ta6.a, sa6.a));
    }

    public void j(Bundle bundle) {
        if (bundle != null) {
            this.p = Boolean.valueOf(bundle.getBoolean(nb6.class.getName()));
        }
    }

    public void k(Bundle bundle) {
        if (this.o != null) {
            bundle.putBoolean(nb6.class.getName(), ((sb6) this.o).G());
        }
    }

    public void l(t.b bVar) {
        this.b = bVar.b();
        this.a.c();
        q qVar = this.a;
        s<h76> o0 = bVar.a().b().E().o0(this.i);
        ya6 ya6 = new ya6(this);
        CompletableSubject completableSubject = this.k;
        completableSubject.getClass();
        qVar.a(o0.subscribe(ya6, new fb6(completableSubject)));
    }

    public void m() {
        this.a.c();
    }
}
