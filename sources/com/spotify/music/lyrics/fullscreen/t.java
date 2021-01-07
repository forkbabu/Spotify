package com.spotify.music.lyrics.fullscreen;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.lyrics.core.experience.model.Lyrics;
import com.spotify.music.lyrics.core.experience.rx.LyricsEventPublisher;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.y;

public class t {
    private final m a;
    private final g<PlayerState> b;
    private final g<Integer> c;
    private final y d;
    private final edb e;
    private final q f = new q();

    t(m mVar, g<PlayerState> gVar, g<Long> gVar2, y yVar, edb edb) {
        mVar.getClass();
        this.a = mVar;
        gVar.getClass();
        this.b = gVar;
        this.c = gVar2.O(b.a);
        yVar.getClass();
        this.d = yVar;
        edb.getClass();
        this.e = edb;
    }

    public void a(LyricsEventPublisher.a aVar) {
        this.e.c();
        Logger.b("onMinimumCharacterCountDisplayed event triggered", new Object[0]);
    }

    public void b(LyricsEventPublisher.a aVar) {
        this.e.d();
        Logger.b("logSyncedThisLyrics event triggered", new Object[0]);
    }

    public /* synthetic */ void c(PlayerState playerState) {
        ContextTrack contextTrack = playerState.track().get();
        if (this.a.G1() == null || contextTrack.equals(this.a.G1())) {
            this.a.X(playerState);
        } else {
            this.a.close();
        }
    }

    public /* synthetic */ void d(Throwable th) {
        Logger.e(th, "Error in getting player state", new Object[0]);
        this.a.close();
    }

    public void e(Lyrics lyrics) {
        this.a.d0(lyrics);
    }

    public void f(g<uqd> gVar) {
        LyricsEventPublisher lyricsEventPublisher = LyricsEventPublisher.c;
        LyricsEventPublisher.c(LyricsEventPublisher.Subject.MINIMUM_CHARACTER_COUNT, this, new i(this));
        LyricsEventPublisher.c(LyricsEventPublisher.Subject.SYNC_THIS_LYRICS, this, new j(this));
        this.f.a(this.b.C(g.a).u(l.a).Q(this.d).subscribe(new h(this), new k(this)));
        q qVar = this.f;
        g<R> l = gVar.Q(this.d).l(new tqd(this.c));
        m mVar = this.a;
        mVar.getClass();
        qVar.a(l.subscribe(new a(mVar)));
    }

    public void g() {
        this.f.c();
        LyricsEventPublisher lyricsEventPublisher = LyricsEventPublisher.c;
        LyricsEventPublisher.d(this);
    }
}
