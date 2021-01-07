package com.spotify.music.features.nowplaying.legacy;

import com.google.common.base.Optional;
import com.spotify.android.flags.c;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;
import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class NowPlayingFragmentResolver {
    private final g<PlayerState> a;
    private final g<c> b;
    private final ftb c;

    /* access modifiers changed from: package-private */
    public static final class a<T> implements n<PlayerState> {
        public static final a a = new a();

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            h.e(playerState2, "it");
            Optional<ContextTrack> track = playerState2.track();
            h.d(track, "it.track()");
            return track.isPresent();
        }
    }

    public NowPlayingFragmentResolver(g<PlayerState> gVar, g<c> gVar2, ftb ftb) {
        h.e(gVar, "playerStateFlowable");
        h.e(gVar2, "flagsFlowable");
        h.e(ftb, "drivingModeAcceptancePolicy");
        this.a = gVar;
        this.b = gVar2;
        this.c = ftb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.spotify.music.features.nowplaying.legacy.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final io.reactivex.g<defpackage.wlf<androidx.fragment.app.Fragment>> b() {
        /*
            r3 = this;
            io.reactivex.g<com.spotify.player.model.PlayerState> r0 = r3.a
            com.spotify.music.features.nowplaying.legacy.NowPlayingFragmentResolver$a r1 = com.spotify.music.features.nowplaying.legacy.NowPlayingFragmentResolver.a.a
            io.reactivex.g r0 = r0.C(r1)
            com.spotify.music.features.nowplaying.legacy.NowPlayingFragmentResolver$observe$filteredPlayerStates$2 r1 = com.spotify.music.features.nowplaying.legacy.NowPlayingFragmentResolver$observe$filteredPlayerStates$2.a
            if (r1 == 0) goto L_0x0012
            com.spotify.music.features.nowplaying.legacy.c r2 = new com.spotify.music.features.nowplaying.legacy.c
            r2.<init>(r1)
            r1 = r2
        L_0x0012:
            io.reactivex.functions.l r1 = (io.reactivex.functions.l) r1
            io.reactivex.g r0 = r0.u(r1)
            java.lang.String r1 = "playerStateFlowable\n    …anged(PlayerState::track)"
            kotlin.jvm.internal.h.d(r0, r1)
            io.reactivex.g<com.spotify.android.flags.c> r1 = r3.b
            com.spotify.music.features.nowplaying.legacy.b r2 = new com.spotify.music.features.nowplaying.legacy.b
            r2.<init>(r3)
            io.reactivex.g r0 = io.reactivex.g.i(r0, r1, r2)
            io.reactivex.g r0 = r0.s()
            java.lang.String r1 = "Flowable\n            .co…  .distinctUntilChanged()"
            kotlin.jvm.internal.h.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.nowplaying.legacy.NowPlayingFragmentResolver.b():io.reactivex.g");
    }
}
