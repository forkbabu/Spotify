package com.spotify.music.features.queue.v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.pageloader.s0;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import com.spotify.player.queue.f;
import io.reactivex.g;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class l implements s0 {
    private MobiusLoop.g<j, d> a;
    private final s<PlayerQueue> b;
    private final f c;
    private final QueueViews f;
    private final cqe n;
    private final g<PlayerState> o;

    public l(s<PlayerQueue> sVar, f fVar, QueueViews queueViews, cqe cqe, g<PlayerState> gVar) {
        h.e(sVar, "queue");
        h.e(fVar, "queueInteractor");
        h.e(queueViews, "views");
        h.e(cqe, "clock");
        h.e(gVar, "playerState");
        this.b = sVar;
        this.c = fVar;
        this.f = queueViews;
        this.n = cqe;
        this.o = gVar;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.f.e();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        this.f.f(context, viewGroup, layoutInflater);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.spotify.music.features.queue.v2.f] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0055: APUT  
      (r6v1 io.reactivex.v[])
      (0 ??[int, short, byte, char])
      (wrap: io.reactivex.s<R> : 0x0050: INVOKE  (r1v3 io.reactivex.s<R>) = 
      (r1v2 io.reactivex.s<com.spotify.player.model.PlayerQueue>)
      (wrap: io.reactivex.functions.l<? super com.spotify.player.model.PlayerQueue, ? extends R> : 0x004e: CHECK_CAST (r7v2 io.reactivex.functions.l<? super com.spotify.player.model.PlayerQueue, ? extends R>) = (io.reactivex.functions.l) (r7v1 com.spotify.music.features.queue.v2.QueueEventSourceKt$provideEventSource$1))
     type: VIRTUAL call: io.reactivex.s.j0(io.reactivex.functions.l):io.reactivex.s)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.pageloader.s0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r9 = this;
            com.spotify.music.features.queue.v2.n r0 = com.spotify.music.features.queue.v2.n.a
            com.spotify.player.queue.f r1 = r9.c
            java.lang.String r2 = "playerQueueInteractor"
            kotlin.jvm.internal.h.e(r1, r2)
            com.spotify.mobius.rx2.m r2 = com.spotify.mobius.rx2.i.f()
            java.lang.Class<com.spotify.music.features.queue.v2.b$a> r3 = com.spotify.music.features.queue.v2.b.a.class
            com.spotify.music.features.queue.v2.QueueEffectsHandlerKt$onSetQueue$1 r4 = new com.spotify.music.features.queue.v2.QueueEffectsHandlerKt$onSetQueue$1
            r4.<init>(r1)
            r2.h(r3, r4)
            io.reactivex.w r1 = r2.i()
            kotlin.jvm.internal.h.c(r1)
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r0, r1)
            io.reactivex.s<com.spotify.player.model.PlayerQueue> r1 = r9.b
            io.reactivex.g<com.spotify.player.model.PlayerState> r2 = r9.o
            com.spotify.music.features.queue.v2.QueuePageElement$createLoopFactory$1 r3 = new com.spotify.music.features.queue.v2.QueuePageElement$createLoopFactory$1
            cqe r4 = r9.n
            r3.<init>(r4)
            com.spotify.music.features.queue.v2.k r4 = new com.spotify.music.features.queue.v2.k
            r4.<init>(r3)
            java.lang.String r3 = "queue"
            kotlin.jvm.internal.h.e(r1, r3)
            java.lang.String r3 = "playerState"
            kotlin.jvm.internal.h.e(r2, r3)
            java.lang.String r5 = "currentTimeMs"
            kotlin.jvm.internal.h.e(r4, r5)
            r6 = 2
            io.reactivex.v[] r6 = new io.reactivex.v[r6]
            com.spotify.music.features.queue.v2.QueueEventSourceKt$provideEventSource$1 r7 = com.spotify.music.features.queue.v2.QueueEventSourceKt$provideEventSource$1.a
            if (r7 == 0) goto L_0x004e
            com.spotify.music.features.queue.v2.f r8 = new com.spotify.music.features.queue.v2.f
            r8.<init>(r7)
            r7 = r8
        L_0x004e:
            io.reactivex.functions.l r7 = (io.reactivex.functions.l) r7
            io.reactivex.s r1 = r1.j0(r7)
            r7 = 0
            r6[r7] = r1
            r1 = 1
            io.reactivex.internal.operators.observable.v r7 = new io.reactivex.internal.operators.observable.v
            r7.<init>(r2)
            java.lang.String r2 = "playerState.toObservable()"
            kotlin.jvm.internal.h.d(r7, r2)
            kotlin.jvm.internal.h.e(r7, r3)
            kotlin.jvm.internal.h.e(r4, r5)
            io.reactivex.s r2 = r7.E()
            com.spotify.music.features.queue.v2.e r3 = new com.spotify.music.features.queue.v2.e
            r3.<init>(r4)
            io.reactivex.s r2 = r2.j0(r3)
            java.lang.String r3 = "playerState\n    .distinc…        )\n        )\n    }"
            kotlin.jvm.internal.h.d(r2, r3)
            r6[r1] = r2
            com.spotify.mobius.q r1 = com.spotify.mobius.rx2.i.a(r6)
            java.lang.String r2 = "fromObservables(\n       …e(), currentTimeMs)\n    )"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.mobius.MobiusLoop$f r0 = r0.h(r1)
            java.lang.String r1 = "PlayQueue"
            com.spotify.mobius.MobiusLoop$i r1 = com.spotify.mobius.extras.b.g(r1)
            com.spotify.mobius.MobiusLoop$f r0 = r0.f(r1)
            java.lang.String r1 = "RxMobius\n            .lo…ger.withTag(\"PlayQueue\"))"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.music.features.queue.v2.j r1 = com.spotify.music.features.queue.v2.j.g
            com.spotify.music.features.queue.v2.j r1 = com.spotify.music.features.queue.v2.j.a()
            com.spotify.mobius.MobiusLoop$g r0 = defpackage.z42.b(r0, r1)
            java.lang.String r1 = "MobiusAndroid.controller…ueueModel.EMPTY\n        )"
            kotlin.jvm.internal.h.d(r0, r1)
            r9.a = r0
            r1 = 0
            java.lang.String r2 = "controller"
            if (r0 == 0) goto L_0x00bf
            com.spotify.music.features.queue.v2.QueueViews r3 = r9.f
            r0.c(r3)
            com.spotify.mobius.MobiusLoop$g<com.spotify.music.features.queue.v2.j, com.spotify.music.features.queue.v2.d> r0 = r9.a
            if (r0 == 0) goto L_0x00bb
            r0.start()
            return
        L_0x00bb:
            kotlin.jvm.internal.h.k(r2)
            throw r1
        L_0x00bf:
            kotlin.jvm.internal.h.k(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.queue.v2.l.start():void");
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        MobiusLoop.g<j, d> gVar = this.a;
        if (gVar != null) {
            gVar.stop();
            MobiusLoop.g<j, d> gVar2 = this.a;
            if (gVar2 != null) {
                gVar2.d();
            } else {
                h.k("controller");
                throw null;
            }
        } else {
            h.k("controller");
            throw null;
        }
    }
}
