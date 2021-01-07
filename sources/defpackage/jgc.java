package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.music.podcastentityrow.d;
import com.spotify.music.podcastentityrow.g;
import com.spotify.music.podcastentityrow.j;
import com.spotify.music.podcastentityrow.n;
import com.spotify.music.podcastentityrow.playback.b;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.offline.a;
import kotlin.jvm.internal.h;

/* renamed from: jgc  reason: default package */
public final class jgc implements igc, g {
    private final c a;
    private final b b;
    private final t c;
    private final tsc d;
    private final j e;
    private final qsc f;
    private final n g;
    private final d h;

    public jgc(c cVar, b bVar, t tVar, tsc tsc, j jVar, qsc qsc, n nVar, d dVar) {
        h.e(cVar, "viewUri");
        h.e(bVar, "playButtonClickListener");
        h.e(tVar, "navigator");
        h.e(tsc, "episodeRowLogger");
        h.e(jVar, "markAsPlayedClickListener");
        h.e(qsc, "downloadListener");
        h.e(nVar, "playSourceProvider");
        h.e(dVar, "addToListenLaterClickListener");
        this.a = cVar;
        this.b = bVar;
        this.c = tVar;
        this.d = tsc;
        this.e = jVar;
        this.f = qsc;
        this.g = nVar;
        this.h = dVar;
    }

    @Override // defpackage.igc
    public void a() {
        this.h.a();
    }

    @Override // defpackage.igc
    public void b(String str, String str2, int i) {
        h.e(str, "uri");
        h.e(str2, "sectionName");
        this.e.a(str, str2, i);
        this.d.a(str, str2, i);
    }

    @Override // defpackage.igc
    public void c(Episode episode, Episode[] episodeArr, String str, int i) {
        h.e(episode, "episode");
        h.e(episodeArr, "episodes");
        h.e(str, "sectionName");
        this.c.d(episode.getUri());
        this.d.e(episode.getUri(), str, i);
    }

    @Override // defpackage.igc
    public void d(Episode episode, String str, String str2, int i) {
        h.e(episode, "episode");
        h.e(str, "viewUri");
        h.e(str2, "sectionName");
        this.h.b(episode.getUri(), episode.F(), str);
        this.d.g(episode.getUri(), str2, i, episode.F());
    }

    @Override // com.spotify.music.podcastentityrow.g
    public String e(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "section");
        String b2 = this.d.b(str, str2, i);
        h.d(b2, "episodeRowLogger.logPlay…isodeUri, section, index)");
        return b2;
    }

    @Override // defpackage.igc
    public void f(Episode episode, Episode[] episodeArr, String str, int i) {
        h.e(episode, "episode");
        h.e(episodeArr, "episodes");
        h.e(str, "sectionName");
        this.g.getClass();
        this.b.a(new b.a(this, episode.getUri(), episode.C(), com.spotify.music.podcastentityrow.playback.d.b(this.a, episodeArr), str, i));
    }

    @Override // defpackage.igc
    public void g(Episode episode, String str, int i) {
        h.e(episode, "episode");
        h.e(str, "sectionName");
        qsc qsc = this.f;
        String uri = episode.getUri();
        a o = episode.o();
        h.d(o, "episode.offlineState");
        qsc.a(uri, o, str, i);
    }

    @Override // com.spotify.music.podcastentityrow.g
    public String h(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "section");
        String c2 = this.d.c(str, str2, i);
        h.d(c2, "episodeRowLogger.logPaus…isodeUri, section, index)");
        return c2;
    }
}
