package com.spotify.music.features.nowplayingbar;

import com.spotify.mobius.e0;
import com.spotify.music.features.nowplayingbar.domain.c;
import com.spotify.music.features.nowplayingbar.domain.d;
import com.spotify.music.features.nowplayingbar.domain.e;
import com.spotify.music.features.nowplayingbar.domain.f;
import com.spotify.music.features.nowplayingbar.domain.h;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class NowPlayingBarInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<f, d, e0<f, c>> {
    public static final NowPlayingBarInjector$createLoopFactory$1 a = new NowPlayingBarInjector$createLoopFactory$1();

    NowPlayingBarInjector$createLoopFactory$1() {
        super(2, e.class, "update", "update(Lcom/spotify/music/features/nowplayingbar/domain/NowPlayingBarModel;Lcom/spotify/music/features/nowplayingbar/domain/NowPlayingBarEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0177: APUT  
      (r8v16 com.spotify.music.features.nowplayingbar.domain.c$a[])
      (0 ??[int, short, byte, char])
      (wrap: com.spotify.music.features.nowplayingbar.domain.c$a : 0x0174: CONSTRUCTOR  (r0v4 com.spotify.music.features.nowplayingbar.domain.c$a) = (r7v36 com.spotify.player.controls.c) call: com.spotify.music.features.nowplayingbar.domain.c.a.<init>(com.spotify.player.controls.c):void type: CONSTRUCTOR)
     */
    @Override // defpackage.rmf
    public e0<f, c> invoke(f fVar, d dVar) {
        f fVar2 = fVar;
        d dVar2 = dVar;
        h.e(fVar2, "p1");
        h.e(dVar2, "p2");
        h.e(fVar2, "model");
        h.e(dVar2, "event");
        if (dVar2 instanceof d.f) {
            com.spotify.music.features.nowplayingbar.domain.h d = fVar2.d();
            if (d instanceof h.a) {
                e0<f, c> h = e0.h();
                kotlin.jvm.internal.h.d(h, "noChange()");
                return h;
            } else if (d instanceof h.b) {
                h.b bVar = (h.b) d;
                if (bVar.c().c()) {
                    e0<f, c> h2 = e0.h();
                    kotlin.jvm.internal.h.d(h2, "noChange()");
                    return h2;
                }
                com.spotify.player.controls.c i = com.spotify.player.controls.c.i();
                kotlin.jvm.internal.h.d(i, "skipToNextTrack()");
                Set H = kotlin.collections.d.H(new c.a(i), c.e.a);
                if (bVar.c().a()) {
                    kotlin.collections.d.Y(H).add(c.f.a);
                }
                e0<f, c> a2 = e0.a(H);
                kotlin.jvm.internal.h.d(a2, "dispatch(effects)");
                return a2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (dVar2 instanceof d.j) {
            com.spotify.music.features.nowplayingbar.domain.h d2 = fVar2.d();
            if (d2 instanceof h.a) {
                e0<f, c> h3 = e0.h();
                kotlin.jvm.internal.h.d(h3, "noChange()");
                return h3;
            } else if (!(d2 instanceof h.b)) {
                throw new NoWhenBranchMatchedException();
            } else if (((h.b) d2).c().d()) {
                e0<f, c> h4 = e0.h();
                kotlin.jvm.internal.h.d(h4, "noChange()");
                return h4;
            } else {
                com.spotify.player.controls.c k = com.spotify.player.controls.c.k();
                kotlin.jvm.internal.h.d(k, "skipToPrevTrack()");
                e0<f, c> a3 = e0.a(z42.l(new c.a(k)));
                kotlin.jvm.internal.h.d(a3, "dispatch(effects(Control…ayer(skipToPrevTrack())))");
                return a3;
            }
        } else if (dVar2 instanceof d.a) {
            e0<f, c> a4 = e0.a(z42.l(c.C0236c.a));
            kotlin.jvm.internal.h.d(a4, "dispatch(effects(OpenDevicePicker))");
            return a4;
        } else if (dVar2 instanceof d.e) {
            com.spotify.music.features.nowplayingbar.domain.h d3 = fVar2.d();
            if (d3 instanceof h.a) {
                e0<f, c> h5 = e0.h();
                kotlin.jvm.internal.h.d(h5, "noChange()");
                return h5;
            } else if (d3 instanceof h.b) {
                h.b bVar2 = (h.b) d3;
                e0<f, c> a5 = e0.a(z42.l(new c.b(bVar2.a(), bVar2.d().a())));
                kotlin.jvm.internal.h.d(a5, "dispatch(\n            ef…racks.current))\n        )");
                return a5;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (dVar2 instanceof d.h) {
            com.spotify.music.features.nowplayingbar.domain.h d4 = fVar2.d();
            if (d4 instanceof h.a) {
                e0<f, c> h6 = e0.h();
                kotlin.jvm.internal.h.d(h6, "noChange()");
                return h6;
            } else if (d4 instanceof h.b) {
                c.a[] aVarArr = new c.a[1];
                com.spotify.player.controls.c c = ((h.b) d4).b().d() ? com.spotify.player.controls.c.c() : com.spotify.player.controls.c.e();
                kotlin.jvm.internal.h.d(c, "if (playerInfo.playbackS…ng) pause() else resume()");
                aVarArr[0] = new c.a(c);
                e0<f, c> a6 = e0.a(z42.l(aVarArr));
                kotlin.jvm.internal.h.d(a6, "dispatch(\n            ef…else resume()))\n        )");
                return a6;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (dVar2 instanceof d.c) {
            e0<f, c> a7 = e0.a(z42.l(new c.d(((d.c) dVar2).a())));
            kotlin.jvm.internal.h.d(a7, "dispatch(effects(OpenNow…ew(event.interactionId)))");
            return a7;
        } else if (dVar2 instanceof d.g) {
            e0<f, c> a8 = e0.a(z42.l(new c.d(((d.g) dVar2).a())));
            kotlin.jvm.internal.h.d(a8, "dispatch(effects(OpenNow…ew(event.interactionId)))");
            return a8;
        } else if (dVar2 instanceof d.i) {
            e0<f, c> f = e0.f(f.a(fVar2, ((d.i) dVar2).a(), null, null, null, 14));
            kotlin.jvm.internal.h.d(f, "next(model.copy(playerInfo = event.playerInfo))");
            return f;
        } else if (dVar2 instanceof d.C0237d) {
            e0<f, c> f2 = e0.f(f.a(fVar2, null, ((d.C0237d) dVar2).a(), null, null, 13));
            kotlin.jvm.internal.h.d(f2, "next(model.copy(contentType = event.contentType))");
            return f2;
        } else if (dVar2 instanceof d.b) {
            e0<f, c> f3 = e0.f(f.a(fVar2, null, null, ((d.b) dVar2).a(), null, 11));
            kotlin.jvm.internal.h.d(f3, "next(model.copy(connectS…te = event.connectState))");
            return f3;
        } else if (dVar2 instanceof d.k) {
            e0<f, c> f4 = e0.f(f.a(fVar2, null, null, null, ((d.k) dVar2).a(), 7));
            kotlin.jvm.internal.h.d(f4, "next(model.copy(socialLi…nt.socialListeningState))");
            return f4;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
