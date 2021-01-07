package com.spotify.music.libs.podcast.loader;

import com.google.common.base.Optional;
import com.spotify.playlist.models.Show;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ d(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        Show show = (Show) ((Map) obj).get(str);
        if (show != null) {
            return new g(show, Optional.absent());
        }
        throw new RuntimeException(je.y0("Show ", str, " not found"));
    }
}
