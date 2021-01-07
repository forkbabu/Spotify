package defpackage;

import android.graphics.Color;
import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.header.o0;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.t;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.q;
import io.reactivex.d0;
import io.reactivex.disposables.a;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: zc6  reason: default package */
public final class zc6 {
    private final a a = new a();
    private final g b;
    private final HomeMixFormatListAttributesHelper c;
    private final y d;
    private final o0 e;
    private final g f;
    private final CompletableSubject g = CompletableSubject.R();
    private final io.reactivex.subjects.a<u3<g76, h76>> h = io.reactivex.subjects.a.h1();
    private final a i = new a();
    private oo6 j;
    private final me6 k;
    private final String l;
    private cd6 m;

    public zc6(o0 o0Var, String str, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, me6 me6, y yVar, g gVar) {
        this.e = o0Var;
        this.b = gVar;
        this.l = str;
        this.k = me6;
        this.c = homeMixFormatListAttributesHelper;
        this.d = yVar;
        this.f = gVar;
    }

    public static void c(zc6 zc6, boolean z) {
        if (z) {
            ((fd6) zc6.m).y();
        } else {
            ((fd6) zc6.m).z();
        }
    }

    public void a(cd6 cd6) {
        this.m = cd6;
        if (cd6 != null) {
            this.i.b(this.h.subscribe(new nc6(this)));
            if (this.b.d()) {
                this.i.b(this.j.b().o0(this.d).subscribe(new mc6(this)));
                return;
            }
            return;
        }
        this.i.f();
    }

    public io.reactivex.a b() {
        return this.g;
    }

    public void d(u3 u3Var) {
        F f2 = u3Var.a;
        f2.getClass();
        F f3 = f2;
        S s = u3Var.b;
        s.getClass();
        j l2 = s.l();
        String c2 = q.c(l2.c(), Covers.Size.LARGE);
        HomeMix c3 = this.c.c(l2);
        ((fd6) this.m).A(l2.j());
        cd6 cd6 = this.m;
        int i2 = -16777216;
        if (c3 != null) {
            try {
                i2 = Color.parseColor(c3.secondaryColor());
            } catch (IllegalArgumentException unused) {
            }
        }
        ((fd6) cd6).B(c2, i2);
        boolean z = true;
        boolean z2 = c3 != null && c3.needsTasteOnboarding();
        if (c3 == null || c3.isUserEnabled()) {
            z = false;
        }
        if (z2 || ((f3.c() && z) || !this.f.d())) {
            ((fd6) this.m).k();
        } else {
            ((fd6) this.m).C();
        }
    }

    public /* synthetic */ d0 e(Boolean bool) {
        String str;
        if (bool.booleanValue()) {
            str = this.e.b(this.l);
            this.k.f();
        } else {
            str = this.e.a(this.l);
            this.k.e();
        }
        if (bool.booleanValue() || !this.b.b().b()) {
            return this.j.d(str);
        }
        return this.j.h(str).h(z.z(Boolean.TRUE));
    }

    public /* synthetic */ void f(u3 u3Var) {
        this.h.onNext(u3Var);
        this.g.onComplete();
    }

    public void g() {
        this.a.b(this.j.b().T().s(new pc6(this)).subscribe(qc6.a, lc6.a));
    }

    public void h(t.b bVar) {
        this.j = bVar.b();
        a aVar = this.a;
        s o0 = s.n(bVar.a().h(), bVar.a().b(), vc6.a).E().o0(this.d);
        oc6 oc6 = new oc6(this);
        CompletableSubject completableSubject = this.g;
        completableSubject.getClass();
        aVar.b(o0.subscribe(oc6, new wc6(completableSubject)));
    }

    public void i() {
        this.a.f();
    }
}
