package com.spotify.music.features.ads.audioplus.overlay;

import android.text.TextUtils;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.ads.audioplus.d;
import com.spotify.music.navigation.t;
import com.spotify.rxjava2.p;
import java.util.HashMap;

public class c {
    private i a;
    private final k b;
    private final d c;
    private final dv3 d;
    private final t e;
    private final an3 f;
    private final p g = new p();
    private boolean h;

    public c(k kVar, d dVar, dv3 dv3, t tVar, an3 an3) {
        this.b = kVar;
        this.c = dVar;
        this.d = dv3;
        this.e = tVar;
        this.f = an3;
    }

    public void a() {
        this.e.d(this.c.c());
        this.d.a("clicked", this.c.e());
    }

    public void b() {
        if (l0.x(this.c.c())) {
            e();
            return;
        }
        this.e.d(this.c.c());
        this.d.a("clicked", this.c.e());
    }

    public void c(e eVar) {
        this.d.a("errored", this.c.e());
        ((LeaveBehindContainerFragment) eVar).K4();
    }

    public void d() {
        if (!this.h) {
            this.d.a("viewed", this.c.e());
            this.h = true;
        }
    }

    public void e() {
        this.g.b(this.f.a(this.c.c()).subscribe());
        this.e.d(this.c.c());
        HashMap hashMap = new HashMap(1);
        hashMap.put("promotion_context", this.c.c());
        this.d.c("clicked", this.c.e(), null, -1, hashMap);
    }

    public void f(e eVar) {
        if (TextUtils.isEmpty(this.c.f())) {
            ((LeaveBehindContainerFragment) eVar).K4();
            return;
        }
        j a2 = this.b.a(this.c.l());
        if (a2 != null) {
            i create = a2.b().create();
            this.a = create;
            LeaveBehindContainerFragment leaveBehindContainerFragment = (LeaveBehindContainerFragment) eVar;
            leaveBehindContainerFragment.L4(create);
            this.a.b(leaveBehindContainerFragment, this.c);
        }
    }

    public void g() {
        this.d.a("ended", this.c.e());
        this.g.a();
    }
}
