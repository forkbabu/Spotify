package com.spotify.music.libs.podcast.loader;

import com.spotify.mobile.android.spotlets.show.proto.ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return tyd.e((ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse) obj);
    }
}
