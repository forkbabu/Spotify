package com.spotify.music.features.spoton;

import com.spotify.music.genie.Wish;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ SpotOnPlaybackManager a;

    public /* synthetic */ a(SpotOnPlaybackManager spotOnPlaybackManager) {
        this.a = spotOnPlaybackManager;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.k((Wish) obj);
    }
}
