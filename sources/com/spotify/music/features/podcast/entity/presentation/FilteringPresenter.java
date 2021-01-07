package com.spotify.music.features.podcast.entity.presentation;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.n;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.features.podcast.entity.c;
import com.spotify.music.features.podcast.entity.f;
import com.spotify.music.features.podcast.entity.g;
import com.spotify.music.features.podcast.entity.o;
import com.spotify.music.util.filterheader.b;
import com.spotify.ubi.specification.factories.r2;
import defpackage.ohc;
import defpackage.shc;
import defpackage.uhc;

public class FilteringPresenter implements f, o, e, com.spotify.music.features.podcast.entity.e {
    private final ajf<a> a;
    private final g b;
    private final ohc.a c = new ohc.a();
    private final uhc.a f = new uhc.a();
    private final shc.a n = new shc.a();
    private final u57 o;
    private final ere p;
    private final r2 q;
    private boolean r;

    public interface a {
        void l(View view);

        void m();

        void n(c cVar);
    }

    public FilteringPresenter(ajf<a> ajf, g gVar, u57 u57, ere ere, com.spotify.music.libs.viewuri.c cVar, n nVar) {
        this.a = ajf;
        this.b = gVar;
        this.o = u57;
        this.p = ere;
        this.q = new r2(cVar.toString());
        nVar.A().a(this);
    }

    private void h() {
        this.b.m();
        this.a.get().m();
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void V(n nVar) {
        d.d(this, nVar);
    }

    @Override // com.spotify.music.features.podcast.entity.e
    public void a(SortOption sortOption) {
        this.b.n().a(sortOption);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void a0(n nVar) {
        d.c(this, nVar);
    }

    @Override // com.spotify.music.features.podcast.entity.f
    public void b(b bVar, String str, boolean z) {
        int a2 = bVar.a();
        if (z) {
            this.p.a(this.q.b(str).a());
        } else if (a2 == 0) {
            this.p.a(this.q.c().b().a());
        } else if (a2 == 2) {
            this.p.a(this.q.c().d().a());
        } else if (a2 == 3) {
            this.p.a(this.q.c().c().a());
        }
        h();
    }

    @Override // com.spotify.music.features.podcast.entity.o
    public void c(SortOption sortOption) {
        String b2 = sortOption.b();
        if (b2.equals("number")) {
            this.p.a(this.q.d().b().a());
        } else if (b2.equals("number REVERSE")) {
            this.p.a(this.q.d().c().a());
        }
        h();
    }

    public /* synthetic */ void d(View view) {
        this.o.g();
        this.b.y();
        h();
    }

    @Override // androidx.lifecycle.g
    public void d0(n nVar) {
        this.b.w(this);
        this.b.x(this);
    }

    public void e(Bundle bundle) {
        this.b.t(bundle);
    }

    public void f(qyd qyd, esc esc) {
        if (!this.r) {
            this.b.p(qyd.d().b());
            this.a.get().n(new c(this.b.k(), this.b.l(), this.b.m()));
            this.r = true;
        }
        this.c.e(this.b.o());
        this.c.g(this.b.q() || qyd.getUnrangedLength() > 0);
        ohc.a aVar = this.c;
        a aVar2 = this.a.get();
        aVar2.getClass();
        aVar.f(new b(aVar2));
        this.f.f(new a(this));
        if (this.b.q()) {
            this.f.c(true);
        } else if (qyd.getUnrangedLength() == 0) {
            this.f.c(false);
            this.n.c(true);
        } else {
            this.f.c(false);
            this.n.c(false);
        }
        esc.b(this.c);
        esc.a(this.f);
        esc.a(this.n);
    }

    public void g(Bundle bundle) {
        this.b.z(bundle);
    }

    @Override // androidx.lifecycle.g
    public void h0(n nVar) {
        nVar.A().c(this);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void n(n nVar) {
        d.a(this, nVar);
    }

    @Override // androidx.lifecycle.g
    public void o0(n nVar) {
        this.b.u(this);
        this.b.v(this);
    }
}
