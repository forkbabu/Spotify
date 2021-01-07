package com.spotify.music.libs.podcast.loader;

import com.google.common.base.Optional;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ c(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Show w;
        String str = this.a;
        Episode episode = (Episode) ((Map) obj).get(str);
        if (episode != null && (w = episode.w()) != null) {
            return new g(w, Optional.of(episode));
        }
        throw new RuntimeException(je.y0("Episode ", str, " or show not found"));
    }
}
