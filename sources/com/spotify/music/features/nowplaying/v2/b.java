package com.spotify.music.features.nowplaying.v2;

import com.spotify.android.flags.c;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ NowPlayingActivity a;

    public /* synthetic */ b(NowPlayingActivity nowPlayingActivity) {
        this.a = nowPlayingActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.L.a((c) obj);
    }
}
