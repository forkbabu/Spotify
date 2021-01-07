package defpackage;

import com.spotify.music.lyrics.core.experience.contract.a;
import com.spotify.music.lyrics.core.experience.contract.b;
import com.spotify.music.lyrics.core.experience.model.Lyrics;
import com.spotify.music.lyrics.core.experience.presenter.controller.c;
import kotlin.jvm.internal.h;

/* renamed from: kdb  reason: default package */
public final class kdb implements a {
    private b a;
    private final com.spotify.music.lyrics.core.experience.rx.a b;
    private final c c;
    private final cdb d;

    public kdb(com.spotify.music.lyrics.core.experience.rx.a aVar, c cVar, cdb cdb) {
        h.e(aVar, "rxLyrics");
        h.e(cVar, "lyricsPlaybackController");
        h.e(cdb, "lyricsLogObserver");
        this.b = aVar;
        this.c = cVar;
        this.d = cdb;
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.a
    public void a() {
        this.c.b();
        this.d.d();
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.a
    public void b() {
        c cVar = this.c;
        b bVar = this.a;
        if (bVar != null) {
            cVar.a(bVar);
        } else {
            h.k("viewBinder");
            throw null;
        }
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.a
    public void c(int i) {
        this.b.j(i);
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.a
    public void d(int i, int i2) {
        this.b.l(i, i2);
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.a
    public void e(Lyrics lyrics, boolean z) {
        h.e(lyrics, "lyrics");
        this.d.b();
        this.b.m(lyrics, z);
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.a
    public void f(b bVar) {
        h.e(bVar, "viewBinder");
        this.a = bVar;
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.a
    public void g(int i) {
        this.b.o(i);
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.a
    public void h() {
        cdb cdb = this.d;
        b bVar = this.a;
        if (bVar != null) {
            cdb.c(bVar);
        } else {
            h.k("viewBinder");
            throw null;
        }
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.a
    public void i(int i, int i2) {
        this.b.i(i, i2);
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.a
    public void setStartY(int i) {
        this.b.n(i);
    }
}
