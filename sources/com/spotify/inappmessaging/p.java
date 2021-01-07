package com.spotify.inappmessaging;

import com.google.common.collect.ImmutableList;
import com.spotify.inappmessaging.display.e;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.z;
import defpackage.fq0;
import defpackage.io0;
import defpackage.lo0;
import io.reactivex.s;
import io.reactivex.schedulers.a;
import io.reactivex.y;
import java.util.Collection;
import java.util.List;
import retrofit2.w;

public class p implements m {
    private MobiusLoop<lo0, jo0, io0> a;
    private final mp0 b;
    private final jp0 c;
    private final o d;
    private final k e = new k();
    private final k f;
    private final l g;
    private final rp0 h;

    public p(w wVar, boolean z) {
        this.b = new mp0(mp0.a(wVar), new op0());
        this.c = new jp0(jp0.a(wVar), new lp0());
        o oVar = new o();
        this.d = oVar;
        k kVar = new k();
        this.f = kVar;
        this.g = new l();
        tp0 tp0 = new tp0((up0) wVar.d(up0.class), new vp0());
        i iVar = i.a;
        m f2 = i.f();
        f2.h(fq0.a.class, new lq0(tp0));
        f2.d(fq0.b.class, new jq0(kVar));
        this.h = new rp0(z.b(i.c(iVar, f2.i()).h(i.a(oVar.b().Q(b.a).j0(c.a))).b(e.a).d(g.a).f(b.g("InAppMessagingPreviewTool")), hq0.a, u92.b()), kVar);
    }

    @Override // com.spotify.inappmessaging.m
    public rp0 a() {
        return this.h;
    }

    @Override // com.spotify.inappmessaging.m
    public void b(List<FormatType> list, List<ActionType> list2, List<TriggerType> list3, boolean z) {
        if (this.a == null) {
            lo0 lo0 = lo0.a;
            ImmutableList<FormatType> copyOf = ImmutableList.copyOf((Collection) list);
            lo0.a d2 = lo0.d();
            d2.c(copyOf);
            lo0 b2 = d2.b();
            ImmutableList<TriggerType> copyOf2 = ImmutableList.copyOf((Collection) list3);
            lo0.a d3 = b2.d();
            d3.f(copyOf2);
            lo0 b3 = d3.b();
            ImmutableList<ActionType> copyOf3 = ImmutableList.copyOf((Collection) list2);
            lo0.a d4 = b3.d();
            d4.a(copyOf3);
            lo0 b4 = d4.b();
            h hVar = h.a;
            mp0 mp0 = this.b;
            jp0 jp0 = this.c;
            k kVar = this.e;
            y a2 = a.a();
            String c2 = SpotifyLocale.c();
            m f2 = i.f();
            f2.h(io0.b.class, new wo0(mp0, z));
            f2.h(io0.d.class, new so0(a2));
            f2.h(io0.c.class, new ro0(jp0, c2, true, z));
            f2.d(io0.a.class, new vo0(kVar));
            MobiusLoop<lo0, jo0, io0> g2 = z.c(hVar, i.b(f2.i())).b(f.a).d(d.a).e(a.a).h(i.a(this.d.b())).f(b.g("InAppMessaging")).g(b4);
            this.a = g2;
            g2.j(this.g);
        }
    }

    @Override // com.spotify.inappmessaging.m
    public n c() {
        return this.d;
    }

    @Override // com.spotify.inappmessaging.m
    public s<e> d() {
        return this.e.b().n0(this.h.a());
    }

    @Override // com.spotify.inappmessaging.m
    public void stop() {
        MobiusLoop<lo0, jo0, io0> mobiusLoop = this.a;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
            this.a = null;
        }
    }
}
