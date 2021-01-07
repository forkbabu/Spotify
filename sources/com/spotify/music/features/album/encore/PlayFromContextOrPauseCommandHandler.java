package com.spotify.music.features.album.encore;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import kotlin.jvm.internal.h;

public final class PlayFromContextOrPauseCommandHandler implements a71, m {
    private final q a = new q();
    private PlayerState b;
    private final d c;
    private final n f;
    private final g<PlayerState> n;
    private final a71 o;

    static final class a<T> implements io.reactivex.functions.g<PlayerState> {
        final /* synthetic */ PlayFromContextOrPauseCommandHandler a;

        a(PlayFromContextOrPauseCommandHandler playFromContextOrPauseCommandHandler) {
            this.a = playFromContextOrPauseCommandHandler;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(PlayerState playerState) {
            this.a.b = playerState;
        }
    }

    static final class b<T> implements io.reactivex.functions.g<Throwable> {
        public static final b a = new b();

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Throwable th2 = th;
            h.e(th2, "throwable");
            Logger.e(th2, "Failed to fetch player state", new Object[0]);
        }
    }

    public PlayFromContextOrPauseCommandHandler(d dVar, n nVar, g<PlayerState> gVar, a71 a71) {
        h.e(dVar, "playerControls");
        h.e(nVar, "lifecycleOwner");
        h.e(gVar, "playerStateFlowable");
        h.e(a71, "playFromContextCommandHandler");
        this.c = dVar;
        this.f = nVar;
        this.n = gVar;
        this.o = a71;
        nVar.A().a(this);
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        h.e(o81, "model");
        String string = o81.data().string("uri");
        PlayerState playerState = this.b;
        if (playerState != null && h.a(string, playerState.contextUri()) && playerState.isPlaying() && !playerState.isPaused()) {
            this.a.a(this.c.a(c.c()).subscribe());
        } else if (n61 != null) {
            this.o.b(o81, n61);
        }
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.a.c();
    }

    @w(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        q qVar = this.a;
        g<PlayerState> gVar = this.n;
        gVar.getClass();
        qVar.a(new v(gVar).subscribe(new a(this), b.a));
    }
}
