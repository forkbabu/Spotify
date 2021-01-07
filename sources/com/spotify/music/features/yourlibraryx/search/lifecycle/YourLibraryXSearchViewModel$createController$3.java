package com.spotify.music.features.yourlibraryx.search.lifecycle;

import com.spotify.mobius.s;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption;
import com.spotify.music.features.yourlibraryx.domain.c;
import com.spotify.music.features.yourlibraryx.domain.d;
import com.spotify.music.features.yourlibraryx.domain.e;
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.features.yourlibraryx.domain.g;
import com.spotify.music.features.yourlibraryx.domain.i;
import com.spotify.music.features.yourlibraryx.domain.k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class YourLibraryXSearchViewModel$createController$3 extends FunctionReferenceImpl implements nmf<f, s<f, c>> {
    public static final YourLibraryXSearchViewModel$createController$3 a = new YourLibraryXSearchViewModel$createController$3();

    YourLibraryXSearchViewModel$createController$3() {
        super(1, i.class, "searchInit", "searchInit(Lcom/spotify/music/features/yourlibraryx/domain/YourLibraryXModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<f, c> invoke(f fVar) {
        jnf jnf;
        jnf jnf2;
        f fVar2 = fVar;
        h.e(fVar2, "p1");
        h.e(fVar2, "model");
        if (fVar2.p().isEmpty()) {
            jnf = new jnf(0, fVar2.i());
        } else {
            jnf = e.b(fVar2.i(), fVar2.p());
        }
        f a2 = f.a(fVar2, null, null, null, null, null, new g("", "", null, true), 0, 0, null, null, jnf, null, false, null, null, 31711);
        h.e(a2, "model");
        YourLibraryXSortOption n = a2.n();
        d c = a2.c();
        if (a2.g().isEmpty()) {
            jnf2 = a2.f().f();
        } else {
            jnf2 = a2.g();
        }
        k kVar = new k(n, c, jnf2, null);
        String e = fVar2.c().e();
        if (e == null || kotlin.text.e.n(e)) {
            kVar = k.a(kVar, null, null, null, fVar2.m(), 7);
        }
        s<f, c> c2 = s.c(a2, z42.l(new c.m(kVar, fVar2.e())));
        h.d(c2, "First.first(\n        fir…YourLibraryXEffect>\n    )");
        return c2;
    }
}
