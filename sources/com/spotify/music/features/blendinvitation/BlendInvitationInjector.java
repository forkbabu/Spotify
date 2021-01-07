package com.spotify.music.features.blendinvitation;

import android.content.res.Resources;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.features.blendinvitation.api.a;
import com.spotify.music.navigation.b;
import com.spotify.ubi.specification.factories.z;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class BlendInvitationInjector {
    private final s<String> a;
    private final bqa b;
    private final b c;
    private final a d;
    private final SnackbarManager e;
    private final ere f;
    private final z g;
    private final Resources h;

    public BlendInvitationInjector(s<String> sVar, bqa bqa, b bVar, a aVar, SnackbarManager snackbarManager, ere ere, z zVar, Resources resources) {
        h.e(sVar, "username");
        h.e(bqa, "profile");
        h.e(bVar, "activityStarter");
        h.e(aVar, "blendInvitationDataSource");
        h.e(snackbarManager, "snackbarManager");
        h.e(ere, "eventLogger");
        h.e(zVar, "eventFactory");
        h.e(resources, "resources");
        this.a = sVar;
        this.b = bqa;
        this.c = bVar;
        this.d = aVar;
        this.e = snackbarManager;
        this.f = ere;
        this.g = zVar;
        this.h = resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.spotify.music.features.blendinvitation.a] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.spotify.music.features.blendinvitation.b] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.MobiusLoop.g<defpackage.x34, defpackage.v34> a(defpackage.x34 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "defaultModel"
            kotlin.jvm.internal.h.e(r10, r0)
            com.spotify.music.features.blendinvitation.BlendInvitationInjector$createLoopFactory$1 r0 = com.spotify.music.features.blendinvitation.BlendInvitationInjector$createLoopFactory$1.a
            if (r0 == 0) goto L_0x000f
            com.spotify.music.features.blendinvitation.b r1 = new com.spotify.music.features.blendinvitation.b
            r1.<init>(r0)
            r0 = r1
        L_0x000f:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            io.reactivex.s<java.lang.String> r1 = r9.a
            bqa r2 = r9.b
            com.spotify.music.features.blendinvitation.api.a r3 = r9.d
            com.spotify.music.navigation.b r4 = r9.c
            com.spotify.encore.mobile.snackbar.SnackbarManager r5 = r9.e
            ere r6 = r9.f
            com.spotify.ubi.specification.factories.z r7 = r9.g
            android.content.res.Resources r8 = r9.h
            io.reactivex.w r1 = defpackage.j44.a(r1, r2, r3, r4, r5, r6, r7, r8)
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r0, r1)
            r1 = 1
            io.reactivex.v[] r1 = new io.reactivex.v[r1]
            io.reactivex.s<java.lang.Object> r2 = io.reactivex.internal.operators.observable.o.a
            r3 = 0
            r1[r3] = r2
            com.spotify.mobius.q r1 = com.spotify.mobius.rx2.i.a(r1)
            com.spotify.mobius.MobiusLoop$f r0 = r0.h(r1)
            com.spotify.mobius.android.e r1 = new com.spotify.mobius.android.e
            java.lang.String r2 = "BlendInvitation"
            r1.<init>(r2)
            com.spotify.mobius.MobiusLoop$f r0 = r0.f(r1)
            java.lang.String r1 = "RxMobius.loop(\n         …r.tag(\"BlendInvitation\"))"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.music.features.blendinvitation.BlendInvitationInjector$createController$1 r1 = com.spotify.music.features.blendinvitation.BlendInvitationInjector$createController$1.a
            if (r1 == 0) goto L_0x0053
            com.spotify.music.features.blendinvitation.a r2 = new com.spotify.music.features.blendinvitation.a
            r2.<init>(r1)
            r1 = r2
        L_0x0053:
            com.spotify.mobius.t r1 = (com.spotify.mobius.t) r1
            u92 r2 = defpackage.u92.b()
            com.spotify.mobius.MobiusLoop$g r10 = com.spotify.mobius.z.a(r0, r10, r1, r2)
            java.lang.String r0 = "Mobius.controller(\n     …Runner.create()\n        )"
            kotlin.jvm.internal.h.d(r10, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.blendinvitation.BlendInvitationInjector.a(x34):com.spotify.mobius.MobiusLoop$g");
    }
}
