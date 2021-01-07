package com.spotify.music.libs.podcast.loader;

import com.spotify.mobile.android.spotlets.show.proto.ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return tyd.g((ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse) obj);
    }
}
