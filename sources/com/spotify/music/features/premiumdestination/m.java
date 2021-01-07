package com.spotify.music.features.premiumdestination;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.o;
import com.spotify.mobius.z;
import com.spotify.music.features.premiumdestination.domain.j;
import com.spotify.music.features.premiumdestination.domain.k;
import com.spotify.music.features.premiumdestination.domain.l;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import com.spotify.music.navigation.t;
import com.spotify.remoteconfig.PremiumDestinationProperties;
import io.reactivex.schedulers.a;
import io.reactivex.y;

public class m {
    private final j a;
    private final y b;
    private final y c;
    private final ObjectMapper d;
    private final t e;
    private final aj7 f;
    private final w g;
    private final PremiumDestinationProperties h;
    private final bk9 i;

    public m(j jVar, y yVar, y yVar2, g gVar, t tVar, aj7 aj7, w wVar, PremiumDestinationProperties premiumDestinationProperties, bk9 bk9) {
        this.a = jVar;
        this.b = yVar;
        this.c = yVar2;
        e b2 = gVar.b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.d = b2.build();
        this.e = tVar;
        this.f = aj7;
        this.g = wVar;
        this.h = premiumDestinationProperties;
        this.i = bk9;
    }

    public MobiusLoop.g<l, k> a(l lVar) {
        h hVar = h.a;
        j jVar = this.a;
        ObjectMapper objectMapper = this.d;
        y yVar = this.b;
        y yVar2 = this.c;
        t tVar = this.e;
        aj7 aj7 = this.f;
        bk9 bk9 = this.i;
        com.spotify.mobius.rx2.m f2 = i.f();
        f2.h(j.e.class, new ci7(yVar));
        f2.h(j.a.class, new di7(jVar, objectMapper));
        f2.b(j.d.class, new ai7(tVar));
        f2.d(j.c.class, new ei7(aj7));
        bk9.getClass();
        f2.c(j.b.class, new wh7(bk9), yVar2);
        MobiusLoop.f e2 = i.c(hVar, f2.i()).b(new d(this)).d(new c(this)).e(i.a);
        w wVar = this.g;
        return z.b(e2.h(i.a(wVar.b().E().j0(new hi7(this.h)).t0(new gi7(a.a())), wVar.a("country_code").j0(ii7.a))).f(b.g("PremiumPage Feature")), lVar, u92.b());
    }

    public /* synthetic */ ia2 b() {
        return new o(this.b);
    }

    public /* synthetic */ ia2 c() {
        return new o(this.b);
    }
}
