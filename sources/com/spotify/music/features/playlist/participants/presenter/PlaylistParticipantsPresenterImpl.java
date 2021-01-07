package com.spotify.music.features.playlist.participants.presenter;

import com.spotify.music.navigation.t;
import com.spotify.playlist.endpoints.d;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class PlaylistParticipantsPresenterImpl implements a, ws2 {
    private final p a = new p();
    private final n06 b;
    private final vs2 c;
    private final t f;
    private final h06 n;
    private final y o;

    public PlaylistParticipantsPresenterImpl(n06 n06, vs2 vs2, t tVar, h06 h06, y yVar) {
        h.e(n06, "viewBinder");
        h.e(vs2, "backPressedDelegatable");
        h.e(tVar, "navigator");
        h.e(h06, "logger");
        h.e(yVar, "mainScheduler");
        this.b = n06;
        this.c = vs2;
        this.f = tVar;
        this.n = h06;
        this.o = yVar;
    }

    public static final void e(PlaylistParticipantsPresenterImpl playlistParticipantsPresenterImpl, d.a aVar) {
        playlistParticipantsPresenterImpl.b.setTitle(aVar.b());
        playlistParticipantsPresenterImpl.b.d(aVar.c());
        playlistParticipantsPresenterImpl.b.c(aVar.a());
    }

    @Override // com.spotify.music.features.playlist.participants.presenter.a
    public void a(s<d.a> sVar) {
        h.e(sVar, "collaboratorsObservable");
        this.c.I1(this);
        this.a.b(sVar.o0(this.o).subscribe(new b(new PlaylistParticipantsPresenterImpl$start$1(this))));
    }

    @Override // defpackage.ws2
    public boolean b() {
        this.n.d();
        this.f.a();
        return true;
    }

    @Override // com.spotify.music.features.playlist.participants.ui.PlaylistParticipantsAdapter.c
    public void c(int i, com.spotify.playlist.models.p pVar) {
        h.e(pVar, "user");
        this.f.b(pVar.e(), this.n.e(pVar.e(), i, pVar.e()));
    }

    @Override // com.spotify.music.features.playlist.participants.ui.d.b
    public void d() {
        this.n.c();
        this.f.a();
    }

    @Override // com.spotify.music.features.playlist.participants.presenter.a
    public void stop() {
        this.c.I1(null);
        this.a.a();
    }
}
