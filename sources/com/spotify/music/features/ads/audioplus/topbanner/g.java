package com.spotify.music.features.ads.audioplus.topbanner;

import android.text.TextUtils;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.ads.audioplus.d;
import com.spotify.music.navigation.t;
import com.spotify.rxjava2.p;
import java.util.HashMap;

public class g {
    private final wlf<mo3> a;
    private final wlf<so3> b;
    private final jp3 c;
    private final d d;
    private final dv3 e;
    private final t f;
    private final an3 g;
    private b h;
    private boolean i;
    private final p j = new p();

    public g(jp3 jp3, wlf<mo3> wlf, wlf<so3> wlf2, d dVar, dv3 dv3, t tVar, an3 an3) {
        this.c = jp3;
        this.a = wlf;
        this.b = wlf2;
        this.d = dVar;
        this.e = dv3;
        this.f = tVar;
        this.g = an3;
    }

    public void a() {
        if (l0.x(this.d.c())) {
            this.j.b(this.g.a(this.d.c()).subscribe());
            this.f.d(this.d.c());
            HashMap hashMap = new HashMap(1);
            hashMap.put("promotion_context", this.d.c());
            this.e.c("clicked", this.d.e(), null, -1, hashMap);
            return;
        }
        this.f.d(this.d.c());
        this.e.a("clicked", this.d.e());
    }

    public void b(i iVar) {
        this.e.a("errored", this.d.e());
        ((LeaveBehindTopBannerContainerFragment) iVar).K4();
    }

    public void c() {
        if (!this.i) {
            this.e.a("viewed", this.d.e());
            this.i = true;
        }
    }

    public void d(i iVar) {
        if (TextUtils.isEmpty(this.d.f())) {
            ((LeaveBehindTopBannerContainerFragment) iVar).K4();
            return;
        }
        if (this.c.e()) {
            this.h = this.b.get();
        } else {
            this.h = this.a.get();
        }
        LeaveBehindTopBannerContainerFragment leaveBehindTopBannerContainerFragment = (LeaveBehindTopBannerContainerFragment) iVar;
        leaveBehindTopBannerContainerFragment.L4(this.h);
        this.h.b(leaveBehindTopBannerContainerFragment, this.d);
    }

    public void e() {
        this.e.a("ended", this.d.e());
        this.j.a();
    }
}
