package com.spotify.music.podcast.ui.topic;

import android.view.ViewGroup;
import com.spotify.music.podcast.ui.topic.p;

public final class j implements p.b {
    private final wlf<r> a;

    public j(wlf<r> wlf) {
        b(wlf, 1);
        this.a = wlf;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.podcast.ui.topic.p.b
    public p a(ViewGroup viewGroup) {
        b(viewGroup, 1);
        r rVar = this.a.get();
        b(rVar, 2);
        return new i(viewGroup, rVar);
    }
}
