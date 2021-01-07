package com.spotify.music.share.v2;

import com.spotify.mobius.e0;
import defpackage.h2d;
import defpackage.i2d;
import defpackage.l2d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ShareMenuInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<k2d, i2d, e0<k2d, h2d>> {
    public static final ShareMenuInjector$createLoopFactory$1 a = new ShareMenuInjector$createLoopFactory$1();

    ShareMenuInjector$createLoopFactory$1() {
        super(2, j2d.class, "update", "update(Lcom/spotify/music/share/v2/domain/ShareMenuModel;Lcom/spotify/music/share/v2/domain/ShareMenuEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<k2d, h2d> invoke(k2d k2d, i2d i2d) {
        k2d k2d2 = k2d;
        i2d i2d2 = i2d;
        h.e(k2d2, "p1");
        h.e(i2d2, "p2");
        h.e(k2d2, "model");
        h.e(i2d2, "event");
        if (i2d2 instanceof i2d.b) {
            e0<k2d, h2d> a2 = e0.a(d.G(new h2d.c(k2d2.f())));
            h.d(a2, "dispatch(setOf(FetchShar…ewData(model.shareData)))");
            return a2;
        } else if (i2d2 instanceof i2d.d) {
            e0<k2d, h2d> f = e0.f(k2d.a(k2d2, null, null, null, null, null, ((i2d.d) i2d2).a(), null, 95));
            h.d(f, "next(model.copy(previewD… event.previewShareData))");
            return f;
        } else if (i2d2 instanceof i2d.a) {
            e0<k2d, h2d> f2 = e0.f(k2d.a(k2d2, null, null, null, null, ((i2d.a) i2d2).a(), null, null, 111));
            h.d(f2, "next(model.copy(destinat…ns = event.destinations))");
            return f2;
        } else if (i2d2 instanceof i2d.e) {
            i2d.e eVar = (i2d.e) i2d2;
            e0<k2d, h2d> g = e0.g(k2d.a(k2d2, null, null, null, null, null, null, l2d.b.a, 63), d.G(new h2d.d(k2d2.f(), eVar.a(), k2d2.h(), eVar.b())));
            h.d(g, "next(\n            model.…vent.position))\n        )");
            return g;
        } else if (i2d2 instanceof i2d.c) {
            e0<k2d, h2d> f3 = e0.f(k2d.a(k2d2, null, null, null, null, null, null, ((i2d.c) i2d2).a(), 63));
            h.d(f3, "next(\n        model.copy…ult = event.result)\n    )");
            return f3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
