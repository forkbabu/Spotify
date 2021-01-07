package defpackage;

import com.spotify.music.features.podcast.episode.transcript.ui.page.d;
import com.spotify.music.features.podcast.episode.transcript.ui.page.g;

/* renamed from: db7  reason: default package */
public final class db7 {
    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public cb7 b(ab7 ab7, d dVar, g gVar) {
        a(ab7, 1);
        a(dVar, 2);
        a(gVar, 3);
        return new cb7(ab7, dVar, gVar);
    }
}
