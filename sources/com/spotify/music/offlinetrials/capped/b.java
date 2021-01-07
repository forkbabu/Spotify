package com.spotify.music.offlinetrials.capped;

import com.spotify.playlist.models.f;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = n.k;
        return Integer.valueOf(((f) obj).getItems().size());
    }
}
