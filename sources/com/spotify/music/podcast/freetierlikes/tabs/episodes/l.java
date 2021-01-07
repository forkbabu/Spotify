package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import io.reactivex.functions.h;
import java.util.Map;

final class l<T1, T2, T3, R> implements h<i<Episode>, Map<String, ? extends String>, Integer, wjc> {
    public static final l a = new l();

    l() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.h
    public wjc a(i<Episode> iVar, Map<String, ? extends String> map, Integer num) {
        i<Episode> iVar2 = iVar;
        Map<String, ? extends String> map2 = map;
        Integer num2 = num;
        kotlin.jvm.internal.h.e(iVar2, "episodes");
        kotlin.jvm.internal.h.e(map2, "productState");
        kotlin.jvm.internal.h.e(num2, "yourEpisodesCount");
        kotlin.jvm.internal.h.e(map2, "productStateMap");
        return new wjc(iVar2, kotlin.jvm.internal.h.a("premium", (String) map2.get("type")), num2.intValue(), null, 8);
    }
}
