package com.spotify.music.features.creatorartist.model;

import io.reactivex.z;

public interface a {
    @zqf("creatorabout/v0/artist/{artistId}/about?fields=artist,listenerCount,monthlyListenerRank")
    z<CreatorAboutModel> a(@mrf("artistId") String str);
}
