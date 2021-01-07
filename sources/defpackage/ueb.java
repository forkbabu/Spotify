package defpackage;

import com.spotify.music.lyrics.core.experience.contract.a;
import com.spotify.music.lyrics.core.experience.contract.b;
import com.spotify.music.lyrics.core.experience.model.Lyrics;
import com.spotify.music.lyrics.share.selection.presenter.controller.LyricsSelectionController;
import kotlin.jvm.internal.h;

/* renamed from: ueb  reason: default package */
public final class ueb implements a {
    private b a;
    private final com.spotify.music.lyrics.core.experience.rx.a b;
    private final LyricsSelectionController c;

    public ueb(com.spotify.music.lyrics.core.experience.rx.a aVar, LyricsSelectionController lyricsSelectionController) {
        h.e(aVar, "rxLyrics");
        h.e(lyricsSelectionController, "selectionController");
        this.b = aVar;
        this.c = lyricsSelectionController;
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.a
    public void a() {
        this.c.k();
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.a
    public void b() {
        LyricsSelectionController lyricsSelectionController = this.c;
        b bVar = this.a;
        if (bVar != null) {
            lyricsSelectionController.j(bVar);
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
