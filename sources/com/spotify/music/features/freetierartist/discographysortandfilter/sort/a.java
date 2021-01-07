package com.spotify.music.features.freetierartist.discographysortandfilter.sort;

import com.spotify.player.model.ContextTrack;
import java.util.Comparator;

/* compiled from: java-style lambda group */
public final class a<T> implements Comparator<T> {
    public final /* synthetic */ int a;

    public a(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int i = this.a;
        if (i == 0) {
            return xlf.a(t.text().title(), t2.text().title());
        }
        if (i == 1) {
            return xlf.a(t2.metadata().intValue(ContextTrack.Metadata.KEY_POPULARITY), t.metadata().intValue(ContextTrack.Metadata.KEY_POPULARITY));
        }
        if (i == 2) {
            return xlf.a(t2.metadata().string("releaseDate", ""), t.metadata().string("releaseDate", ""));
        }
        throw null;
    }
}
