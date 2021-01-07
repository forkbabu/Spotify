package com.spotify.mobile.android.share.menu.preview.domain;

import com.spotify.mobile.android.share.menu.preview.domain.b;
import com.spotify.mobile.android.share.menu.preview.domain.c;
import com.spotify.mobile.android.share.menu.preview.domain.d;
import com.spotify.mobius.e0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class e {
    public static final e0<SharePreviewMenuModel, c> a(SharePreviewMenuModel sharePreviewMenuModel, d dVar) {
        c.a aVar = c.a.a;
        h.e(sharePreviewMenuModel, "model");
        h.e(dVar, "event");
        if (dVar instanceof d.b) {
            e0<SharePreviewMenuModel, c> f = e0.f(SharePreviewMenuModel.a(sharePreviewMenuModel, ((d.b) dVar).a(), null, 2));
            h.d(f, "next(\n            model.…ationListState)\n        )");
            return f;
        } else if (dVar instanceof d.c) {
            d.c cVar = (d.c) dVar;
            e0<SharePreviewMenuModel, c> g = e0.g(b(sharePreviewMenuModel, cVar.a(), b.c.a), z42.l(new c.b(cVar.a())));
            h.d(g, "next(\n            model.….payloadIndex))\n        )");
            return g;
        } else if (dVar instanceof d.C0189d) {
            d.C0189d dVar2 = (d.C0189d) dVar;
            e0<SharePreviewMenuModel, c> f2 = e0.f(b(sharePreviewMenuModel, dVar2.a(), dVar2.b()));
            h.d(f2, "next(\n            model.…e\n            )\n        )");
            return f2;
        } else if (dVar instanceof d.e) {
            d.e eVar = (d.e) dVar;
            b bVar = sharePreviewMenuModel.c().get(eVar.b());
            if (bVar instanceof b.C0187b) {
                e0<SharePreviewMenuModel, c> a = e0.a(z42.l(new c.C0188c(eVar.a(), ((b.C0187b) bVar).a())));
                h.d(a, "dispatch(effects(Share(e…loadState.sharePayload)))");
                return a;
            }
            e0<SharePreviewMenuModel, c> h = e0.h();
            h.d(h, "noChange()");
            return h;
        } else if (dVar instanceof d.f) {
            e0<SharePreviewMenuModel, c> a2 = e0.a(z42.l(aVar));
            h.d(a2, "dispatch(effects(Close))");
            return a2;
        } else if (dVar instanceof d.a) {
            e0<SharePreviewMenuModel, c> a3 = e0.a(z42.l(aVar));
            h.d(a3, "dispatch(effects(Close))");
            return a3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private static final SharePreviewMenuModel b(SharePreviewMenuModel sharePreviewMenuModel, int i, b bVar) {
        List<b> c = sharePreviewMenuModel.c();
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(c, 10));
        int i2 = 0;
        for (T t : c) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                T t2 = t;
                if (i2 == i) {
                    t2 = bVar;
                }
                arrayList.add(t2);
                i2 = i3;
            } else {
                kotlin.collections.d.L();
                throw null;
            }
        }
        return SharePreviewMenuModel.a(sharePreviewMenuModel, null, arrayList, 1);
    }
}
