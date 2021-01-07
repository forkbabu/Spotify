package com.spotify.music.features.blendtastematch;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.features.blendtastematch.api.a;
import com.spotify.music.features.blendtastematch.view.g;
import com.spotify.music.navigation.t;
import com.spotify.ubi.specification.factories.a0;
import kotlin.jvm.internal.h;

public final class BlendTasteMatchInjector {
    private final a a;
    private final g b;
    private final t c;
    private final ere d;
    private final a0 e;
    private final SnackbarManager f;

    public BlendTasteMatchInjector(a aVar, g gVar, t tVar, ere ere, a0 a0Var, SnackbarManager snackbarManager) {
        h.e(aVar, "blendInvitationEndpoint");
        h.e(gVar, "viewDismisser");
        h.e(tVar, "navigator");
        h.e(ere, "eventLogger");
        h.e(a0Var, "eventFactory");
        h.e(snackbarManager, "snackbarManager");
        this.a = aVar;
        this.b = gVar;
        this.c = tVar;
        this.d = ere;
        this.e = a0Var;
        this.f = snackbarManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.spotify.music.features.blendtastematch.a] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.spotify.music.features.blendtastematch.b] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.MobiusLoop.g<defpackage.w44, defpackage.t44> a(defpackage.w44 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "defaultModel"
            kotlin.jvm.internal.h.e(r8, r0)
            com.spotify.music.features.blendtastematch.BlendTasteMatchInjector$createLoopFactory$1 r0 = com.spotify.music.features.blendtastematch.BlendTasteMatchInjector$createLoopFactory$1.a
            if (r0 == 0) goto L_0x000f
            com.spotify.music.features.blendtastematch.b r1 = new com.spotify.music.features.blendtastematch.b
            r1.<init>(r0)
            r0 = r1
        L_0x000f:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            com.spotify.music.features.blendtastematch.api.a r1 = r7.a
            com.spotify.music.features.blendtastematch.view.g r2 = r7.b
            com.spotify.music.navigation.t r3 = r7.c
            ere r4 = r7.d
            com.spotify.ubi.specification.factories.a0 r5 = r7.e
            com.spotify.encore.mobile.snackbar.SnackbarManager r6 = r7.f
            io.reactivex.w r1 = defpackage.l54.a(r1, r2, r3, r4, r5, r6)
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r0, r1)
            r1 = 1
            io.reactivex.v[] r1 = new io.reactivex.v[r1]
            io.reactivex.s<java.lang.Object> r2 = io.reactivex.internal.operators.observable.o.a
            r3 = 0
            r1[r3] = r2
            com.spotify.mobius.q r1 = com.spotify.mobius.rx2.i.a(r1)
            com.spotify.mobius.MobiusLoop$f r0 = r0.h(r1)
            com.spotify.mobius.android.e r1 = new com.spotify.mobius.android.e
            java.lang.String r2 = "BlendTasteMatch"
            r1.<init>(r2)
            com.spotify.mobius.MobiusLoop$f r0 = r0.f(r1)
            java.lang.String r1 = "RxMobius.loop(\n         …r.tag(\"BlendTasteMatch\"))"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.music.features.blendtastematch.BlendTasteMatchInjector$createController$1 r1 = com.spotify.music.features.blendtastematch.BlendTasteMatchInjector$createController$1.a
            if (r1 == 0) goto L_0x004f
            com.spotify.music.features.blendtastematch.a r2 = new com.spotify.music.features.blendtastematch.a
            r2.<init>(r1)
            r1 = r2
        L_0x004f:
            com.spotify.mobius.t r1 = (com.spotify.mobius.t) r1
            u92 r2 = defpackage.u92.b()
            com.spotify.mobius.MobiusLoop$g r8 = com.spotify.mobius.z.a(r0, r8, r1, r2)
            java.lang.String r0 = "Mobius.controller(\n     …Runner.create()\n        )"
            kotlin.jvm.internal.h.d(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.blendtastematch.BlendTasteMatchInjector.a(w44):com.spotify.mobius.MobiusLoop$g");
    }
}
