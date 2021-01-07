package com.spotify.music.nowplaying.podcast.mixedmedia.ui.card;

import com.spotify.music.nowplaying.podcast.mixedmedia.segments.a;
import com.spotify.rxjava2.q;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class CurrentTrackPresenterImpl implements d {
    private final q a = new q();
    private final a b;
    private final g c;
    private final y d;

    public CurrentTrackPresenterImpl(a aVar, g gVar, y yVar) {
        h.e(aVar, "flowableHelper");
        h.e(gVar, "currentTrackViewBinder");
        h.e(yVar, "mainThread");
        this.b = aVar;
        this.c = gVar;
        this.d = yVar;
    }

    public static final void a(CurrentTrackPresenterImpl currentTrackPresenterImpl, com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a aVar) {
        currentTrackPresenterImpl.getClass();
        if (aVar.a().b().i().ordinal() != 1) {
            currentTrackPresenterImpl.c.b(aVar);
        } else {
            currentTrackPresenterImpl.c.c(aVar);
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.card.d
    public void start() {
        this.a.a(this.b.a().Q(this.d).subscribe(new e(new CurrentTrackPresenterImpl$start$1(this)), new e(new CurrentTrackPresenterImpl$start$2(this))));
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.card.d
    public void stop() {
        this.a.c();
    }
}
