package com.spotify.music.features.nowplayingbar;

import com.spotify.music.features.nowplayingbar.domain.a;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class c {
    private final g<PlayerState> a;
    private final s<a> b;
    private final d c;
    private final t8a d;
    private final nsb e;
    private final uba f;
    private final k4d g;
    private final pl9 h;
    private final com.spotify.music.onboarding.freetier.education.a i;
    private final cqe j;
    private final y k;

    public c(g<PlayerState> gVar, s<a> sVar, d dVar, t8a t8a, nsb nsb, uba uba, k4d k4d, pl9 pl9, com.spotify.music.onboarding.freetier.education.a aVar, cqe cqe, y yVar) {
        h.e(gVar, "playerStateFlowable");
        h.e(sVar, "connectStateObservable");
        h.e(dVar, "playerControls");
        h.e(t8a, "likedContent");
        h.e(nsb, "nowPlayingNavigator");
        h.e(uba, "connectNavigator");
        h.e(k4d, "socialListeningHelper");
        h.e(pl9, "preCurationDialogTrigger");
        h.e(aVar, "freeTierEducationManager");
        h.e(cqe, "clock");
        h.e(yVar, "mainScheduler");
        this.a = gVar;
        this.b = sVar;
        this.c = dVar;
        this.d = t8a;
        this.e = nsb;
        this.f = uba;
        this.g = k4d;
        this.h = pl9;
        this.i = aVar;
        this.j = cqe;
        this.k = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.spotify.music.features.nowplayingbar.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.MobiusLoop.g<com.spotify.music.features.nowplayingbar.domain.f, com.spotify.music.features.nowplayingbar.domain.d> a() {
        /*
            r8 = this;
            com.spotify.music.features.nowplayingbar.NowPlayingBarInjector$createLoopFactory$1 r0 = com.spotify.music.features.nowplayingbar.NowPlayingBarInjector$createLoopFactory$1.a
            if (r0 == 0) goto L_0x000a
            com.spotify.music.features.nowplayingbar.d r1 = new com.spotify.music.features.nowplayingbar.d
            r1.<init>(r0)
            r0 = r1
        L_0x000a:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            com.spotify.player.controls.d r1 = r8.c
            t8a r2 = r8.d
            nsb r3 = r8.e
            uba r4 = r8.f
            pl9 r5 = r8.h
            com.spotify.music.onboarding.freetier.education.a r6 = r8.i
            io.reactivex.y r7 = r8.k
            io.reactivex.w r1 = defpackage.ft5.a(r1, r2, r3, r4, r5, r6, r7)
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r0, r1)
            io.reactivex.g<com.spotify.player.model.PlayerState> r1 = r8.a
            io.reactivex.s<com.spotify.music.features.nowplayingbar.domain.a> r2 = r8.b
            k4d r3 = r8.g
            io.reactivex.s r3 = r3.a()
            com.spotify.music.features.nowplayingbar.NowPlayingBarInjector$createEventSource$1 r4 = new com.spotify.music.features.nowplayingbar.NowPlayingBarInjector$createEventSource$1
            cqe r5 = r8.j
            r4.<init>(r5)
            com.spotify.mobius.q r1 = com.spotify.music.features.nowplayingbar.eventsources.f.a(r1, r2, r3, r4)
            com.spotify.mobius.MobiusLoop$f r0 = r0.h(r1)
            java.lang.String r1 = "NowPlayingBar"
            com.spotify.mobius.MobiusLoop$i r1 = com.spotify.mobius.extras.b.g(r1)
            com.spotify.mobius.MobiusLoop$f r0 = r0.f(r1)
            java.lang.String r1 = "RxMobius.loop(Update(::u…withTag(\"NowPlayingBar\"))"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.music.features.nowplayingbar.domain.f r1 = new com.spotify.music.features.nowplayingbar.domain.f
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 15
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            com.spotify.mobius.MobiusLoop$g r0 = defpackage.z42.b(r0, r1)
            java.lang.String r1 = "MobiusAndroid.controller…(), NowPlayingBarModel())"
            kotlin.jvm.internal.h.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.nowplayingbar.c.a():com.spotify.mobius.MobiusLoop$g");
    }
}
