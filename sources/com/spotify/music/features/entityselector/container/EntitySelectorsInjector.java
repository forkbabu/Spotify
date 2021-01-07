package com.spotify.music.features.entityselector.container;

import android.view.View;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.features.entityselector.common.b;
import kotlin.jvm.internal.h;

public final class EntitySelectorsInjector {
    private final EntitySelectorFragment a;
    private final b b;
    private final SnackbarManager c;
    private final tg0<View> d;

    public EntitySelectorsInjector(EntitySelectorFragment entitySelectorFragment, b bVar, SnackbarManager snackbarManager, tg0<View> tg0) {
        h.e(entitySelectorFragment, "entitySelectorFragment");
        h.e(bVar, "userSelectionManager");
        h.e(snackbarManager, "snackbarManager");
        h.e(tg0, "snackbarViewProducer");
        this.a = entitySelectorFragment;
        this.b = bVar;
        this.c = snackbarManager;
        this.d = tg0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.spotify.music.features.entityselector.container.c] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.spotify.music.features.entityselector.container.d] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.MobiusLoop.g<defpackage.xy4, defpackage.wy4> a(defpackage.xy4 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "defaultModel"
            kotlin.jvm.internal.h.e(r5, r0)
            com.spotify.music.features.entityselector.container.EntitySelectorsInjector$createLoopFactory$1 r0 = com.spotify.music.features.entityselector.container.EntitySelectorsInjector$createLoopFactory$1.a
            if (r0 == 0) goto L_0x000f
            com.spotify.music.features.entityselector.container.d r1 = new com.spotify.music.features.entityselector.container.d
            r1.<init>(r0)
            r0 = r1
        L_0x000f:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            com.spotify.music.features.entityselector.container.EntitySelectorFragment r1 = r4.a
            com.spotify.encore.mobile.snackbar.SnackbarManager r2 = r4.c
            tg0<android.view.View> r3 = r4.d
            io.reactivex.w r1 = defpackage.az4.a(r1, r2, r3)
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r0, r1)
            com.spotify.music.features.entityselector.common.b r1 = r4.b
            io.reactivex.s r1 = r1.d()
            com.spotify.mobius.q r1 = defpackage.cz4.a(r1)
            com.spotify.mobius.MobiusLoop$f r0 = r0.h(r1)
            com.spotify.mobius.android.e r1 = new com.spotify.mobius.android.e
            java.lang.String r2 = "EntitySelectors"
            r1.<init>(r2)
            com.spotify.mobius.MobiusLoop$f r0 = r0.f(r1)
            java.lang.String r1 = "RxMobius.loop<EntitySele…r.tag(\"EntitySelectors\"))"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.music.features.entityselector.container.EntitySelectorsInjector$createController$1 r1 = com.spotify.music.features.entityselector.container.EntitySelectorsInjector$createController$1.a
            if (r1 == 0) goto L_0x0047
            com.spotify.music.features.entityselector.container.c r2 = new com.spotify.music.features.entityselector.container.c
            r2.<init>(r1)
            r1 = r2
        L_0x0047:
            com.spotify.mobius.t r1 = (com.spotify.mobius.t) r1
            u92 r2 = defpackage.u92.b()
            com.spotify.mobius.MobiusLoop$g r5 = com.spotify.mobius.z.a(r0, r5, r1, r2)
            java.lang.String r0 = "Mobius.controller(\n     …Runner.create()\n        )"
            kotlin.jvm.internal.h.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.entityselector.container.EntitySelectorsInjector.a(xy4):com.spotify.mobius.MobiusLoop$g");
    }
}
