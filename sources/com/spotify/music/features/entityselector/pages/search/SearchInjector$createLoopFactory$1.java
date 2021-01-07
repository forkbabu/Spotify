package com.spotify.music.features.entityselector.pages.search;

import com.spotify.mobius.e0;
import defpackage.tz4;
import defpackage.uz4;
import defpackage.xz4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SearchInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<wz4, uz4, e0<wz4, tz4>> {
    public static final SearchInjector$createLoopFactory$1 a = new SearchInjector$createLoopFactory$1();

    SearchInjector$createLoopFactory$1() {
        super(2, vz4.class, "update", "update(Lcom/spotify/music/features/entityselector/pages/search/domain/SearchModel;Lcom/spotify/music/features/entityselector/pages/search/domain/SearchEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<wz4, tz4> invoke(wz4 wz4, uz4 uz4) {
        T t;
        boolean z;
        wz4 wz42 = wz4;
        uz4 uz42 = uz4;
        h.e(wz42, "p1");
        h.e(uz42, "p2");
        h.e(wz42, "model");
        h.e(uz42, "event");
        if (uz42 instanceof uz4.f) {
            e0<wz4, tz4> f = e0.f(wz4.a(wz42, ((uz4.f) uz42).a(), null, null, null, null, null, 62));
            h.d(f, "next(model.copy(searchState = event.searchState))");
            return f;
        } else if (uz42 instanceof uz4.e) {
            uz4.e eVar = (uz4.e) uz42;
            if (eVar.a().length() == 0) {
                e0<wz4, tz4> f2 = e0.f(wz4.a(wz42, xz4.a.a, null, null, null, null, null, 62));
                h.d(f2, "next(model.copy(searchState = SearchState.Empty))");
                return f2;
            }
            String e = wz42.e();
            if (e == null) {
                e = "";
            }
            e0<wz4, tz4> a2 = e0.a(z42.l(new tz4.c(eVar.a(), e)));
            h.d(a2, "dispatch(effects(FetchSe…searchQuery, catalogue)))");
            return a2;
        } else if (uz42 instanceof uz4.a) {
            uz4.a aVar = (uz4.a) uz42;
            boolean contains = wz42.c().contains(aVar.a().c());
            List<ty4> f3 = wz42.f();
            uy4 a3 = aVar.a();
            Iterator<T> it = f3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(t instanceof uy4) || !h.a(t.c(), a3.c())) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            boolean z2 = t != null;
            if (contains || z2) {
                e0<wz4, tz4> a4 = e0.a(z42.l(new tz4.f(wz42.b())));
                h.d(a4, "dispatch(effects(ShowTra…nackbar(model.listName)))");
                return a4;
            }
            e0<wz4, tz4> a5 = e0.a(z42.l(new tz4.a(aVar.a()), tz4.g.a, tz4.b.a));
            h.d(a5, "dispatch(effects(AddTrac…), StopPreview, Dismiss))");
            return a5;
        } else if (uz42 instanceof uz4.c) {
            e0<wz4, tz4> a6 = e0.a(z42.l(new tz4.e(((uz4.c) uz42).a())));
            h.d(a6, "dispatch(effects(PlayPreview(event.previewId)))");
            return a6;
        } else if (uz42 instanceof uz4.b) {
            e0<wz4, tz4> a7 = e0.a(z42.l(new tz4.d(((uz4.b) uz42).a())));
            h.d(a7, "dispatch(effects(PausePreview(event.previewId)))");
            return a7;
        } else if (uz42 instanceof uz4.d) {
            uz4.d dVar = (uz4.d) uz42;
            if (wz42.d() instanceof xz4.c) {
                List<uy4> a8 = ((xz4.c) wz42.d()).a();
                ArrayList arrayList = new ArrayList(d.e(a8, 10));
                for (T t2 : a8) {
                    if (t2.f() && (!h.a(t2.getPreviewId(), dVar.a().g()))) {
                        t2 = (T) uy4.a(t2, null, null, null, null, null, false, 31);
                    } else if (!t2.f() && h.a(t2.getPreviewId(), dVar.a().g())) {
                        t2 = (T) uy4.a(t2, null, null, null, null, null, true, 31);
                    }
                    arrayList.add(t2);
                }
                e0<wz4, tz4> f4 = e0.f(wz4.a(wz42, new xz4.c(arrayList), dVar.a(), null, null, null, null, 60));
                h.d(f4, "next(\n            model.…)\n            )\n        )");
                return f4;
            }
            e0<wz4, tz4> f5 = e0.f(wz4.a(wz42, null, dVar.a(), null, null, null, null, 61));
            h.d(f5, "next(model.copy(previewP…vent.previewPlayerState))");
            return f5;
        } else if (uz42 instanceof uz4.g) {
            e0<wz4, tz4> f6 = e0.f(wz4.a(wz42, null, null, ((uz4.g) uz42).a(), null, null, null, 59));
            h.d(f6, "next(model.copy(userCatalogue = event.catalogue))");
            return f6;
        } else if (uz42 instanceof uz4.h) {
            e0<wz4, tz4> f7 = e0.f(wz4.a(wz42, null, null, null, null, null, ((uz4.h) uz42).a(), 31));
            h.d(f7, "next(model.copy(userSele…event.userSelectionList))");
            return f7;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
