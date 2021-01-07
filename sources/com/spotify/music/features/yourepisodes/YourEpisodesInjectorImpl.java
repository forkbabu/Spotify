package com.spotify.music.features.yourepisodes;

import com.spotify.music.features.yourepisodes.interactor.a;
import com.spotify.music.features.yourepisodes.interactor.d;
import com.spotify.music.features.yourepisodes.interactor.h;
import com.spotify.music.navigation.t;

public final class YourEpisodesInjectorImpl implements w {
    private final d a;
    private final h b;
    private final a c;
    private final c09 d;
    private final t e;

    public YourEpisodesInjectorImpl(d dVar, h hVar, a aVar, c09 c09, t tVar) {
        kotlin.jvm.internal.h.e(dVar, "listenLaterInteractor");
        kotlin.jvm.internal.h.e(hVar, "playerInteractor");
        kotlin.jvm.internal.h.e(aVar, "downloadInteractor");
        kotlin.jvm.internal.h.e(c09, "eventSources");
        kotlin.jvm.internal.h.e(tVar, "navigator");
        this.a = dVar;
        this.b = hVar;
        this.c = aVar;
        this.d = c09;
        this.e = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.spotify.music.features.yourepisodes.x] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.spotify.music.features.yourepisodes.y] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // com.spotify.music.features.yourepisodes.w
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobius.MobiusLoop.g<com.spotify.music.features.yourepisodes.domain.l, com.spotify.music.features.yourepisodes.domain.j> a(com.spotify.music.features.yourepisodes.domain.l r7, io.reactivex.s<com.spotify.music.features.yourepisodes.interactor.c> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "defaultModel"
            kotlin.jvm.internal.h.e(r7, r0)
            java.lang.String r0 = "subscription"
            kotlin.jvm.internal.h.e(r8, r0)
            com.spotify.music.features.yourepisodes.interactor.d r0 = r6.a
            com.spotify.music.features.yourepisodes.interactor.h r1 = r6.b
            com.spotify.music.features.yourepisodes.interactor.a r2 = r6.c
            com.spotify.music.navigation.t r3 = r6.e
            com.spotify.music.features.yourepisodes.YourEpisodesInjectorImpl$createLoopFactory$1 r4 = com.spotify.music.features.yourepisodes.YourEpisodesInjectorImpl$createLoopFactory$1.a
            if (r4 == 0) goto L_0x001c
            com.spotify.music.features.yourepisodes.y r5 = new com.spotify.music.features.yourepisodes.y
            r5.<init>(r4)
            r4 = r5
        L_0x001c:
            com.spotify.mobius.g0 r4 = (com.spotify.mobius.g0) r4
            io.reactivex.w r0 = com.spotify.music.features.yourepisodes.domain.i.a(r0, r1, r2, r3)
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r4, r0)
            c09 r1 = r6.d
            com.spotify.mobius.q r8 = r1.a(r8)
            com.spotify.mobius.MobiusLoop$f r8 = r0.h(r8)
            java.lang.String r0 = "RxMobius\n            .lo…ventSource(subscription))"
            kotlin.jvm.internal.h.d(r8, r0)
            com.spotify.music.features.yourepisodes.YourEpisodesInjectorImpl$createController$1 r0 = com.spotify.music.features.yourepisodes.YourEpisodesInjectorImpl$createController$1.a
            if (r0 == 0) goto L_0x003f
            com.spotify.music.features.yourepisodes.x r1 = new com.spotify.music.features.yourepisodes.x
            r1.<init>(r0)
            r0 = r1
        L_0x003f:
            com.spotify.mobius.t r0 = (com.spotify.mobius.t) r0
            u92 r1 = defpackage.u92.b()
            com.spotify.mobius.MobiusLoop$g r7 = com.spotify.mobius.z.a(r8, r7, r0, r1)
            java.lang.String r8 = "Mobius.controller(\n     …Runner.create()\n        )"
            kotlin.jvm.internal.h.d(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourepisodes.YourEpisodesInjectorImpl.a(com.spotify.music.features.yourepisodes.domain.l, io.reactivex.s):com.spotify.mobius.MobiusLoop$g");
    }
}
