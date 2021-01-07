package com.spotify.music.features.podcast.episode.inspector.tracklist.views.page;

import com.spotify.music.features.podcast.episode.inspector.tracklist.views.page.g;
import com.spotify.music.libs.viewuri.c;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.y;

public class e implements d, g.a {
    private final g a;
    private final ga7 b;
    private final q97 c;
    private final j97 d;
    private final q e = new q();
    private final y f;

    public e(y yVar, g gVar, ga7 ga7, j97 j97, q97 q97) {
        this.f = yVar;
        this.a = gVar;
        this.b = ga7;
        this.d = j97;
        this.c = q97;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.views.page.g.a
    public void a(int i, String str, String str2, String str3, c cVar) {
        this.b.a(str, str2, str3, cVar);
        this.c.b(i, str);
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.views.page.d
    public void b(s<k87> sVar) {
        q qVar = this.e;
        s<k87> o0 = sVar.o0(this.f);
        g gVar = this.a;
        gVar.getClass();
        qVar.a(o0.subscribe(new a(gVar)));
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.views.page.g.a
    public void c(int i, String str, String str2, long j) {
        this.e.a(this.d.a(str, j).subscribe());
        this.c.c(i, str2);
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.views.page.d
    public void stop() {
        this.e.c();
    }
}
