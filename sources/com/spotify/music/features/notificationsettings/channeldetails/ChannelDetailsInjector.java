package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.notification.c;
import com.spotify.ubi.specification.factories.s1;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class ChannelDetailsInjector {
    private final c a;
    private final y b;
    private final x c;
    private final s1 d;
    private final ere e;

    public ChannelDetailsInjector(c cVar, y yVar, x xVar, s1 s1Var, ere ere) {
        h.e(cVar, "endpoint");
        h.e(yVar, "scheduler");
        h.e(xVar, "viewInteractionDelegate");
        h.e(s1Var, "ubiEventFactory");
        h.e(ere, "ubiEventLogger");
        this.a = cVar;
        this.b = yVar;
        this.c = xVar;
        this.d = s1Var;
        this.e = ere;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.spotify.music.features.notificationsettings.channeldetails.j] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.spotify.music.features.notificationsettings.channeldetails.k] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.MobiusLoop.g<com.spotify.music.features.notificationsettings.channeldetails.o, com.spotify.music.features.notificationsettings.channeldetails.h> a(com.spotify.music.features.notificationsettings.channeldetails.o r9) {
        /*
            r8 = this;
            java.lang.String r0 = "defaultModel"
            kotlin.jvm.internal.h.e(r9, r0)
            com.spotify.music.features.notificationsettings.channeldetails.ChannelDetailsInjector$createLoopFactory$1 r0 = com.spotify.music.features.notificationsettings.channeldetails.ChannelDetailsInjector$createLoopFactory$1.a
            if (r0 == 0) goto L_0x000f
            com.spotify.music.features.notificationsettings.channeldetails.k r1 = new com.spotify.music.features.notificationsettings.channeldetails.k
            r1.<init>(r0)
            r0 = r1
        L_0x000f:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            com.spotify.music.notification.c r1 = r8.a
            io.reactivex.y r2 = r8.b
            com.spotify.ubi.specification.factories.s1 r3 = r8.d
            ere r4 = r8.e
            java.lang.String r5 = "endpoint"
            kotlin.jvm.internal.h.e(r1, r5)
            java.lang.String r5 = "scheduler"
            kotlin.jvm.internal.h.e(r2, r5)
            java.lang.String r5 = "ubiEventFactory"
            kotlin.jvm.internal.h.e(r3, r5)
            java.lang.String r5 = "ubiEventLogger"
            kotlin.jvm.internal.h.e(r4, r5)
            com.spotify.mobius.rx2.m r5 = com.spotify.mobius.rx2.i.f()
            java.lang.Class<com.spotify.music.features.notificationsettings.channeldetails.g$b> r6 = com.spotify.music.features.notificationsettings.channeldetails.g.b.class
            com.spotify.music.features.notificationsettings.channeldetails.c r7 = new com.spotify.music.features.notificationsettings.channeldetails.c
            r7.<init>(r1, r2)
            r5.h(r6, r7)
            java.lang.Class<com.spotify.music.features.notificationsettings.channeldetails.g$c> r6 = com.spotify.music.features.notificationsettings.channeldetails.g.c.class
            com.spotify.music.features.notificationsettings.channeldetails.d r7 = new com.spotify.music.features.notificationsettings.channeldetails.d
            r7.<init>(r1, r2)
            r5.h(r6, r7)
            java.lang.Class<com.spotify.music.features.notificationsettings.channeldetails.g$a> r1 = com.spotify.music.features.notificationsettings.channeldetails.g.a.class
            com.spotify.music.features.notificationsettings.channeldetails.e r2 = new com.spotify.music.features.notificationsettings.channeldetails.e
            r2.<init>(r3, r4)
            r5.d(r1, r2)
            io.reactivex.w r1 = r5.i()
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r0, r1)
            com.spotify.music.features.notificationsettings.channeldetails.x r1 = r8.c
            java.lang.String r2 = "viewInteractionDelegate"
            kotlin.jvm.internal.h.e(r1, r2)
            r2 = 1
            io.reactivex.v[] r2 = new io.reactivex.v[r2]
            io.reactivex.s r1 = r1.a()
            r3 = 0
            r2[r3] = r1
            com.spotify.mobius.q r1 = com.spotify.mobius.rx2.i.a(r2)
            com.spotify.mobius.MobiusLoop$f r0 = r0.h(r1)
            com.spotify.mobius.android.e r1 = new com.spotify.mobius.android.e
            java.lang.String r2 = "NotificationChannels"
            r1.<init>(r2)
            com.spotify.mobius.MobiusLoop$f r0 = r0.f(r1)
            java.lang.String r1 = "RxMobius.loop(\n         …(\"NotificationChannels\"))"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.music.features.notificationsettings.channeldetails.ChannelDetailsInjector$createController$1 r1 = com.spotify.music.features.notificationsettings.channeldetails.ChannelDetailsInjector$createController$1.a
            if (r1 == 0) goto L_0x008a
            com.spotify.music.features.notificationsettings.channeldetails.j r2 = new com.spotify.music.features.notificationsettings.channeldetails.j
            r2.<init>(r1)
            r1 = r2
        L_0x008a:
            com.spotify.mobius.t r1 = (com.spotify.mobius.t) r1
            u92 r2 = defpackage.u92.b()
            com.spotify.mobius.MobiusLoop$g r9 = com.spotify.mobius.z.a(r0, r9, r1, r2)
            java.lang.String r0 = "Mobius.controller(\n     …Runner.create()\n        )"
            kotlin.jvm.internal.h.d(r9, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.notificationsettings.channeldetails.ChannelDetailsInjector.a(com.spotify.music.features.notificationsettings.channeldetails.o):com.spotify.mobius.MobiusLoop$g");
    }
}
