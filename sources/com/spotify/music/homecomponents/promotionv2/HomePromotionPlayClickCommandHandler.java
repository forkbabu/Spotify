package com.spotify.music.homecomponents.promotionv2;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.google.common.base.MoreObjects;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.play.f;
import com.spotify.rxjava2.q;
import io.reactivex.g;

public class HomePromotionPlayClickCommandHandler implements a71 {
    private final f a;
    private final lxd b;
    private final d c;
    private final HomePromotionPlayButtonLogger f;
    private final bre n;
    private final q o = new q();
    private PlayerState p = PlayerState.EMPTY;

    public HomePromotionPlayClickCommandHandler(final g<PlayerState> gVar, f fVar, lxd lxd, d dVar, HomePromotionPlayButtonLogger homePromotionPlayButtonLogger, n nVar, bre bre) {
        this.a = fVar;
        this.b = lxd;
        this.c = dVar;
        this.f = homePromotionPlayButtonLogger;
        this.n = bre;
        nVar.A().a(new m() {
            /* class com.spotify.music.homecomponents.promotionv2.HomePromotionPlayClickCommandHandler.AnonymousClass1 */

            @w(Lifecycle.Event.ON_PAUSE)
            public void onPause() {
                HomePromotionPlayClickCommandHandler.this.o.c();
            }

            @w(Lifecycle.Event.ON_RESUME)
            public void onResume() {
                HomePromotionPlayClickCommandHandler.this.o.a(gVar.subscribe(new e(this)));
            }
        });
    }

    public static String d(o81 o81) {
        Context a2 = f51.a(o81.data());
        if (a2 != null) {
            return a2.uri();
        }
        return null;
    }

    public static boolean e(PlayerState playerState, String str) {
        if (str != null && str.equals(playerState.contextUri()) && playerState.isPlaying() && !playerState.isPaused()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String d = d(o81);
        String string = o81.data().string("uri");
        if (!MoreObjects.isNullOrEmpty(d) && !MoreObjects.isNullOrEmpty(string)) {
            if (!d.equals(this.p.contextUri())) {
                String c2 = this.f.c(string, n61);
                Context a2 = f51.a(o81.data());
                if (a2 != null) {
                    PreparePlayOptions b2 = f51.b(o81.data());
                    PlayCommand.Builder a3 = this.b.a(a2);
                    if (b2 != null) {
                        a3.options(b2);
                    }
                    a3.loggingParams(LoggingParams.builder().interactionId(c2).pageInstanceId(this.n.get()).build());
                    this.o.a(this.a.a(a3.build()).subscribe());
                }
            } else if (!this.p.isPlaying() || this.p.isPaused()) {
                this.o.a(this.c.a(c.e()).subscribe());
                this.f.d(string, n61);
            } else {
                this.o.a(this.c.a(c.c()).subscribe());
                this.f.b(string, n61);
            }
        }
    }
}
