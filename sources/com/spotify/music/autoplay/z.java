package com.spotify.music.autoplay;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.player.model.PlayerState;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

public class z {
    private final s<RadioSeedBundle> a;
    private final jz1 b;
    private final nfd c;
    private final s<PlayerState> d;
    private final cqe e;
    private final Player f;
    private b g = EmptyDisposable.INSTANCE;

    z(s<RadioSeedBundle> sVar, jz1 jz1, nfd nfd, g<PlayerState> gVar, cqe cqe, Player player) {
        this.a = sVar;
        this.b = jz1;
        this.c = nfd;
        gVar.getClass();
        this.d = new v(gVar);
        this.e = cqe;
        this.f = player;
    }

    public static void a(z zVar, u3 u3Var) {
        zVar.getClass();
        S s = u3Var.b;
        s.getClass();
        String radioSeed = s.getRadioSeed();
        F f2 = u3Var.a;
        f2.getClass();
        if (!f2.contextUri().contains(radioSeed)) {
            zVar.b.a(new da1(u3Var.a.playbackId().orNull(), "autoplay", u3Var.a.contextUri(), null, 0, radioSeed, "AUTOPLAY_STOPPED", null, (double) zVar.e.d()));
        }
    }

    public io.reactivex.v b(Context context, RadioSeedBundle radioSeedBundle) {
        if (!agd.i(radioSeedBundle.getRadioSeed())) {
            return s.c0(new l(this, radioSeedBundle));
        }
        s<PlayerState> sVar = this.d;
        jz1 jz1 = this.b;
        cqe cqe = this.e;
        nfd nfd = this.c;
        context.getClass();
        return s.c0(new h0(radioSeedBundle, context, nfd, jz1, cqe)).J0(new f(sVar, radioSeedBundle)).W(new k(radioSeedBundle), false, Integer.MAX_VALUE);
    }

    public RadioSeedBundle c(RadioSeedBundle radioSeedBundle) {
        String radioSeed = radioSeedBundle.getRadioSeed();
        StringBuilder V0 = je.V0("context://");
        V0.append(radioSeedBundle.getRadioSeed());
        this.f.play(PlayerContext.createFromContextUrl(radioSeed, V0.toString()), new PlayOptions.Builder().build());
        this.b.a(new da1(radioSeedBundle.getPlaybackId(), "autoplay", radioSeedBundle.getPlayOrigin().viewUri(), null, 0, radioSeedBundle.getRadioSeed(), "AUTOPLAY_TRIGGERED", null, (double) this.e.d()));
        return radioSeedBundle;
    }

    public void d(Context context) {
        this.g.dispose();
        this.g = this.a.J0(new m(this, context)).J0(new i(this.d)).subscribe(new n(this), g.a);
    }

    public void e() {
        this.g.dispose();
    }
}
