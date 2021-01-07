package com.spotify.music.features.yourlibraryx.search.lifecycle;

import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibraryx.domain.SubscriptionType;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption;
import com.spotify.music.features.yourlibraryx.domain.a;
import com.spotify.music.features.yourlibraryx.domain.c;
import com.spotify.music.features.yourlibraryx.domain.d;
import com.spotify.music.features.yourlibraryx.domain.e;
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.features.yourlibraryx.domain.i;
import com.spotify.music.features.yourlibraryx.domain.k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class YourLibraryXSearchViewModel$createController$1 extends FunctionReferenceImpl implements rmf<f, YourLibraryXEvent, e0<f, c>> {
    public static final YourLibraryXSearchViewModel$createController$1 a = new YourLibraryXSearchViewModel$createController$1();

    YourLibraryXSearchViewModel$createController$1() {
        super(2, i.class, "searchUpdate", "searchUpdate(Lcom/spotify/music/features/yourlibraryx/domain/YourLibraryXModel;Lcom/spotify/music/features/yourlibraryx/domain/YourLibraryXEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<f, c> invoke(f fVar, YourLibraryXEvent yourLibraryXEvent) {
        jnf jnf;
        jnf jnf2;
        f fVar2 = fVar;
        YourLibraryXEvent yourLibraryXEvent2 = yourLibraryXEvent;
        h.e(fVar2, "p1");
        h.e(yourLibraryXEvent2, "p2");
        SubscriptionType subscriptionType = SubscriptionType.RECENT_SEARCHES;
        h.e(fVar2, "model");
        h.e(yourLibraryXEvent2, "event");
        if (yourLibraryXEvent2 instanceof YourLibraryXEvent.e) {
            YourLibraryXEvent.e eVar = (YourLibraryXEvent.e) yourLibraryXEvent2;
            e0<f, c> a2 = e0.a(z42.l(new c.i(eVar.a()), new c.d(eVar.a(), eVar.b())));
            h.d(a2, "dispatch(\n        effect…actionId)\n        )\n    )");
            return a2;
        } else if (yourLibraryXEvent2 instanceof YourLibraryXEvent.d) {
            return e.c((YourLibraryXEvent.d) yourLibraryXEvent2);
        } else {
            if (yourLibraryXEvent2 instanceof YourLibraryXEvent.c) {
                e0<f, c> a3 = e0.a(z42.l(new c.b(((YourLibraryXEvent.c) yourLibraryXEvent2).a())));
                h.d(a3, "dispatch(effects(DeleteRecentSearch(event.uri)))");
                return a3;
            } else if (yourLibraryXEvent2 instanceof YourLibraryXEvent.f) {
                return e.d(fVar2, (YourLibraryXEvent.f) yourLibraryXEvent2);
            } else {
                if (yourLibraryXEvent2 instanceof YourLibraryXEvent.u) {
                    YourLibraryXEvent.u uVar = (YourLibraryXEvent.u) yourLibraryXEvent2;
                    if (h.a(fVar2.c().e(), uVar.a())) {
                        e0<f, c> h = e0.h();
                        h.d(h, "noChange()");
                        return h;
                    }
                    f a4 = f.a(fVar2, null, null, null, null, d.a(fVar2.c(), null, null, uVar.a(), 3), null, 0, 0, null, null, knf.e(0, fVar2.i()), null, false, null, null, 31727);
                    h.e(a4, "model");
                    YourLibraryXSortOption n = a4.n();
                    d c = a4.c();
                    if (a4.g().isEmpty()) {
                        jnf2 = a4.f().f();
                    } else {
                        jnf2 = a4.g();
                    }
                    k kVar = new k(n, c, jnf2, null);
                    if (kotlin.text.e.n(uVar.a())) {
                        e0<f, c> g = e0.g(a4, z42.l(new c.m(k.a(kVar, null, null, null, fVar2.m(), 7), new a(-1, subscriptionType, true, true))));
                        h.d(g, "next(\n            newMod…)\n            )\n        )");
                        return g;
                    }
                    h.e(a4, "model");
                    e0<f, c> g2 = e0.g(a4, z42.l(new c.m(kVar, new a(a4.e().a() + 1, SubscriptionType.SEARCH, false, true, 4))));
                    h.d(g2, "next(\n            newMod…)\n            )\n        )");
                    return g2;
                } else if (yourLibraryXEvent2 instanceof YourLibraryXEvent.b) {
                    e0<f, c> a5 = e0.a(z42.l(c.a.a));
                    h.d(a5, "dispatch(effects(CloseCurrentPage))");
                    return a5;
                } else if (yourLibraryXEvent2 instanceof YourLibraryXEvent.n) {
                    return e.e(fVar2, (YourLibraryXEvent.n) yourLibraryXEvent2);
                } else {
                    if (yourLibraryXEvent2 instanceof YourLibraryXEvent.a0) {
                        return e.i(fVar2, (YourLibraryXEvent.a0) yourLibraryXEvent2);
                    }
                    if (yourLibraryXEvent2 instanceof YourLibraryXEvent.q) {
                        return e.f(fVar2, (YourLibraryXEvent.q) yourLibraryXEvent2);
                    }
                    if (yourLibraryXEvent2 instanceof YourLibraryXEvent.t) {
                        YourLibraryXEvent.t tVar = (YourLibraryXEvent.t) yourLibraryXEvent2;
                        if (h.a(fVar2.m(), tVar.a())) {
                            e0<f, c> h2 = e0.h();
                            h.d(h2, "noChange()");
                            return h2;
                        }
                        String e = fVar2.c().e();
                        if (e == null || kotlin.text.e.n(e)) {
                            f a6 = f.a(fVar2, null, null, null, null, null, null, 0, 0, null, null, null, null, false, null, tVar.a(), 16383);
                            h.e(a6, "model");
                            YourLibraryXSortOption n2 = a6.n();
                            d c2 = a6.c();
                            if (a6.g().isEmpty()) {
                                jnf = a6.f().f();
                            } else {
                                jnf = a6.g();
                            }
                            e0<f, c> g3 = e0.g(a6, z42.l(new c.m(k.a(new k(n2, c2, jnf, null), null, null, null, tVar.a(), 7), new a(-1, subscriptionType, true, true))));
                            h.d(g3, "next(\n            newMod…)\n            )\n        )");
                            return g3;
                        }
                        e0<f, c> f = e0.f(f.a(fVar2, null, null, null, null, null, null, 0, 0, null, null, null, null, false, null, tVar.a(), 16383));
                        h.d(f, "next(model.copy(recentSearchesUris = event.uris))");
                        return f;
                    } else if (yourLibraryXEvent2 instanceof YourLibraryXEvent.y) {
                        return e.g(((YourLibraryXEvent.y) yourLibraryXEvent2).a());
                    } else {
                        if (yourLibraryXEvent2 instanceof YourLibraryXEvent.z) {
                            return e.h(((YourLibraryXEvent.z) yourLibraryXEvent2).a());
                        }
                        if (yourLibraryXEvent2 instanceof YourLibraryXEvent.p) {
                            e0<f, c> h3 = e0.h();
                            h.d(h3, "noChange()");
                            return h3;
                        }
                        e0<f, c> h4 = e0.h();
                        h.d(h4, "noChange()");
                        return h4;
                    }
                }
            }
        }
    }
}
