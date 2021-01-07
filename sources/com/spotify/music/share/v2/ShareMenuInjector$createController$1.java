package com.spotify.music.share.v2;

import com.spotify.mobius.s;
import defpackage.h2d;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ShareMenuInjector$createController$1 extends FunctionReferenceImpl implements nmf<k2d, s<k2d, h2d>> {
    public static final ShareMenuInjector$createController$1 a = new ShareMenuInjector$createController$1();

    ShareMenuInjector$createController$1() {
        super(1, j2d.class, "init", "init(Lcom/spotify/music/share/v2/domain/ShareMenuModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<k2d, h2d> invoke(k2d k2d) {
        k2d k2d2 = k2d;
        h.e(k2d2, "p1");
        h.e(k2d2, "model");
        if (h.a(k2d2, new k2d(k2d2.f(), k2d2.h(), k2d2.d(), k2d2.c(), null, null, null, 112))) {
            s<k2d, h2d> c = s.c(k2d2, d.H(new h2d.c(k2d2.f()), new h2d.b(k2d2.f(), k2d2.c()), h2d.a.a));
            h.d(c, "First.first(\n           …r\n            )\n        )");
            return c;
        }
        s<k2d, h2d> b = s.b(k2d2);
        h.d(b, "First.first(model)");
        return b;
    }
}
