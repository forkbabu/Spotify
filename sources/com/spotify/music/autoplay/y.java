package com.spotify.music.autoplay;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.w;

public final class y {
    public static z a(s<RadioSeedBundle> sVar, jz1 jz1, nfd nfd, g<PlayerState> gVar, cqe cqe, Player player) {
        return new z(sVar, jz1, nfd, gVar, cqe, player);
    }

    public static f0 b(e0 e0Var) {
        return new f0(e0Var);
    }

    public static g0 c() {
        return new g0();
    }

    public static s<RadioSeedBundle> d(s<PlayerState> sVar, w<RadioSeedBundle, RadioSeedBundle> wVar, b0 b0Var, f0 f0Var, Object obj) {
        return sVar.N(w.a).Q(new v(b0Var)).j0((g0) obj).N(r.a).J0(f0Var).q(wVar);
    }
}
