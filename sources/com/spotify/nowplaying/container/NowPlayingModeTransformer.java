package com.spotify.nowplaying.container;

import com.spotify.player.model.PlayerState;
import io.reactivex.k;
import kotlin.jvm.internal.h;

public final class NowPlayingModeTransformer implements k<PlayerState, cqd> {
    private final d a;

    public NowPlayingModeTransformer(d dVar) {
        h.e(dVar, "nowPlayingModeResolver");
        this.a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.spotify.nowplaying.container.e] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.spotify.nowplaying.container.e] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // io.reactivex.k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.tpf<defpackage.cqd> a(io.reactivex.g<com.spotify.player.model.PlayerState> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "playerStateFlowable"
            kotlin.jvm.internal.h.e(r3, r0)
            com.spotify.nowplaying.container.NowPlayingModeTransformer$apply$1 r0 = com.spotify.nowplaying.container.NowPlayingModeTransformer$apply$1.a
            if (r0 == 0) goto L_0x000f
            com.spotify.nowplaying.container.e r1 = new com.spotify.nowplaying.container.e
            r1.<init>(r0)
            r0 = r1
        L_0x000f:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.g r3 = r3.u(r0)
            com.spotify.nowplaying.container.NowPlayingModeTransformer$apply$2 r0 = new com.spotify.nowplaying.container.NowPlayingModeTransformer$apply$2
            com.spotify.nowplaying.container.d r1 = r2.a
            r0.<init>(r1)
            com.spotify.nowplaying.container.e r1 = new com.spotify.nowplaying.container.e
            r1.<init>(r0)
            io.reactivex.g r3 = r3.O(r1)
            com.spotify.nowplaying.container.NowPlayingModeTransformer$apply$3 r0 = com.spotify.nowplaying.container.NowPlayingModeTransformer$apply$3.a
            if (r0 == 0) goto L_0x002f
            com.spotify.nowplaying.container.e r1 = new com.spotify.nowplaying.container.e
            r1.<init>(r0)
            r0 = r1
        L_0x002f:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.g r3 = r3.u(r0)
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest r0 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest
            r0.<init>(r3)
            java.lang.String r3 = "playerStateFlowable\n    …  .onBackpressureLatest()"
            kotlin.jvm.internal.h.d(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.nowplaying.container.NowPlayingModeTransformer.a(io.reactivex.g):tpf");
    }
}
