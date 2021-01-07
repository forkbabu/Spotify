package com.spotify.instrumentation.navigation.logger;

import com.spotify.instrumentation.navigation.logger.b;
import com.spotify.mobius.MobiusLoop;
import java.util.UUID;
import kotlin.jvm.internal.h;

public final class m {
    private final MobiusLoop<e, b, g> a;
    private final cw9 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.spotify.instrumentation.navigation.logger.l] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.spotify.instrumentation.navigation.logger.l] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.spotify.instrumentation.navigation.logger.k] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(defpackage.cw9 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "navigationObserver"
            kotlin.jvm.internal.h.e(r8, r0)
            r7.<init>()
            r7.b = r8
            com.spotify.instrumentation.navigation.logger.NavigationLogger$loop$1 r8 = com.spotify.instrumentation.navigation.logger.NavigationLogger$loop$1.a
            if (r8 == 0) goto L_0x0014
            com.spotify.instrumentation.navigation.logger.k r0 = new com.spotify.instrumentation.navigation.logger.k
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            com.spotify.mobius.g0 r8 = (com.spotify.mobius.g0) r8
            com.spotify.instrumentation.navigation.logger.NavigationLogger$loop$2 r0 = new com.spotify.instrumentation.navigation.logger.NavigationLogger$loop$2
            r0.<init>(r7)
            com.spotify.instrumentation.navigation.logger.j r1 = new com.spotify.instrumentation.navigation.logger.j
            r1.<init>(r0)
            com.spotify.mobius.MobiusLoop$f r8 = com.spotify.mobius.z.c(r8, r1)
            java.lang.String r0 = "NavigationLogger"
            com.spotify.mobius.MobiusLoop$i r0 = com.spotify.mobius.extras.b.g(r0)
            com.spotify.mobius.MobiusLoop$f r8 = r8.f(r0)
            com.spotify.instrumentation.navigation.logger.NavigationLogger$loop$3 r0 = com.spotify.instrumentation.navigation.logger.NavigationLogger$loop$3.a
            if (r0 == 0) goto L_0x0038
            com.spotify.instrumentation.navigation.logger.l r1 = new com.spotify.instrumentation.navigation.logger.l
            r1.<init>(r0)
            r0 = r1
        L_0x0038:
            fa2 r0 = (defpackage.fa2) r0
            com.spotify.mobius.MobiusLoop$f r8 = r8.d(r0)
            com.spotify.instrumentation.navigation.logger.NavigationLogger$loop$4 r0 = com.spotify.instrumentation.navigation.logger.NavigationLogger$loop$4.a
            if (r0 == 0) goto L_0x0048
            com.spotify.instrumentation.navigation.logger.l r1 = new com.spotify.instrumentation.navigation.logger.l
            r1.<init>(r0)
            r0 = r1
        L_0x0048:
            fa2 r0 = (defpackage.fa2) r0
            com.spotify.mobius.MobiusLoop$f r8 = r8.b(r0)
            com.spotify.instrumentation.navigation.logger.e r6 = new com.spotify.instrumentation.navigation.logger.e
            r1 = 0
            r2 = 0
            com.spotify.instrumentation.navigation.logger.AppForegroundState r3 = com.spotify.instrumentation.navigation.logger.AppForegroundState.BACKGROUND
            r4 = 0
            r5 = 8
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            com.spotify.mobius.MobiusLoop r8 = r8.g(r6)
            r7.a = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.instrumentation.navigation.logger.m.<init>(cw9):void");
    }

    public final void a() {
        MobiusLoop<e, b, g> mobiusLoop = this.a;
        String uuid = UUID.randomUUID().toString();
        h.d(uuid, "UUID.randomUUID().toString()");
        mobiusLoop.h(new b.a(new d(uuid, null, null, null)));
    }

    public final void b() {
        this.a.h(b.C0159b.a);
    }

    public final void c(f fVar, String str) {
        h.e(fVar, "action");
        h.e(str, "locationChangerIdentity");
        this.a.h(new b.d(fVar, str));
    }

    public final void d(d dVar) {
        h.e(dVar, "destination");
        this.a.h(new b.e(dVar));
    }

    public final cw9 e() {
        return this.b;
    }

    public final void f(c cVar) {
        h.e(cVar, "interactionId");
        this.a.h(new b.c(cVar));
    }

    public final void g(f fVar) {
        h.e(fVar, "action");
        this.a.h(new b.f(fVar));
    }
}
