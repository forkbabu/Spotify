package com.spotify.music.features.podcast.episode;

import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.mobile.android.quotesharing.i;
import com.spotify.music.C0707R;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.podcast.episode.datasource.z;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.t;
import com.spotify.music.podcastentityrow.d;
import com.spotify.playlist.models.Episode;
import com.spotify.rxjava2.q;
import defpackage.ojc;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Map;

public class l0 {
    private final o0 a;
    private final j0 b;
    private final t c;
    private final cjc d;
    private final jzc e;
    private final e0 f;
    private final oa7 g;
    private final String h;
    private final y i;
    private final y j;
    private final d k;
    private final txc l;
    private final i m;
    private ojc n = ojc.b();
    private final ExplicitContentFacade o;
    private final tb7 p;
    private boolean q;
    private boolean r;
    private final q s;

    public l0(o0 o0Var, j0 j0Var, t tVar, cjc cjc, jzc jzc, e0 e0Var, oa7 oa7, String str, y yVar, y yVar2, ExplicitContentFacade explicitContentFacade, d dVar, i iVar, txc txc, tb7 tb7) {
        this.a = o0Var;
        this.b = j0Var;
        this.d = cjc;
        this.f = e0Var;
        this.h = str;
        this.c = tVar;
        this.e = jzc;
        this.g = oa7;
        this.i = yVar;
        this.j = yVar2;
        this.o = explicitContentFacade;
        this.p = tb7;
        this.k = dVar;
        this.m = iVar;
        this.l = txc;
        this.s = new q();
    }

    public void a(ojc ojc, z.c cVar) {
        Episode c2 = cVar.c();
        Optional<b91> d2 = cVar.d();
        Optional<k87> f2 = cVar.f();
        Optional<b91> e2 = cVar.e();
        Optional<b91> b2 = cVar.b();
        this.n = ojc;
        ojc.c(v.a, new u(this), new n(this));
        this.a.j(this.b.d(c2, ojc, false, false));
        this.a.h(this.b.c(c2, e2.orNull(), f2.orNull(), d2.orNull(), b2.orNull()));
        this.r = c2.F();
        this.s.a(this.l.b().subscribe(new w(this, c2, ojc)));
    }

    public void b(ojc.c cVar) {
        if (cVar.e()) {
            this.a.e();
        } else {
            this.a.c();
        }
    }

    public void c(ojc.a aVar) {
        this.a.c();
    }

    public void d(Episode episode, ojc ojc, Map map) {
        boolean z = episode.g() && !uxc.c(map);
        boolean z2 = !uxc.b(map);
        if (z) {
            this.a.i(8);
        } else {
            this.a.i(0);
        }
        this.a.j(this.b.d(episode, ojc, z, z2));
    }

    public /* synthetic */ void e(Boolean bool) {
        this.q = bool.booleanValue();
    }

    public void f() {
        d dVar = this.k;
        String str = this.h;
        dVar.b(str, this.r, str);
        this.g.k(this.h, this.r);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(java.lang.String r3, boolean r4) {
        /*
            r2 = this;
            ojc r0 = r2.n
            r0.getClass()
            boolean r0 = r0 instanceof defpackage.ojc.c
            if (r0 == 0) goto L_0x0018
            ojc r0 = r2.n
            r0.getClass()
            ojc$c r0 = (defpackage.ojc.c) r0
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x0028
            cjc r3 = r2.d
            r3.onPause()
            oa7 r3 = r2.g
            java.lang.String r4 = r2.h
            r3.a(r4)
            goto L_0x004c
        L_0x0028:
            boolean r0 = r2.q
            if (r0 == 0) goto L_0x003d
            if (r4 == 0) goto L_0x003d
            com.spotify.music.explicitcontent.ExplicitContentFacade r4 = r2.o
            java.lang.String r0 = r2.h
            r4.e(r0, r3)
            oa7 r3 = r2.g
            java.lang.String r4 = r2.h
            r3.b(r4)
            goto L_0x004c
        L_0x003d:
            oa7 r4 = r2.g
            java.lang.String r0 = r2.h
            java.lang.String r4 = r4.b(r0)
            cjc r0 = r2.d
            java.lang.String r1 = r2.h
            r0.a(r3, r1, r4)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.podcast.episode.l0.g(java.lang.String, boolean):void");
    }

    public void h(String str) {
        this.g.g(str);
        this.c.d(str);
    }

    public void i() {
        this.s.c();
        this.d.onStop();
        this.p.f();
        this.k.a();
    }

    public void j(Bundle bundle) {
        this.m.d(bundle);
    }

    public void k(Bundle bundle) {
        this.m.c(bundle);
    }

    public void l(String str, String str2, String str3, String str4) {
        this.e.c(pzc.e(str3, str2, str4, str).build(), rzc.a, C0707R.string.integration_id_context_menu);
        this.g.e(ViewUris.k1.toString());
    }

    public void m(s<z> sVar) {
        this.s.a(s.n(sVar, this.f.a(this.h, this.j).r0(p.a), d.a).o0(this.i).subscribe(new t(this)));
        this.s.a(this.o.c().o0(this.i).subscribe(new q(this), r.a));
        this.p.e();
        this.d.onStart();
    }
}
