package com.spotify.instrumentation.navigation.logger;

import com.spotify.instrumentation.navigation.logger.b;
import com.spotify.instrumentation.navigation.logger.f;
import com.spotify.instrumentation.navigation.logger.g;
import com.spotify.instrumentation.navigation.logger.h;
import com.spotify.mobius.e0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class NavigationLogger$loop$1 extends FunctionReferenceImpl implements rmf<e, b, e0<e, g>> {
    public static final NavigationLogger$loop$1 a = new NavigationLogger$loop$1();

    NavigationLogger$loop$1() {
        super(2, a.class, "update", "update(Lcom/spotify/instrumentation/navigation/logger/Model;Lcom/spotify/instrumentation/navigation/logger/Event;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<e, g> invoke(e eVar, b bVar) {
        f fVar;
        e eVar2 = eVar;
        b bVar2 = bVar;
        h.e(eVar2, "p1");
        h.e(bVar2, "p2");
        h.d dVar = h.d.a;
        f.C0160f fVar2 = f.C0160f.a;
        NavigationTransactionState navigationTransactionState = NavigationTransactionState.WAITING_FOR_LOCATION_CHANGE;
        h.c cVar = h.c.a;
        AppForegroundState appForegroundState = AppForegroundState.FOREGROUND;
        AppForegroundState appForegroundState2 = AppForegroundState.BACKGROUND;
        f fVar3 = f.c.a;
        List<c> list = EmptyList.a;
        NavigationTransactionState navigationTransactionState2 = NavigationTransactionState.WAITING_FOR_COMPLETION;
        kotlin.jvm.internal.h.e(eVar2, "model");
        kotlin.jvm.internal.h.e(bVar2, "event");
        n e = eVar2.e();
        NavigationTransactionState e2 = e != null ? e.e() : null;
        if (e2 != null) {
            int ordinal = e2.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    if (bVar2 instanceof b.e) {
                        b.e eVar3 = (b.e) bVar2;
                        e0<e, g> g = e0.g(e.c(eVar2, eVar3.a(), null, null, list, 4), z42.l(new g.a(eVar3.a(), eVar2.d(), e.c(), e.d(), eVar2.f())));
                        kotlin.jvm.internal.h.d(g, "next(\n            model.…vigationEffect)\n        )");
                        return g;
                    } else if (bVar2 instanceof b.f) {
                        e0<e, g> f = e0.f(e.c(eVar2, null, e.a(((b.f) bVar2).a(), navigationTransactionState, d.D(e.d(), new h.e(e.e(), e.c()))), null, null, 13));
                        kotlin.jvm.internal.h.d(f, "next(\n            model.…)\n            )\n        )");
                        return f;
                    } else if (bVar2 instanceof b.d) {
                        e0<e, g> f2 = e0.f(e.c(eVar2, null, e.a(((b.d) bVar2).a(), navigationTransactionState2, d.D(e.d(), new h.b(e.c()))), null, null, 13));
                        kotlin.jvm.internal.h.d(f2, "next(\n            model.…)\n            )\n        )");
                        return f2;
                    } else if (bVar2 instanceof b.a) {
                        b.a aVar = (b.a) bVar2;
                        d a2 = aVar.a();
                        d d = eVar2.d();
                        if (e.c().a()) {
                            fVar3 = e.c();
                        }
                        g.a aVar2 = new g.a(a2, d, fVar3, e.d(), eVar2.f());
                        if (e.c().a()) {
                            e = null;
                        }
                        e0<e, g> g2 = e0.g(eVar2.b(aVar.a(), e, appForegroundState2, list), z42.l(aVar2));
                        kotlin.jvm.internal.h.d(g2, "next(\n            model.…vigationEffect)\n        )");
                        return g2;
                    } else if (bVar2 instanceof b.C0159b) {
                        e0<e, g> f3 = e0.f(e.c(eVar2, null, null, appForegroundState, null, 11));
                        kotlin.jvm.internal.h.d(f3, "next(\n        model.copy…OREGROUND\n        )\n    )");
                        return f3;
                    } else if (bVar2 instanceof b.c) {
                        e0<e, g> f4 = e0.f(eVar2.a(((b.c) bVar2).a()));
                        kotlin.jvm.internal.h.d(f4, "next(model.addInteraction(event.interaction))");
                        return f4;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else if (bVar2 instanceof b.d) {
                b.d dVar2 = (b.d) bVar2;
                if (kotlin.jvm.internal.h.a(dVar2.a(), fVar2)) {
                    fVar = e.c();
                    list = d.t(h.a.a);
                } else if (!kotlin.jvm.internal.h.a(dVar2.a(), e.c())) {
                    fVar = dVar2.a();
                    list = d.u(new h.e(e.e(), e.c()), cVar);
                } else {
                    fVar = e.c();
                }
                e0<e, g> f5 = e0.f(e.c(eVar2, null, e.a(fVar, navigationTransactionState2, d.C(e.d(), list)), null, null, 13));
                kotlin.jvm.internal.h.d(f5, "next(\n            model.…)\n            )\n        )");
                return f5;
            } else if (bVar2 instanceof b.f) {
                e0<e, g> f6 = e0.f(e.c(eVar2, null, n.b(e, ((b.f) bVar2).a(), null, d.D(e.d(), new h.e(e.e(), e.c())), 2), null, null, 13));
                kotlin.jvm.internal.h.d(f6, "next(\n            model.…)\n            )\n        )");
                return f6;
            } else if (bVar2 instanceof b.e) {
                b.e eVar4 = (b.e) bVar2;
                e0<e, g> g3 = e0.g(e.c(eVar2, eVar4.a(), null, null, list, 4), z42.l(new g.a(eVar4.a(), eVar2.d(), e.c(), d.D(e.d(), dVar), eVar2.f())));
                kotlin.jvm.internal.h.d(g3, "next(\n            model.…vigationEffect)\n        )");
                return g3;
            } else if (bVar2 instanceof b.a) {
                b.a aVar3 = (b.a) bVar2;
                d a3 = aVar3.a();
                d d2 = eVar2.d();
                if (e.c().a()) {
                    fVar3 = e.c();
                }
                g.a aVar4 = new g.a(a3, d2, fVar3, e.d(), eVar2.f());
                if (e.c().a()) {
                    e = null;
                }
                e0<e, g> g4 = e0.g(eVar2.b(aVar3.a(), e, appForegroundState2, list), z42.l(aVar4));
                kotlin.jvm.internal.h.d(g4, "next(\n            model.…vigationEffect)\n        )");
                return g4;
            } else if (bVar2 instanceof b.C0159b) {
                e0<e, g> f7 = e0.f(e.c(eVar2, null, null, appForegroundState, null, 11));
                kotlin.jvm.internal.h.d(f7, "next(model.copy(appForeg…egroundState.FOREGROUND))");
                return f7;
            } else if (bVar2 instanceof b.c) {
                e0<e, g> f8 = e0.f(eVar2.a(((b.c) bVar2).a()));
                kotlin.jvm.internal.h.d(f8, "next(model.addInteraction(event.interaction))");
                return f8;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (bVar2 instanceof b.f) {
            e0<e, g> f9 = e0.f(e.c(eVar2, null, new n(((b.f) bVar2).a(), navigationTransactionState, list), null, null, 13));
            kotlin.jvm.internal.h.d(f9, "next(\n        model.copy…        )\n        )\n    )");
            return f9;
        } else if (bVar2 instanceof b.d) {
            e0<e, g> f10 = e0.f(e.c(eVar2, null, new n(((b.d) bVar2).a(), navigationTransactionState2, d.t(cVar)), null, null, 13));
            kotlin.jvm.internal.h.d(f10, "next(\n        model.copy…        )\n        )\n    )");
            return f10;
        } else if (bVar2 instanceof b.e) {
            b.e eVar5 = (b.e) bVar2;
            if (kotlin.jvm.internal.h.a(eVar2.d(), eVar5.a())) {
                e0<e, g> h = e0.h();
                kotlin.jvm.internal.h.d(h, "noChange()");
                return h;
            }
            e0<e, g> g5 = e0.g(e.c(eVar2, eVar5.a(), null, null, list, 6), z42.l(new g.a(eVar5.a(), eVar2.d(), fVar2, d.u(cVar, dVar), eVar2.f())));
            kotlin.jvm.internal.h.d(g5, "next(\n                mo…tionEffect)\n            )");
            return g5;
        } else if (bVar2 instanceof b.a) {
            b.a aVar5 = (b.a) bVar2;
            e0<e, g> g6 = e0.g(e.c(eVar2, aVar5.a(), null, appForegroundState2, list, 2), z42.l(new g.a(aVar5.a(), eVar2.d(), fVar3, list, eVar2.f())));
            kotlin.jvm.internal.h.d(g6, "next(\n            model.…vigationEffect)\n        )");
            return g6;
        } else if (bVar2 instanceof b.C0159b) {
            e0<e, g> f11 = e0.f(e.c(eVar2, null, new n(f.b.a, navigationTransactionState2, list), appForegroundState, null, 9));
            kotlin.jvm.internal.h.d(f11, "next(\n        model.copy…        )\n        )\n    )");
            return f11;
        } else if (bVar2 instanceof b.c) {
            e0<e, g> f12 = e0.f(eVar2.a(((b.c) bVar2).a()));
            kotlin.jvm.internal.h.d(f12, "next(model.addInteraction(event.interaction))");
            return f12;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
