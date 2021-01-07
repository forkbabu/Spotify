package com.spotify.music.features.showentity;

import com.spotify.music.features.showentity.t;
import com.spotify.music.libs.podcast.loader.r;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        r rVar = (r) obj;
        if (rVar.a().isPresent()) {
            return new t.c(rVar.a().get().l().ordinal());
        }
        return new t.c(rVar.b().g().ordinal());
    }
}
