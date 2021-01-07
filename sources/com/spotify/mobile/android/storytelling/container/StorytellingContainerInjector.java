package com.spotify.mobile.android.storytelling.container;

import com.spotify.mobile.android.storytelling.common.PauseState;
import com.spotify.mobile.android.storytelling.common.d;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.z;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class StorytellingContainerInjector {
    private final z<Integer> a;
    private final nmf<Integer, a> b;
    private final nmf<gx1, f> c;
    private final nmf<PauseState, f> d;
    private final cmf<f> e;
    private final s<kx1> f;
    private final s<PauseState> g;
    private final d h;
    private final cmf<f> i;
    private final t31 j;
    private final sy1 k;
    private final s<ox1> l;

    public StorytellingContainerInjector(z<Integer> zVar, nmf<Integer, a> nmf, nmf<gx1, f> nmf2, nmf<PauseState, f> nmf3, cmf<f> cmf, s<kx1> sVar, s<PauseState> sVar2, d dVar, cmf<f> cmf2, t31 t31, sy1 sy1, s<ox1> sVar3) {
        h.e(zVar, "storiesLoadSingle");
        h.e(nmf, "storyPreLoader");
        h.e(nmf2, "storiesUpdateConsumer");
        h.e(nmf3, "pauseStateConsumer");
        h.e(cmf, "exitContainerAction");
        h.e(sVar, "storyStartedObservable");
        h.e(sVar2, "pauseStateUpdates");
        h.e(dVar, "storiesShareProvider");
        h.e(cmf2, "openShareMenuAction");
        h.e(t31, "audioPlayer");
        h.e(sy1, "storytellingContainerLogger");
        h.e(sVar3, "storyUserRequests");
        this.a = zVar;
        this.b = nmf;
        this.c = nmf2;
        this.d = nmf3;
        this.e = cmf;
        this.f = sVar;
        this.g = sVar2;
        this.h = dVar;
        this.i = cmf2;
        this.j = t31;
        this.k = sy1;
        this.l = sVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.spotify.mobile.android.storytelling.container.e] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.spotify.mobile.android.storytelling.container.f] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.MobiusLoop.g<defpackage.tx1, defpackage.rx1> a(defpackage.tx1 r12, defpackage.nmf<? super java.lang.Integer, kotlin.f> r13) {
        /*
            r11 = this;
            java.lang.String r0 = "defaultModel"
            kotlin.jvm.internal.h.e(r12, r0)
            java.lang.String r0 = "showCurrentStoryAction"
            kotlin.jvm.internal.h.e(r13, r0)
            com.spotify.mobile.android.storytelling.container.StorytellingContainerInjector$createLoopFactory$1 r0 = com.spotify.mobile.android.storytelling.container.StorytellingContainerInjector$createLoopFactory$1.a
            if (r0 == 0) goto L_0x0014
            com.spotify.mobile.android.storytelling.container.f r1 = new com.spotify.mobile.android.storytelling.container.f
            r1.<init>(r0)
            r0 = r1
        L_0x0014:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            io.reactivex.z<java.lang.Integer> r1 = r11.a
            nmf<java.lang.Integer, io.reactivex.a> r2 = r11.b
            nmf<gx1, kotlin.f> r4 = r11.c
            nmf<com.spotify.mobile.android.storytelling.common.PauseState, kotlin.f> r5 = r11.d
            cmf<kotlin.f> r6 = r11.e
            com.spotify.mobile.android.storytelling.common.d r7 = r11.h
            cmf<kotlin.f> r8 = r11.i
            t31 r9 = r11.j
            sy1 r10 = r11.k
            r3 = r13
            io.reactivex.w r13 = defpackage.ny1.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.spotify.mobius.MobiusLoop$f r13 = com.spotify.mobius.rx2.i.c(r0, r13)
            io.reactivex.s<kx1> r0 = r11.f
            io.reactivex.s<com.spotify.mobile.android.storytelling.common.PauseState> r1 = r11.g
            io.reactivex.s<ox1> r2 = r11.l
            com.spotify.mobius.q r0 = defpackage.ry1.a(r0, r1, r2)
            com.spotify.mobius.MobiusLoop$f r13 = r13.h(r0)
            com.spotify.mobius.android.e r0 = new com.spotify.mobius.android.e
            java.lang.String r1 = "StorytellingContainer"
            r0.<init>(r1)
            com.spotify.mobius.MobiusLoop$f r13 = r13.f(r0)
            java.lang.String r0 = "RxMobius.loop(\n         …\"StorytellingContainer\"))"
            kotlin.jvm.internal.h.d(r13, r0)
            com.spotify.mobile.android.storytelling.container.StorytellingContainerInjector$createController$1 r0 = com.spotify.mobile.android.storytelling.container.StorytellingContainerInjector$createController$1.a
            if (r0 == 0) goto L_0x0059
            com.spotify.mobile.android.storytelling.container.e r1 = new com.spotify.mobile.android.storytelling.container.e
            r1.<init>(r0)
            r0 = r1
        L_0x0059:
            com.spotify.mobius.t r0 = (com.spotify.mobius.t) r0
            u92 r1 = defpackage.u92.b()
            com.spotify.mobius.MobiusLoop$g r12 = com.spotify.mobius.z.a(r13, r12, r0, r1)
            java.lang.String r13 = "Mobius.controller(\n     …Runner.create()\n        )"
            kotlin.jvm.internal.h.d(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.storytelling.container.StorytellingContainerInjector.a(tx1, nmf):com.spotify.mobius.MobiusLoop$g");
    }
}
