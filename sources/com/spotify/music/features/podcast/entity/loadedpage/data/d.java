package com.spotify.music.features.podcast.entity.loadedpage.data;

import com.spotify.playlist.models.Show;
import io.reactivex.functions.l;
import java.util.Map;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class d<T, R> implements l<Map<String, ? extends Show>, Show> {
    final /* synthetic */ g a;

    d(g gVar) {
        this.a = gVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Show apply(Map<String, ? extends Show> map) {
        Map<String, ? extends Show> map2 = map;
        h.e(map2, "map");
        return (Show) map2.get(this.a.a);
    }
}
