package com.spotify.music.features.podcast.episode.datasource;

import com.spotify.mobile.android.util.t;
import com.spotify.music.json.g;

public final class v implements fjf<u> {
    public static u a(w wVar, y yVar, cqe cqe, t tVar, String str) {
        return new u(wVar, yVar, cqe, tVar, str);
    }

    public static a0 b(Object obj, Object obj2, ke7 ke7, p87 p87, c27 c27) {
        return new a0((RxEpisodeDataLoader) obj, (u) obj2, ke7, p87, c27);
    }

    public static RxEpisodeDataLoader c(b0 b0Var, g gVar) {
        return new RxEpisodeDataLoader(b0Var, gVar);
    }
}
