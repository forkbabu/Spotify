package com.spotify.music.deeplinktracker;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.g;

public class PlaybackFromDeeplinkTrackerImpl implements e {
    private final g<PlayerState> a;
    private final r4e b;
    private String c;
    private final p d = new p();
    private final Lifecycle e;
    private PlayerState f;
    private final m g = new m() {
        /* class com.spotify.music.deeplinktracker.PlaybackFromDeeplinkTrackerImpl.AnonymousClass1 */

        @w(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            PlaybackFromDeeplinkTrackerImpl.b(PlaybackFromDeeplinkTrackerImpl.this);
        }

        @w(Lifecycle.Event.ON_STOP)
        public void onStop() {
            PlaybackFromDeeplinkTrackerImpl.a(PlaybackFromDeeplinkTrackerImpl.this);
        }
    };

    public PlaybackFromDeeplinkTrackerImpl(g<PlayerState> gVar, r4e r4e, Lifecycle lifecycle) {
        this.a = gVar;
        this.b = r4e;
        this.e = lifecycle;
    }

    static void a(PlaybackFromDeeplinkTrackerImpl playbackFromDeeplinkTrackerImpl) {
        playbackFromDeeplinkTrackerImpl.c();
    }

    static void b(PlaybackFromDeeplinkTrackerImpl playbackFromDeeplinkTrackerImpl) {
        playbackFromDeeplinkTrackerImpl.e.c(playbackFromDeeplinkTrackerImpl.g);
    }

    private void c() {
        this.c = null;
        this.f = null;
        this.d.a();
    }

    private static boolean d(PlayerState playerState) {
        return playerState.track().isPresent() && (kxd.f(playerState.track().get()) || kxd.j(playerState.track().get()));
    }

    public void e(PlayerState playerState) {
        PlayerState playerState2 = this.f;
        if (!(playerState2 == null || this.c == null)) {
            boolean z = false;
            if (playerState.playbackId().isPresent() && !d(playerState) && ((!playerState2.playbackId().isPresent() && playerState.playbackId().isPresent()) || !playerState.contextUri().equals(playerState2.contextUri()) || (playerState2.isPaused() && !playerState.isPaused()))) {
                z = true;
            }
            if (z) {
                this.b.c(playerState.playbackId().get(), this.c, playerState.track().isPresent() ? playerState.track().get().uri() : "", playerState.contextUri());
                c();
            }
        }
        if (!d(playerState)) {
            this.f = playerState;
        }
    }

    public void f(String str) {
        c();
        this.e.c(this.g);
        this.e.a(this.g);
        this.c = str;
        this.d.b(this.a.subscribe(new a(this)));
    }
}
