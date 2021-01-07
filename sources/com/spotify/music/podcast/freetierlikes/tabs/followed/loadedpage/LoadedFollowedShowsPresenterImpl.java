package com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage;

import com.spotify.music.podcast.freetierlikes.tabs.followed.c0;
import com.spotify.music.podcast.freetierlikes.tabs.followed.d0;
import com.spotify.playlist.models.Show;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.y;
import java.util.List;
import kotlin.jvm.internal.h;

public final class LoadedFollowedShowsPresenterImpl implements d {
    private final q a = new q();
    private final y b;
    private final g c;
    private final d0 d;

    public LoadedFollowedShowsPresenterImpl(y yVar, g gVar, d0 d0Var) {
        h.e(yVar, "mainScheduler");
        h.e(gVar, "viewBinder");
        h.e(d0Var, "showPlayerStateProvider");
        this.b = yVar;
        this.c = gVar;
        this.d = d0Var;
    }

    public static final void c(LoadedFollowedShowsPresenterImpl loadedFollowedShowsPresenterImpl, ryd ryd) {
        loadedFollowedShowsPresenterImpl.getClass();
        List<Show> items = ryd.getItems();
        if (items.isEmpty()) {
            loadedFollowedShowsPresenterImpl.c.f();
            return;
        }
        loadedFollowedShowsPresenterImpl.c.h();
        loadedFollowedShowsPresenterImpl.c.i(items);
    }

    public static final void d(LoadedFollowedShowsPresenterImpl loadedFollowedShowsPresenterImpl, c0 c0Var) {
        loadedFollowedShowsPresenterImpl.c.g(c0Var.a());
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.d
    public void a(s<ryd> sVar) {
        h.e(sVar, "initialData");
        this.a.a(sVar.o0(this.b).subscribe(new e(new LoadedFollowedShowsPresenterImpl$start$1(this))));
        this.a.a(this.d.a().o0(this.b).subscribe(new e(new LoadedFollowedShowsPresenterImpl$start$2(this))));
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.d
    public void b() {
        if (this.a.d() > 0) {
            this.c.c();
        }
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.d
    public void stop() {
        this.a.c();
    }
}
