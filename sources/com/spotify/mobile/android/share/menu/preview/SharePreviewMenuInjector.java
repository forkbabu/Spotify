package com.spotify.mobile.android.share.menu.preview;

import com.spotify.mobile.android.share.menu.preview.api.c;
import com.spotify.mobile.android.share.menu.preview.api.d;
import com.spotify.mobile.android.share.menu.preview.api.h;
import com.spotify.mobile.android.share.menu.preview.destinations.a;
import io.reactivex.y;
import java.util.List;
import java.util.Map;

public final class SharePreviewMenuInjector {
    private final List<cmf<d>> a;
    private final a b;
    private final Map<String, rmf<com.spotify.mobile.android.share.menu.preview.api.a, c, h>> c;
    private final SharePreviewMenuFragment d;
    private final y e;
    private final y f;

    public SharePreviewMenuInjector(List<cmf<d>> list, a aVar, Map<String, rmf<com.spotify.mobile.android.share.menu.preview.api.a, c, h>> map, SharePreviewMenuFragment sharePreviewMenuFragment, y yVar, y yVar2) {
        kotlin.jvm.internal.h.e(list, "sharePayloadProviderList");
        kotlin.jvm.internal.h.e(aVar, "shareDestinationsProvider");
        kotlin.jvm.internal.h.e(map, "shareDestinationActionMap");
        kotlin.jvm.internal.h.e(sharePreviewMenuFragment, "sharePreviewMenuFragment");
        kotlin.jvm.internal.h.e(yVar, "computationScheduler");
        kotlin.jvm.internal.h.e(yVar2, "ioScheduler");
        this.a = list;
        this.b = aVar;
        this.c = map;
        this.d = sharePreviewMenuFragment;
        this.e = yVar;
        this.f = yVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.spotify.mobile.android.share.menu.preview.f] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.spotify.mobile.android.share.menu.preview.g] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.MobiusLoop.g<com.spotify.mobile.android.share.menu.preview.domain.SharePreviewMenuModel, com.spotify.mobile.android.share.menu.preview.domain.d> b(com.spotify.mobile.android.share.menu.preview.domain.SharePreviewMenuModel r6) {
        /*
            r5 = this;
            java.lang.String r0 = "defaultModel"
            kotlin.jvm.internal.h.e(r6, r0)
            com.spotify.mobile.android.share.menu.preview.SharePreviewMenuInjector$createLoopFactory$1 r0 = com.spotify.mobile.android.share.menu.preview.SharePreviewMenuInjector$createLoopFactory$1.a
            if (r0 == 0) goto L_0x000f
            com.spotify.mobile.android.share.menu.preview.g r1 = new com.spotify.mobile.android.share.menu.preview.g
            r1.<init>(r0)
            r0 = r1
        L_0x000f:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            java.util.List<cmf<com.spotify.mobile.android.share.menu.preview.api.d>> r1 = r5.a
            java.util.Map<java.lang.String, rmf<com.spotify.mobile.android.share.menu.preview.api.a, com.spotify.mobile.android.share.menu.preview.api.c, com.spotify.mobile.android.share.menu.preview.api.h>> r2 = r5.c
            com.spotify.mobile.android.share.menu.preview.SharePreviewMenuFragment r3 = r5.d
            io.reactivex.y r4 = r5.f
            io.reactivex.w r1 = defpackage.io1.a(r1, r2, r3, r4)
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r0, r1)
            com.spotify.mobile.android.share.menu.preview.destinations.a r1 = r5.b
            com.spotify.mobius.q r1 = defpackage.ko1.a(r1)
            com.spotify.mobius.MobiusLoop$f r0 = r0.h(r1)
            com.spotify.mobile.android.share.menu.preview.a r1 = new com.spotify.mobile.android.share.menu.preview.a
            r2 = 0
            r1.<init>(r2, r5)
            com.spotify.mobius.MobiusLoop$f r0 = r0.d(r1)
            com.spotify.mobile.android.share.menu.preview.a r1 = new com.spotify.mobile.android.share.menu.preview.a
            r2 = 1
            r1.<init>(r2, r5)
            com.spotify.mobius.MobiusLoop$f r0 = r0.b(r1)
            com.spotify.mobius.android.e r1 = new com.spotify.mobius.android.e
            java.lang.String r2 = "SharePreviewMenu"
            r1.<init>(r2)
            com.spotify.mobius.MobiusLoop$f r0 = r0.f(r1)
            java.lang.String r1 = "RxMobius.loop<SharePrevi….tag(\"SharePreviewMenu\"))"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.mobile.android.share.menu.preview.SharePreviewMenuInjector$createController$1 r1 = com.spotify.mobile.android.share.menu.preview.SharePreviewMenuInjector$createController$1.a
            if (r1 == 0) goto L_0x0059
            com.spotify.mobile.android.share.menu.preview.f r2 = new com.spotify.mobile.android.share.menu.preview.f
            r2.<init>(r1)
            r1 = r2
        L_0x0059:
            com.spotify.mobius.t r1 = (com.spotify.mobius.t) r1
            u92 r2 = defpackage.u92.b()
            com.spotify.mobius.MobiusLoop$g r6 = com.spotify.mobius.z.a(r0, r6, r1, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.share.menu.preview.SharePreviewMenuInjector.b(com.spotify.mobile.android.share.menu.preview.domain.SharePreviewMenuModel):com.spotify.mobius.MobiusLoop$g");
    }
}
