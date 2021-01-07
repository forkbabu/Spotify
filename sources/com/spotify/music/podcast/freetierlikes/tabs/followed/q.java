package com.spotify.music.podcast.freetierlikes.tabs.followed;

import com.spotify.pageloader.ObservableLoadable;
import com.spotify.pageloader.o0;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class q implements p {
    private final m a;

    public q(m mVar) {
        h.e(mVar, "followedShowsDataSource");
        this.a = mVar;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.p
    public o0<s<ryd>> a() {
        return ObservableLoadable.a(this.a.a());
    }
}
