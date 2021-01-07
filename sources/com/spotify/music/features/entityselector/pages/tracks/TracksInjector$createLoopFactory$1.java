package com.spotify.music.features.entityselector.pages.tracks;

import com.spotify.mobius.e0;
import defpackage.c05;
import defpackage.d05;
import defpackage.g05;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class TracksInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<f05, d05, e0<f05, c05>> {
    public static final TracksInjector$createLoopFactory$1 a = new TracksInjector$createLoopFactory$1();

    TracksInjector$createLoopFactory$1() {
        super(2, e05.class, "update", "update(Lcom/spotify/music/features/entityselector/pages/tracks/domain/TracksModel;Lcom/spotify/music/features/entityselector/pages/tracks/domain/TracksEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<f05, c05> invoke(f05 f05, d05 d05) {
        boolean z;
        boolean z2;
        f05 f052 = f05;
        d05 d052 = d05;
        h.e(f052, "p1");
        h.e(d052, "p2");
        c05.f fVar = c05.f.a;
        h.e(f052, "model");
        h.e(d052, "event");
        if (d052 instanceof d05.g) {
            e0<f05, c05> f = e0.f(f05.a(f052, ((d05.g) d052).a(), null, null, null, null, 30));
            h.d(f, "next(model.copy(tracksState = event.tracksState))");
            return f;
        } else if (d052 instanceof d05.b) {
            if (f052.d() instanceof g05.c) {
                e0<f05, c05> h = e0.h();
                h.d(h, "noChange()");
                return h;
            }
            e0<f05, c05> g = e0.g(f05.a(f052, g05.d.a, null, null, null, null, 30), z42.l(new c05.b(f052.c())));
            h.d(g, "next(\n            model.…playlistItems))\n        )");
            return g;
        } else if (d052 instanceof d05.a) {
            d05.a aVar = (d05.a) d052;
            g05 d = f052.d();
            if (d != null) {
                List<uy4> a2 = ((g05.c) d).a();
                ArrayList arrayList = new ArrayList();
                for (T t : a2) {
                    if (!h.a(t.c(), aVar.a().c())) {
                        arrayList.add(t);
                    }
                }
                if (aVar.a().f()) {
                    e0<f05, c05> g2 = e0.g(f05.a(f052, new g05.c(arrayList), null, null, null, null, 30), z42.l(new c05.a(aVar.a()), fVar));
                    h.d(g2, "next(\n            model.…), StopPreview)\n        )");
                    return g2;
                }
                e0<f05, c05> g3 = e0.g(f05.a(f052, new g05.c(arrayList), null, null, null, null, 30), z42.l(new c05.a(aVar.a())));
                h.d(g3, "next(\n            model.…t(event.track))\n        )");
                return g3;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.features.entityselector.pages.tracks.domain.TracksState.Loaded");
        } else if (d052 instanceof d05.d) {
            e0<f05, c05> a3 = e0.a(z42.l(new c05.e(((d05.d) d052).a())));
            h.d(a3, "dispatch(effects(PlayPreview(event.previewId)))");
            return a3;
        } else if (d052 instanceof d05.c) {
            e0<f05, c05> a4 = e0.a(z42.l(new c05.d(((d05.c) d052).a())));
            h.d(a4, "dispatch(effects(PausePreview(event.previewId)))");
            return a4;
        } else if (d052 instanceof d05.e) {
            d05.e eVar = (d05.e) d052;
            if (f052.d() instanceof g05.c) {
                List<uy4> a5 = ((g05.c) f052.d()).a();
                ArrayList arrayList2 = new ArrayList(d.e(a5, 10));
                for (T t2 : a5) {
                    if (t2.f() && (!h.a(t2.getPreviewId(), eVar.a().g()))) {
                        t2 = (T) uy4.a(t2, null, null, null, null, null, false, 31);
                    } else if (!t2.f() && h.a(t2.getPreviewId(), eVar.a().g())) {
                        t2 = (T) uy4.a(t2, null, null, null, null, null, true, 31);
                    }
                    arrayList2.add(t2);
                }
                e0<f05, c05> f2 = e0.f(f05.a(f052, new g05.c(arrayList2), eVar.a(), null, null, null, 28));
                h.d(f2, "next(\n            model.…)\n            )\n        )");
                return f2;
            }
            e0<f05, c05> f3 = e0.f(f05.a(f052, null, eVar.a(), null, null, null, 29));
            h.d(f3, "next(model.copy(previewP…vent.previewPlayerState))");
            return f3;
        } else if (d052 instanceof d05.f) {
            e0<f05, c05> a6 = e0.a(z42.l(new c05.c(f052.c(), f052.b()), fVar));
            h.d(a6, "dispatch(effects(OpenSea….listName), StopPreview))");
            return a6;
        } else if (d052 instanceof d05.h) {
            d05.h hVar = (d05.h) d052;
            if (f052.d() instanceof g05.c) {
                List<uy4> a7 = ((g05.c) f052.d()).a();
                ArrayList arrayList3 = new ArrayList();
                for (T t3 : a7) {
                    T t4 = t3;
                    List<ty4> a8 = hVar.a();
                    if (!(a8 instanceof Collection) || !a8.isEmpty()) {
                        Iterator<T> it = a8.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (next instanceof uy4) {
                                z2 = h.a(next.c(), t4.c());
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                        arrayList3.add(t3);
                    }
                }
                e0<f05, c05> f4 = e0.f(f05.a(f052, new g05.c(arrayList3), null, null, null, null, 30));
                h.d(f4, "next(model.copy(tracksSt…teredUserSelectionList)))");
                return f4;
            }
            e0<f05, c05> h2 = e0.h();
            h.d(h2, "noChange()");
            return h2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
