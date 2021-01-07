package com.spotify.music.features.podcast.notifications;

import androidx.core.app.q;
import com.spotify.music.connection.l;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class NotificationsBottomDrawerInjector {
    private final ih7 a;
    private final t8a b;
    private final NotificationsBottomDrawerFragment c;
    private final l d;
    private final f e;
    private final q f;
    private final y g;
    private final y h;

    public NotificationsBottomDrawerInjector(ih7 ih7, t8a t8a, NotificationsBottomDrawerFragment notificationsBottomDrawerFragment, l lVar, f fVar, q qVar, y yVar, y yVar2) {
        h.e(ih7, "optInEndpoint");
        h.e(t8a, "likedContent");
        h.e(notificationsBottomDrawerFragment, "fragment");
        h.e(lVar, "connectionState");
        h.e(fVar, "logger");
        h.e(qVar, "notificationManager");
        h.e(yVar, "computationScheduler");
        h.e(yVar2, "mainThreadScheduler");
        this.a = ih7;
        this.b = t8a;
        this.c = notificationsBottomDrawerFragment;
        this.d = lVar;
        this.e = fVar;
        this.f = qVar;
        this.g = yVar;
        this.h = yVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.spotify.music.features.podcast.notifications.b] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.spotify.music.features.podcast.notifications.c] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.MobiusLoop.g<defpackage.ig7, defpackage.gg7> b(defpackage.ig7 r8, defpackage.lh7 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "defaultModel"
            kotlin.jvm.internal.h.e(r8, r0)
            java.lang.String r0 = "viewBinder"
            kotlin.jvm.internal.h.e(r9, r0)
            com.spotify.music.features.podcast.notifications.NotificationsBottomDrawerInjector$createLoopFactory$1 r0 = com.spotify.music.features.podcast.notifications.NotificationsBottomDrawerInjector$createLoopFactory$1.a
            if (r0 == 0) goto L_0x0014
            com.spotify.music.features.podcast.notifications.c r1 = new com.spotify.music.features.podcast.notifications.c
            r1.<init>(r0)
            r0 = r1
        L_0x0014:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            t8a r1 = r7.b
            ih7 r2 = r7.a
            com.spotify.music.features.podcast.notifications.f r3 = r7.e
            com.spotify.music.features.podcast.notifications.NotificationsBottomDrawerFragment r4 = r7.c
            io.reactivex.y r6 = r7.h
            r5 = r9
            io.reactivex.w r9 = defpackage.hh7.b(r1, r2, r3, r4, r5, r6)
            com.spotify.mobius.MobiusLoop$f r9 = com.spotify.mobius.rx2.i.c(r0, r9)
            com.spotify.music.connection.l r0 = r7.d
            androidx.core.app.q r1 = r7.f
            com.spotify.mobius.q r0 = defpackage.jh7.a(r0, r1)
            com.spotify.mobius.MobiusLoop$f r9 = r9.h(r0)
            com.spotify.music.features.podcast.notifications.a r0 = new com.spotify.music.features.podcast.notifications.a
            r1 = 0
            r0.<init>(r1, r7)
            com.spotify.mobius.MobiusLoop$f r9 = r9.b(r0)
            com.spotify.music.features.podcast.notifications.a r0 = new com.spotify.music.features.podcast.notifications.a
            r1 = 1
            r0.<init>(r1, r7)
            com.spotify.mobius.MobiusLoop$f r9 = r9.d(r0)
            com.spotify.mobius.android.e r0 = new com.spotify.mobius.android.e
            java.lang.String r1 = "NotificationsBottomDrawer"
            r0.<init>(r1)
            com.spotify.mobius.MobiusLoop$f r9 = r9.f(r0)
            java.lang.String r0 = "RxMobius.loop<Notificati…ificationsBottomDrawer\"))"
            kotlin.jvm.internal.h.d(r9, r0)
            com.spotify.music.features.podcast.notifications.NotificationsBottomDrawerInjector$createController$1 r0 = com.spotify.music.features.podcast.notifications.NotificationsBottomDrawerInjector$createController$1.a
            if (r0 == 0) goto L_0x0063
            com.spotify.music.features.podcast.notifications.b r1 = new com.spotify.music.features.podcast.notifications.b
            r1.<init>(r0)
            r0 = r1
        L_0x0063:
            com.spotify.mobius.t r0 = (com.spotify.mobius.t) r0
            u92 r1 = defpackage.u92.b()
            com.spotify.mobius.MobiusLoop$g r8 = com.spotify.mobius.z.a(r9, r8, r0, r1)
            java.lang.String r9 = "Mobius.controller(\n     …er.create()\n            )"
            kotlin.jvm.internal.h.d(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.podcast.notifications.NotificationsBottomDrawerInjector.b(ig7, lh7):com.spotify.mobius.MobiusLoop$g");
    }
}
