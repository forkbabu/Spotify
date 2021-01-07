package com.spotify.music.features.playlistentity.trackcloud;

import com.google.common.base.MoreObjects;
import com.spotify.music.features.playlistallsongs.c;
import com.spotify.music.features.playlistallsongs.f;
import com.spotify.music.features.playlistentity.configuration.i;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.trackcloud.p;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import com.spotify.rxjava2.p;
import com.spotify.rxjava2.q;
import defpackage.ao6;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.subjects.a;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class x implements w {
    private final q a = new q();
    private final f b;
    private final s c;
    private final TrackCloudShuffling d;
    private final String e;
    private final int f;
    private final i g;
    private final c h;
    private ao6 i;
    private final ao6.a j;
    private final y k;
    private final CompletableSubject l = CompletableSubject.R();
    private final a<u3<g76, h76>> m = a.h1();
    private final p n = new p();
    private c0 o;

    x(f fVar, s sVar, String str, TrackCloudShuffling trackCloudShuffling, ao6.a aVar, Random random, y yVar, i iVar, c cVar) {
        this.b = fVar;
        this.c = sVar;
        this.e = str;
        this.d = trackCloudShuffling;
        this.f = random.nextInt();
        this.k = yVar;
        this.g = iVar;
        this.h = cVar;
        this.j = aVar;
    }

    public void a(c0 c0Var) {
        this.o = c0Var;
        if (c0Var != null) {
            this.n.b(this.m.subscribe(new b(this)));
        } else {
            this.n.b(io.reactivex.disposables.c.a());
        }
    }

    public io.reactivex.a b() {
        return this.l;
    }

    public void c(u3 u3Var) {
        p pVar;
        F f2 = u3Var.a;
        f2.getClass();
        F f3 = f2;
        S s = u3Var.b;
        s.getClass();
        S s2 = s;
        List<l> a2 = f3.a();
        if (!a2.isEmpty()) {
            List<l> b2 = f3.b();
            ArrayList arrayList = new ArrayList();
            for (l lVar : b2) {
                o g2 = lVar.g();
                if (g2 != null && !g2.isBanned()) {
                    arrayList.add(lVar);
                }
            }
            ((d0) this.o).A(this.g.b().c());
            boolean z = true;
            boolean z2 = !a2.isEmpty() && !arrayList.isEmpty();
            if (this.g.b().b()) {
                ((d0) this.o).w(this.d.b(a2, z2 ? null : arrayList, new Random((long) this.f)));
                if (z2) {
                    ((d0) this.o).y(this.d.b(null, arrayList, new Random((long) this.f)));
                    j l2 = s2.l();
                    boolean w = l2.w();
                    if (l2.r()) {
                        pVar = new p.b();
                    } else if (w) {
                        pVar = new p.d();
                    } else {
                        com.spotify.playlist.models.p m2 = l2.m();
                        if (m2 != null && !"spotify".equals(m2.f())) {
                            String a3 = m2.a();
                            if (!MoreObjects.isNullOrEmpty(a3)) {
                                pVar = new p.c(a3);
                            }
                        }
                        pVar = new p.b();
                    }
                } else {
                    ((d0) this.o).y(Collections.emptyList());
                    pVar = new p.a();
                }
            } else {
                ((d0) this.o).w(a2);
                ((d0) this.o).y(Collections.emptyList());
                pVar = new p.a();
            }
            int h2 = s2.h();
            int k2 = s2.k();
            if (h2 <= 0 || k2 <= 0) {
                z = false;
            }
            ((d0) this.o).z(z, k2, h2);
            ((d0) this.o).B(pVar);
            return;
        }
        ((d0) this.o).w(Collections.emptyList());
        ((d0) this.o).y(Collections.emptyList());
        ((d0) this.o).B(new p.a());
    }

    public void d(u3 u3Var) {
        q qVar = this.a;
        ao6 ao6 = this.i;
        F f2 = u3Var.a;
        f2.getClass();
        qVar.a(ao6.a(f2.a(), false, this.g.a(), this.g.b().a()).subscribe(c.a, e.a));
        this.m.onNext(u3Var);
        this.l.onComplete();
    }

    public void e() {
        this.c.a();
        this.b.a(this.e, this.h);
    }

    public void f(t.b bVar) {
        this.i = this.j.a(bVar.b());
        this.a.c();
        q qVar = this.a;
        s o0 = s.n(bVar.a().h(), bVar.a().b(), a.a).o0(this.k);
        d dVar = new d(this);
        CompletableSubject completableSubject = this.l;
        completableSubject.getClass();
        qVar.a(o0.subscribe(dVar, new o(completableSubject)));
    }

    public void g() {
        this.a.c();
    }
}
