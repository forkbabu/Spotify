package com.spotify.music.features.playlistentity.empty;

import com.google.common.base.MoreObjects;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.navigation.t;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.p;
import com.spotify.rxjava2.q;
import io.reactivex.disposables.c;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.subjects.a;
import io.reactivex.y;

class i {
    private final q a = new q();
    private final f b;
    private final wec c;
    private final t d;
    private final String e;
    private final y f;
    private final CompletableSubject g = CompletableSubject.R();
    private final a<h76> h = a.h1();
    private final p i = new p();
    private m j;
    private boolean k;

    public i(f fVar, wec wec, t tVar, String str, y yVar) {
        this.f = yVar;
        this.b = fVar;
        this.c = wec;
        this.d = tVar;
        this.e = str;
    }

    public static void c(i iVar, h76 h76) {
        iVar.getClass();
        boolean z = !(h76.m() && h76.f().b() != null) && h76.m();
        j l = h76.l();
        String j2 = l.j();
        if (z) {
            iVar.g(true, h76.a());
            com.spotify.playlist.models.p m = l.m();
            String str = null;
            if (m != null) {
                String f2 = m.f();
                String a2 = m.a();
                if (m.b()) {
                    str = a2;
                } else if (!MoreObjects.isNullOrEmpty(f2)) {
                    str = f2;
                }
            }
            if (!h76.a()) {
                ((n) iVar.j).j(j2, str);
                ((n) iVar.j).k(h76.a());
                ((n) iVar.j).u(com.spotify.playlist.models.q.c(l.c(), Covers.Size.LARGE));
                return;
            }
            return;
        }
        iVar.g(false, h76.a());
    }

    private void g(boolean z, boolean z2) {
        if (z2) {
            ((n) this.j).z(z);
        } else {
            ((n) this.j).y(z);
        }
        if (!this.k && z) {
            this.b.b();
            this.k = true;
        }
    }

    public void a(m mVar) {
        this.j = mVar;
        if (mVar != null) {
            this.i.b(this.h.subscribe(new a(this)));
        } else {
            this.i.b(c.a());
        }
    }

    public io.reactivex.a b() {
        return this.g;
    }

    public /* synthetic */ void d(h76 h76) {
        this.h.onNext(h76);
        this.g.onComplete();
    }

    public void e() {
        this.d.b("spotify:home", this.b.c("spotify:home"));
    }

    public void f() {
        this.b.a();
        this.c.a(this.e);
    }

    public void h(t.b bVar) {
        this.a.c();
        q qVar = this.a;
        s<h76> o0 = bVar.a().b().E().o0(this.f);
        b bVar2 = new b(this);
        CompletableSubject completableSubject = this.g;
        completableSubject.getClass();
        qVar.a(o0.subscribe(bVar2, new e(completableSubject)));
    }

    public void i() {
        this.a.c();
    }
}
