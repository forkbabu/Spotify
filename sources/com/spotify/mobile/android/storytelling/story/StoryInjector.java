package com.spotify.mobile.android.storytelling.story;

import com.spotify.mobile.android.storytelling.common.PauseState;
import io.reactivex.s;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class StoryInjector {
    private final nmf<Integer, z<hx1>> a;
    private final s<PauseState> b;
    private final sy1 c;

    public StoryInjector(nmf<Integer, z<hx1>> nmf, s<PauseState> sVar, sy1 sy1) {
        h.e(nmf, "storyProvider");
        h.e(sVar, "pauseStateUpdates");
        h.e(sy1, "storytellingContainerLogger");
        this.a = nmf;
        this.b = sVar;
        this.c = sy1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.spotify.mobile.android.storytelling.story.a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.spotify.mobile.android.storytelling.story.b] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.MobiusLoop.g<defpackage.yy1, defpackage.vy1> a(defpackage.yy1 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "defaultModel"
            kotlin.jvm.internal.h.e(r4, r0)
            com.spotify.mobile.android.storytelling.story.StoryInjector$createLoopFactory$1 r0 = com.spotify.mobile.android.storytelling.story.StoryInjector$createLoopFactory$1.a
            if (r0 == 0) goto L_0x000f
            com.spotify.mobile.android.storytelling.story.b r1 = new com.spotify.mobile.android.storytelling.story.b
            r1.<init>(r0)
            r0 = r1
        L_0x000f:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            nmf<java.lang.Integer, io.reactivex.z<hx1>> r1 = r3.a
            sy1 r2 = r3.c
            io.reactivex.w r1 = defpackage.dz1.a(r1, r2)
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r0, r1)
            io.reactivex.s<com.spotify.mobile.android.storytelling.common.PauseState> r1 = r3.b
            com.spotify.mobius.q r1 = defpackage.fz1.a(r1)
            com.spotify.mobius.MobiusLoop$f r0 = r0.h(r1)
            com.spotify.mobius.android.e r1 = new com.spotify.mobius.android.e
            java.lang.String r2 = "Story"
            r1.<init>(r2)
            com.spotify.mobius.MobiusLoop$f r0 = r0.f(r1)
            java.lang.String r1 = "RxMobius.loop(\n         …droidLogger.tag(\"Story\"))"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.mobile.android.storytelling.story.StoryInjector$createController$1 r1 = com.spotify.mobile.android.storytelling.story.StoryInjector$createController$1.a
            if (r1 == 0) goto L_0x0041
            com.spotify.mobile.android.storytelling.story.a r2 = new com.spotify.mobile.android.storytelling.story.a
            r2.<init>(r1)
            r1 = r2
        L_0x0041:
            com.spotify.mobius.t r1 = (com.spotify.mobius.t) r1
            u92 r2 = defpackage.u92.b()
            com.spotify.mobius.MobiusLoop$g r4 = com.spotify.mobius.z.a(r0, r4, r1, r2)
            java.lang.String r0 = "Mobius.controller(\n     …Runner.create()\n        )"
            kotlin.jvm.internal.h.d(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.storytelling.story.StoryInjector.a(yy1):com.spotify.mobius.MobiusLoop$g");
    }
}
