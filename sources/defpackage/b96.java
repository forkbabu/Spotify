package defpackage;

import android.text.TextUtils;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.l;
import com.spotify.music.features.playlistentity.t;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.subjects.a;
import io.reactivex.y;

/* access modifiers changed from: package-private */
/* renamed from: b96  reason: default package */
public class b96 {
    private final q a = new q();
    private c76 b;
    private final l c;
    private final y d;
    private final a<h76> e = a.h1();
    private final q f = new q();
    private e96 g;

    public b96(l lVar, y yVar) {
        this.c = lVar;
        this.d = yVar;
    }

    public static void b(b96 b96, z66 z66) {
        b96.getClass();
        String b2 = z66.b();
        ane a2 = z66.a();
        e96 e96 = b96.g;
        String str = b2 != null ? b2 : "";
        if (a2 == null) {
            a2 = c76.a;
        }
        ((g96) e96).u(str, a2);
        if (!MoreObjects.isNullOrEmpty(b2)) {
            ((g96) b96.g).z(false);
        }
    }

    public static void c(b96 b96, h76 h76) {
        b96.getClass();
        ((g96) b96.g).y(h76.m() && h76.f().b() != null);
        ((g96) b96.g).w(h76.f().b());
    }

    public void a(e96 e96) {
        this.g = e96;
        if (e96 != null) {
            this.f.c();
            this.f.a(this.e.N0(1).j0(y86.a).subscribe(new q86(this)));
            this.f.a(this.e.subscribe(new u86(this)));
            this.f.a(this.c.c().o0(this.d).subscribe(new p86(this), v86.a));
            this.f.a(this.c.d().o0(this.d).subscribe(new t86(this), r86.a));
            return;
        }
        this.f.c();
    }

    public /* synthetic */ void d(Boolean bool) {
        ((g96) this.g).A();
    }

    public /* synthetic */ void e(Boolean bool) {
        ((g96) this.g).z(true);
    }

    public void f(String str) {
        this.b.e(!TextUtils.isEmpty(str) ? Optional.of(str) : Optional.absent());
    }

    public void g(ane ane) {
        this.b.f(Optional.of(ane));
    }

    public void h(t.b bVar) {
        this.b = bVar.a();
        this.a.c();
        q qVar = this.a;
        s<h76> o0 = bVar.a().b().o0(this.d);
        a<h76> aVar = this.e;
        aVar.getClass();
        qVar.a(o0.subscribe(new o86(aVar), s86.a));
    }

    public void i() {
        this.a.c();
    }
}
