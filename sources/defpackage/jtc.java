package defpackage;

import com.spotify.music.podcast.episode.util.j;
import com.spotify.playlist.models.Episode;

/* renamed from: jtc  reason: default package */
public class jtc {
    private final j a;

    public jtc(j jVar) {
        this.a = jVar;
    }

    public String a(String str, Episode episode, boolean z, boolean z2) {
        j.b g = this.a.g(str, episode.u(), episode.j(), episode.x(), episode.E());
        g.b(z);
        g.c(true);
        g.a(z2);
        return g.build();
    }
}
