package com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist;

import com.spotify.music.nowplaying.podcast.mixedmedia.model.TrackListItemType;
import com.spotify.music.nowplaying.podcast.mixedmedia.segments.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu.c;
import com.spotify.rxjava2.q;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class TrackListPresenterImpl implements f {
    private final q a = new q();
    private boolean b;
    private final a c;
    private final y d;
    private final i e;
    private final c f;
    private final com.spotify.music.nowplaying.podcast.mixedmedia.player.a g;
    private final f1c h;

    public TrackListPresenterImpl(a aVar, y yVar, i iVar, c cVar, com.spotify.music.nowplaying.podcast.mixedmedia.player.a aVar2, f1c f1c) {
        h.e(aVar, "enhancedTrackListModelFlowableHelper");
        h.e(yVar, "mainThread");
        h.e(iVar, "trackListViewBinder");
        h.e(cVar, "contextMenuHandler");
        h.e(aVar2, "playerHelper");
        h.e(f1c, "trackListLogger");
        this.c = aVar;
        this.d = yVar;
        this.e = iVar;
        this.f = cVar;
        this.g = aVar2;
        this.h = f1c;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu.f
    public void a(String str, String str2, String str3, com.spotify.music.libs.viewuri.c cVar, int i) {
        h.e(str, "trackUri");
        h.e(str2, "trackName");
        h.e(str3, "contextUri");
        h.e(cVar, "viewUri");
        this.h.j(i, str);
        this.f.a(str, str2, str3, cVar);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.b
    public void b(int i, c cVar) {
        h.e(cVar, "itemViewModel");
        this.h.h(i, cVar.b().a(), cVar.h());
        this.a.a(this.g.c(cVar.b(), cVar.e()).subscribe(new g(new TrackListPresenterImpl$onTrackListItemSelected$1(this)), new g(new TrackListPresenterImpl$onTrackListItemSelected$2(this))));
        if (cVar.d() == TrackListItemType.MUSIC && cVar.a() && !this.b) {
            this.e.d();
            this.b = true;
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.f
    public void start() {
        this.h.a();
        this.a.a(this.c.a().Q(this.d).subscribe(new g(new TrackListPresenterImpl$start$1(this.e)), new g(new TrackListPresenterImpl$start$2(this.e))));
        this.b = false;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.f
    public void stop() {
        this.a.c();
    }
}
