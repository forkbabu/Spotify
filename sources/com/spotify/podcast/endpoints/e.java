package com.spotify.podcast.endpoints;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnfinishedEpisodesRequest$Response;
import io.reactivex.functions.l;
import io.reactivex.z;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return z.z(ShowUnfinishedEpisodesRequest$Response.l(((Response) obj).getBody()));
    }
}
