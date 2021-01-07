package com.spotify.music.features.entityselector.pages.search;

import android.view.View;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.preview.v;
import io.reactivex.s;
import java.util.List;
import java.util.Map;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class SearchInjector {
    private final v a;
    private final vz0 b;
    private final qz0 c;
    private final s<Map<String, String>> d;
    private final nmf<uy4, f> e;
    private final tg0<View> f;
    private final cmf<f> g;
    private final SnackbarManager h;
    private final s<List<ty4>> i;
    private final dz4 j;

    public SearchInjector(v vVar, vz0 vz0, qz0 qz0, s<Map<String, String>> sVar, nmf<uy4, f> nmf, tg0<View> tg0, cmf<f> cmf, SnackbarManager snackbarManager, s<List<ty4>> sVar2, dz4 dz4) {
        h.e(vVar, "previewPlayer");
        h.e(vz0, "searchviewEndpoint");
        h.e(qz0, "searchQueryBuilder");
        h.e(sVar, "rxProductState");
        h.e(nmf, "addTrackAction");
        h.e(tg0, "snackbarViewProducer");
        h.e(cmf, "dismissAction");
        h.e(snackbarManager, "snackbarManager");
        h.e(sVar2, "userSelectionListObservable");
        h.e(dz4, "entitySelectorLogger");
        this.a = vVar;
        this.b = vz0;
        this.c = qz0;
        this.d = sVar;
        this.e = nmf;
        this.f = tg0;
        this.g = cmf;
        this.h = snackbarManager;
        this.i = sVar2;
        this.j = dz4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.spotify.music.features.entityselector.pages.search.g] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.spotify.music.features.entityselector.pages.search.h] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.MobiusLoop.g<defpackage.wz4, defpackage.uz4> a(defpackage.wz4 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "defaultModel"
            kotlin.jvm.internal.h.e(r10, r0)
            com.spotify.music.features.entityselector.pages.search.SearchInjector$createLoopFactory$1 r0 = com.spotify.music.features.entityselector.pages.search.SearchInjector$createLoopFactory$1.a
            if (r0 == 0) goto L_0x000f
            com.spotify.music.features.entityselector.pages.search.h r1 = new com.spotify.music.features.entityselector.pages.search.h
            r1.<init>(r0)
            r0 = r1
        L_0x000f:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            com.spotify.music.preview.v r1 = r9.a
            vz0 r2 = r9.b
            qz0 r3 = r9.c
            nmf<uy4, kotlin.f> r4 = r9.e
            tg0<android.view.View> r5 = r9.f
            cmf<kotlin.f> r6 = r9.g
            com.spotify.encore.mobile.snackbar.SnackbarManager r7 = r9.h
            dz4 r8 = r9.j
            io.reactivex.w r1 = com.spotify.music.features.entityselector.pages.search.effecthandlers.k.a(r1, r2, r3, r4, r5, r6, r7, r8)
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r0, r1)
            com.spotify.music.preview.v r1 = r9.a
            io.reactivex.s r1 = r1.g()
            java.lang.String r2 = "previewPlayer.observePreviewPlayerState()"
            kotlin.jvm.internal.h.d(r1, r2)
            io.reactivex.s<java.util.Map<java.lang.String, java.lang.String>> r2 = r9.d
            io.reactivex.s<java.util.List<ty4>> r3 = r9.i
            com.spotify.mobius.q r1 = defpackage.b05.a(r1, r2, r3)
            com.spotify.mobius.MobiusLoop$f r0 = r0.h(r1)
            com.spotify.mobius.android.e r1 = new com.spotify.mobius.android.e
            java.lang.String r2 = "Search"
            r1.<init>(r2)
            com.spotify.mobius.MobiusLoop$f r0 = r0.f(r1)
            java.lang.String r1 = "RxMobius.loop<SearchMode…roidLogger.tag(\"Search\"))"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.music.features.entityselector.pages.search.SearchInjector$createController$1 r1 = com.spotify.music.features.entityselector.pages.search.SearchInjector$createController$1.a
            if (r1 == 0) goto L_0x005a
            com.spotify.music.features.entityselector.pages.search.g r2 = new com.spotify.music.features.entityselector.pages.search.g
            r2.<init>(r1)
            r1 = r2
        L_0x005a:
            com.spotify.mobius.t r1 = (com.spotify.mobius.t) r1
            u92 r2 = defpackage.u92.b()
            com.spotify.mobius.MobiusLoop$g r10 = com.spotify.mobius.z.a(r0, r10, r1, r2)
            java.lang.String r0 = "Mobius.controller(\n     …Runner.create()\n        )"
            kotlin.jvm.internal.h.d(r10, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.entityselector.pages.search.SearchInjector.a(wz4):com.spotify.mobius.MobiusLoop$g");
    }
}
