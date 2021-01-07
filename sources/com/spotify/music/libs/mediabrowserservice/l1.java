package com.spotify.music.libs.mediabrowserservice;

import com.spotify.player.model.AudioStream;
import com.spotify.player.model.PlayerState;
import io.reactivex.disposables.d;
import io.reactivex.g;

class l1 {
    private final g<PlayerState> a;
    private final d b = new d();
    private boolean c;

    l1(g<PlayerState> gVar) {
        this.a = gVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.b.dispose();
    }

    public /* synthetic */ void b(PlayerState playerState) {
        if (playerState.isPlaying() && !playerState.isPaused()) {
            this.c = playerState.audioStream() == AudioStream.ALARM;
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.b.b(this.a.subscribe(new d(this)));
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.c;
    }
}
