package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.playlist.ui.d0;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import com.spotify.rxjava2.p;
import com.spotify.rxjava2.q;
import defpackage.ao6;
import defpackage.lh6;
import io.reactivex.disposables.c;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.subjects.a;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: oj6  reason: default package */
class oj6 implements d0, b4<ContextMenuItem> {
    private final q a = new q();
    private final y b;
    private ao6 c;
    private final ao6.a f;
    private final lh6 n;
    private final ph6 o;
    private final ItemListConfiguration p;
    private final wj6 q;
    private final CompletableSubject r = CompletableSubject.R();
    private final a<u3<g76, h76>> s = a.h1();
    private final p t = new p();
    private sj6 u;

    public oj6(y yVar, ao6.a aVar, lh6.a aVar2, wj6 wj6, ph6 ph6, ItemListConfiguration itemListConfiguration) {
        this.b = yVar;
        this.o = ph6;
        this.f = aVar;
        this.p = itemListConfiguration;
        this.q = wj6;
        this.n = aVar2.a(itemListConfiguration);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void a(int i, l lVar) {
        this.n.a(i, lVar);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void b(int i, l lVar) {
        this.n.b(i, lVar);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void c(int i, l lVar, boolean z) {
        this.n.c(i, lVar, z);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void d(int i, l lVar) {
        this.n.d(i, lVar);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void f(int i, l lVar) {
        this.n.f(i, lVar);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void g(int i, l lVar) {
        o g = lVar.g();
        if (g != null) {
            this.n.j(i, lVar, g.isBanned(), true);
        }
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void h(int i, l lVar) {
        this.n.h(i, lVar);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void i(int i, l lVar) {
        o g = lVar.g();
        if (g != null) {
            this.n.m(i, lVar, g.isInCollection(), true);
        }
    }

    public void j(sj6 sj6) {
        this.u = sj6;
        this.n.i(sj6);
        if (sj6 != null) {
            this.t.b(this.s.subscribe(new dj6(this)));
        } else {
            this.t.b(c.a());
        }
    }

    public io.reactivex.a k() {
        return io.reactivex.a.y(ImmutableList.of((io.reactivex.a) this.r, this.n.g()));
    }

    public void l(u3 u3Var) {
        F f2 = u3Var.a;
        f2.getClass();
        F f3 = f2;
        S s2 = u3Var.b;
        s2.getClass();
        List<l> a2 = f3.a();
        j l = s2.l();
        ((tj6) this.u).A(l, a2);
        List<l> b2 = f3.b();
        ArrayList arrayList = new ArrayList();
        for (l lVar : b2) {
            o g = lVar.g();
            if (g != null && !g.isBanned()) {
                arrayList.add(lVar);
            }
        }
        if (!a2.isEmpty()) {
            ((tj6) this.u).B(l, arrayList);
        } else {
            ((tj6) this.u).B(l, Collections.emptyList());
        }
        this.a.a(this.c.a(a2, this.p.c(), this.p.b(), this.p.h()).subscribe(new ej6(this), fj6.a));
        boolean z = true;
        ((tj6) this.u).F(!a2.isEmpty() && !this.q.a() && this.p.s());
        if (a2.isEmpty() || arrayList.isEmpty() || !l.w()) {
            z = false;
        }
        ((tj6) this.u).D(z);
        ((tj6) this.u).C(z);
    }

    public /* synthetic */ void m(Optional optional) {
        sj6 sj6;
        if (optional.isPresent() && (sj6 = this.u) != null) {
            ((tj6) sj6).z(((Integer) optional.get()).intValue());
        }
    }

    public /* synthetic */ void n(u3 u3Var) {
        this.s.onNext(u3Var);
        this.r.onComplete();
    }

    public r3 o(ContextMenuItem contextMenuItem) {
        return this.n.n(contextMenuItem, false);
    }

    public void p() {
        this.q.b();
        this.o.n();
        ((tj6) this.u).F(false);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public r3 p0(ContextMenuItem contextMenuItem) {
        return this.n.l(contextMenuItem);
    }

    public void q() {
        this.o.m();
    }

    public void r() {
        ((tj6) this.u).E();
        this.o.g();
    }

    public void s(t.b bVar) {
        this.c = this.f.a(bVar.b());
        this.a.c();
        q qVar = this.a;
        s o0 = s.n(bVar.a().h(), bVar.a().b(), cj6.a).o0(this.b);
        gj6 gj6 = new gj6(this);
        CompletableSubject completableSubject = this.r;
        completableSubject.getClass();
        qVar.a(o0.subscribe(gj6, new nj6(completableSubject)));
        this.n.k(bVar);
    }

    public void t() {
        this.a.c();
        this.n.stop();
    }
}
