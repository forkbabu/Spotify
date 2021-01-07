package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcastentityrow.g;
import com.spotify.music.podcastentityrow.j;
import com.spotify.music.podcastentityrow.n;
import com.spotify.music.podcastentityrow.playback.b;
import com.spotify.music.podcastentityrow.playback.d;
import com.spotify.playlist.models.Episode;
import kotlin.jvm.internal.h;

/* renamed from: ugc  reason: default package */
public final class ugc implements tgc, g {
    private final c a;
    private final j b;
    private final b c;
    private final n d;
    private final atc e;

    public ugc(c cVar, j jVar, b bVar, n nVar, atc atc) {
        h.e(cVar, "viewUri");
        h.e(jVar, "markAsPlayedClickListener");
        h.e(bVar, "episodePlayButtonClickListener");
        h.e(nVar, "playSourceProvider");
        h.e(atc, "logger");
        this.a = cVar;
        this.b = jVar;
        this.c = bVar;
        this.d = nVar;
        this.e = atc;
    }

    @Override // defpackage.tgc
    public void b(String str, String str2, int i) {
        h.e(str, "uri");
        h.e(str2, "sectionName");
        this.b.a(str, str2, i);
        this.e.a(str, str2, i);
    }

    @Override // defpackage.tgc
    public void c(Episode episode, Episode[] episodeArr, String str, int i) {
        h.e(episode, "episode");
        h.e(episodeArr, "episodes");
        h.e(str, "sectionName");
        this.d.getClass();
        this.c.a(new b.a(this, episode.getUri(), episode.C(), d.b(this.a, episodeArr), str, i));
    }

    @Override // com.spotify.music.podcastentityrow.g
    public String e(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "section");
        return this.e.b(str, str2, i);
    }

    @Override // com.spotify.music.podcastentityrow.g
    public String h(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "section");
        return this.e.c(str, str2, i);
    }
}
