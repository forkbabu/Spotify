package com.spotify.music.features.nowplaying.legacy;

import androidx.fragment.app.Fragment;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class b<T1, T2, R> implements c<PlayerState, com.spotify.android.flags.c, wlf<Fragment>> {
    final /* synthetic */ NowPlayingFragmentResolver a;

    b(NowPlayingFragmentResolver nowPlayingFragmentResolver) {
        this.a = nowPlayingFragmentResolver;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public wlf<Fragment> a(PlayerState playerState, com.spotify.android.flags.c cVar) {
        PlayerState playerState2 = playerState;
        com.spotify.android.flags.c cVar2 = cVar;
        h.e(playerState2, "ps");
        h.e(cVar2, "flags");
        if (NowPlayingFragmentResolver.a(this.a).a(playerState2)) {
            return new a(0, cVar2);
        }
        return new a(1, cVar2);
    }
}
