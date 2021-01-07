package com.spotify.music.features.followfeed.mobius;

import com.spotify.mobius.s;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.followfeed.mobius.effecthandlers.b0;
import com.spotify.music.features.followfeed.mobius.effecthandlers.c;
import com.spotify.music.features.followfeed.mobius.effecthandlers.e0;
import com.spotify.music.features.followfeed.mobius.effecthandlers.g;
import com.spotify.music.features.followfeed.mobius.effecthandlers.k;
import com.spotify.music.features.followfeed.mobius.effecthandlers.n;
import com.spotify.music.features.followfeed.mobius.effecthandlers.p;
import com.spotify.music.features.followfeed.mobius.effecthandlers.r;
import com.spotify.music.features.followfeed.mobius.effecthandlers.t;
import com.spotify.music.features.followfeed.mobius.effecthandlers.v;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class d {
    private final y a;
    private final y b;
    private final y c;
    private final g d;
    private final r e;
    private final k f;
    private final b0 g;
    private final e0 h;
    private final n i;
    private final p j;
    private final v k;
    private final com.spotify.music.features.followfeed.mobius.effecthandlers.y l;
    private final c m;
    private final com.spotify.music.features.followfeed.mobius.effecthandlers.a n;
    private final t o;
    private final x35 p;
    private final ExplicitContentFacade q;
    private final boolean r;

    static final class a<M, F> implements com.spotify.mobius.t<r25, n25> {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        /* Return type fixed from 'com.spotify.mobius.s' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.mobius.t
        public s<r25, n25> a(r25 r25) {
            r25 r252 = r25;
            h.d(r252, "model");
            return q25.b(r252, this.a.r);
        }
    }

    public d(y yVar, y yVar2, y yVar3, g gVar, r rVar, k kVar, b0 b0Var, e0 e0Var, n nVar, p pVar, v vVar, com.spotify.music.features.followfeed.mobius.effecthandlers.y yVar4, c cVar, com.spotify.music.features.followfeed.mobius.effecthandlers.a aVar, t tVar, x35 x35, ExplicitContentFacade explicitContentFacade, boolean z) {
        h.e(yVar, "mainScheduler");
        h.e(yVar2, "computationScheduler");
        h.e(yVar3, "ioScheduler");
        h.e(gVar, "fetchFollowFeedDataEffectHandler");
        h.e(rVar, "navigateEffectHandler");
        h.e(kVar, "followArtistEffectHandler");
        h.e(b0Var, "showEntityContextMenuEffectHandler");
        h.e(e0Var, "showTrackContextMenuEffectHandler");
        h.e(nVar, "logImpressionEffectHandler");
        h.e(pVar, "logInteractionEffectHandler");
        h.e(vVar, "registerNewestItemViewedEffectHandler");
        h.e(yVar4, "showAdditionalArtistsMenuEffectHandler");
        h.e(cVar, "dismissArtistEffectHandler");
        h.e(aVar, "addArtistFollowListenerEffectHandler");
        h.e(tVar, "performPlayerCommandEffectHandler");
        h.e(x35, "player");
        h.e(explicitContentFacade, "explicitContentFacade");
        this.a = yVar;
        this.b = yVar2;
        this.c = yVar3;
        this.d = gVar;
        this.e = rVar;
        this.f = kVar;
        this.g = b0Var;
        this.h = e0Var;
        this.i = nVar;
        this.j = pVar;
        this.k = vVar;
        this.l = yVar4;
        this.m = cVar;
        this.n = aVar;
        this.o = tVar;
        this.p = x35;
        this.q = explicitContentFacade;
        this.r = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.spotify.music.features.followfeed.mobius.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.MobiusLoop.g<defpackage.r25, defpackage.o25> d(defpackage.r25 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "initialModel"
            kotlin.jvm.internal.h.e(r8, r0)
            com.spotify.music.features.followfeed.mobius.FollowFeedLoopFactory$createLoopFactory$1 r0 = com.spotify.music.features.followfeed.mobius.FollowFeedLoopFactory$createLoopFactory$1.a
            if (r0 == 0) goto L_0x000f
            com.spotify.music.features.followfeed.mobius.g r1 = new com.spotify.music.features.followfeed.mobius.g
            r1.<init>(r0)
            r0 = r1
        L_0x000f:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            com.spotify.mobius.rx2.m r1 = com.spotify.mobius.rx2.i.f()
            java.lang.Class<n25$c> r2 = defpackage.n25.c.class
            com.spotify.music.features.followfeed.mobius.effecthandlers.g r3 = r7.d
            r1.h(r2, r3)
            java.lang.Class<n25$g> r2 = defpackage.n25.g.class
            com.spotify.music.features.followfeed.mobius.effecthandlers.r r3 = r7.e
            io.reactivex.y r4 = r7.a
            r1.e(r2, r3, r4)
            java.lang.Class<n25$d> r2 = defpackage.n25.d.class
            com.spotify.music.features.followfeed.mobius.effecthandlers.k r3 = r7.f
            r1.h(r2, r3)
            java.lang.Class<n25$j> r2 = defpackage.n25.j.class
            com.spotify.music.features.followfeed.mobius.effecthandlers.y r3 = r7.l
            io.reactivex.y r4 = r7.a
            r1.e(r2, r3, r4)
            java.lang.Class<n25$k> r2 = defpackage.n25.k.class
            com.spotify.music.features.followfeed.mobius.effecthandlers.b0 r3 = r7.g
            io.reactivex.y r4 = r7.a
            r1.e(r2, r3, r4)
            java.lang.Class<n25$l> r2 = defpackage.n25.l.class
            com.spotify.music.features.followfeed.mobius.effecthandlers.e0 r3 = r7.h
            io.reactivex.y r4 = r7.a
            r1.e(r2, r3, r4)
            java.lang.Class<n25$h> r2 = defpackage.n25.h.class
            com.spotify.music.features.followfeed.mobius.effecthandlers.t r3 = r7.o
            r1.h(r2, r3)
            java.lang.Class<n25$e> r2 = defpackage.n25.e.class
            com.spotify.music.features.followfeed.mobius.effecthandlers.n r3 = r7.i
            r1.d(r2, r3)
            java.lang.Class<n25$f> r2 = defpackage.n25.f.class
            com.spotify.music.features.followfeed.mobius.effecthandlers.p r3 = r7.j
            r1.d(r2, r3)
            java.lang.Class<n25$i> r2 = defpackage.n25.i.class
            com.spotify.music.features.followfeed.mobius.effecthandlers.v r3 = r7.k
            r1.h(r2, r3)
            java.lang.Class<n25$b> r2 = defpackage.n25.b.class
            com.spotify.music.features.followfeed.mobius.effecthandlers.c r3 = r7.m
            r1.h(r2, r3)
            java.lang.Class<n25$a> r2 = defpackage.n25.a.class
            com.spotify.music.features.followfeed.mobius.effecthandlers.a r3 = r7.n
            r1.d(r2, r3)
            io.reactivex.w r1 = r1.i()
            java.lang.String r2 = "RxMobius.subtypeEffectHa…   )\n            .build()"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r0, r1)
            com.spotify.music.features.followfeed.mobius.a r1 = new com.spotify.music.features.followfeed.mobius.a
            r2 = 0
            r1.<init>(r2, r7)
            com.spotify.mobius.MobiusLoop$f r0 = r0.b(r1)
            com.spotify.music.features.followfeed.mobius.a r1 = new com.spotify.music.features.followfeed.mobius.a
            r3 = 1
            r1.<init>(r3, r7)
            com.spotify.mobius.MobiusLoop$f r0 = r0.d(r1)
            io.reactivex.v[] r1 = new io.reactivex.v[r3]
            x35 r4 = r7.p
            io.reactivex.s r4 = r4.c()
            com.spotify.music.features.followfeed.mobius.f r5 = com.spotify.music.features.followfeed.mobius.f.a
            io.reactivex.s r4 = r4.j0(r5)
            r1[r2] = r4
            com.spotify.mobius.q r1 = com.spotify.mobius.rx2.i.a(r1)
            java.lang.String r4 = "RxEventSources.fromObser…kPlayerState) }\n        )"
            kotlin.jvm.internal.h.d(r1, r4)
            com.spotify.mobius.q[] r4 = new com.spotify.mobius.q[r3]
            io.reactivex.v[] r3 = new io.reactivex.v[r3]
            com.spotify.music.explicitcontent.ExplicitContentFacade r5 = r7.q
            io.reactivex.s r5 = r5.c()
            com.spotify.music.features.followfeed.mobius.e r6 = com.spotify.music.features.followfeed.mobius.e.a
            io.reactivex.s r5 = r5.j0(r6)
            r3[r2] = r5
            com.spotify.mobius.q r3 = com.spotify.mobius.rx2.i.a(r3)
            java.lang.String r5 = "RxEventSources.fromObser…              }\n        )"
            kotlin.jvm.internal.h.d(r3, r5)
            r4[r2] = r3
            com.spotify.mobius.MobiusLoop$f r0 = r0.c(r1, r4)
            java.lang.String r1 = "FollowFeed"
            com.spotify.mobius.MobiusLoop$i r1 = com.spotify.mobius.extras.b.g(r1)
            com.spotify.mobius.MobiusLoop$f r0 = r0.f(r1)
            java.lang.String r1 = "RxMobius.loop<FeedModel,…er.withTag(\"FollowFeed\"))"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.music.features.followfeed.mobius.d$a r1 = new com.spotify.music.features.followfeed.mobius.d$a
            r1.<init>(r7)
            com.spotify.mobius.MobiusLoop$g r8 = defpackage.z42.c(r0, r8, r1)
            java.lang.String r0 = "MobiusAndroid.controller… canPlayOnDemand) }\n    )"
            kotlin.jvm.internal.h.d(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.followfeed.mobius.d.d(r25):com.spotify.mobius.MobiusLoop$g");
    }
}
