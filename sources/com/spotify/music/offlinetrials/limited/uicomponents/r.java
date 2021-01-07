package com.spotify.music.offlinetrials.limited.uicomponents;

import com.spotify.instrumentation.a;
import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import com.spotify.music.offlinetrials.limited.logging.OfflineUserMixInteractionLogger;
import com.spotify.music.offlinetrials.limited.logging.c;
import com.spotify.music.offlinetrials.limited.uicomponents.t;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.y;

public class r implements t.a {
    private final g<PlayerState> a;
    private final UserMixDataSource b;
    private final q c = new q();
    private PlayerState d;
    private t e;
    private final boolean f;
    private final w g;
    private final u h;
    private final y i;
    private final OfflineUserMixInteractionLogger j;

    public r(g<PlayerState> gVar, UserMixDataSource userMixDataSource, boolean z, w wVar, u uVar, y yVar, c cVar, com.spotify.music.libs.viewuri.c cVar2, a aVar) {
        this.a = gVar;
        this.b = userMixDataSource;
        this.f = z;
        this.i = yVar;
        this.g = wVar;
        this.h = uVar;
        this.j = cVar.b(cVar2, aVar);
    }

    public static void b(r rVar, PlayerState playerState) {
        rVar.d = playerState;
        rVar.e.setDownloadState(Boolean.parseBoolean(playerState.track().get().metadata().get(ContextTrack.Metadata.KEY_MARKED_FOR_DOWNLOAD)));
    }

    private void h(UserMixDataSource.TrackState trackState) {
        if (trackState == UserMixDataSource.TrackState.ADDED) {
            this.e.setDownloadState(true);
        } else if (trackState == UserMixDataSource.TrackState.REMOVED) {
            this.e.setDownloadState(false);
        }
    }

    @Override // com.spotify.music.offlinetrials.limited.uicomponents.t.a
    public void a() {
        ContextTrack contextTrack = this.d.track().get();
        String uri = contextTrack.uri();
        boolean parseBoolean = Boolean.parseBoolean(contextTrack.metadata().get(ContextTrack.Metadata.KEY_MARKED_FOR_DOWNLOAD));
        this.j.d(uri, -1, !parseBoolean);
        if (parseBoolean) {
            this.h.f(h.a, new d(this, uri));
        } else {
            this.c.a(this.b.a(uri).B(this.i).subscribe(new c(this)));
        }
    }

    public /* synthetic */ void c(UserMixDataSource.TrackState trackState) {
        h(trackState);
        this.g.b(trackState, new a(this));
    }

    public /* synthetic */ void d(String str, UserMixDataSource.TrackState trackState) {
        h(trackState);
        this.g.b(trackState, new g(this, str));
    }

    public void e(t tVar) {
        if (this.f) {
            tVar.getClass();
            this.e = tVar;
            tVar.setListener(this);
            this.e.d();
            this.c.a(this.a.subscribe(new f(this)));
        }
    }

    public void f() {
        this.c.c();
    }

    /* access modifiers changed from: package-private */
    public void g(String str) {
        this.c.a(this.b.c(str).B(this.i).subscribe(new e(this, str)));
    }
}
