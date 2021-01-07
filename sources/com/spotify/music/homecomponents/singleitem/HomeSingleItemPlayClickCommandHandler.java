package com.spotify.music.homecomponents.singleitem;

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

public class HomeSingleItemPlayClickCommandHandler implements a71 {
    private final f a;
    private final lxd b;
    private final d c;
    private final HomeSingleItemPlayButtonLogger f;
    private final q n = new q();
    private PlayerState o = PlayerState.EMPTY;

    public HomeSingleItemPlayClickCommandHandler(final g<PlayerState> gVar, f fVar, lxd lxd, d dVar, HomeSingleItemPlayButtonLogger homeSingleItemPlayButtonLogger, n nVar) {
        this.a = fVar;
        this.b = lxd;
        this.c = dVar;
        this.f = homeSingleItemPlayButtonLogger;
        nVar.A().a(new m() {
            /* class com.spotify.music.homecomponents.singleitem.HomeSingleItemPlayClickCommandHandler.AnonymousClass1 */

            @w(Lifecycle.Event.ON_PAUSE)
            public void onPause() {
                HomeSingleItemPlayClickCommandHandler.this.n.c();
            }

            @w(Lifecycle.Event.ON_RESUME)
            public void onResume() {
                HomeSingleItemPlayClickCommandHandler.this.n.a(gVar.subscribe(new d(this)));
            }
        });
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri");
        if (!MoreObjects.isNullOrEmpty(string)) {
            if (!string.equals(this.o.contextUri())) {
                String c2 = this.f.c(string, n61);
                Context a2 = f51.a(o81.data());
                if (a2 != null) {
                    PreparePlayOptions b2 = f51.b(o81.data());
                    PlayCommand.Builder a3 = this.b.a(a2);
                    if (b2 != null) {
                        a3.options(b2);
                    }
                    a3.loggingParams(LoggingParams.builder().interactionId(c2).build());
                    this.n.a(this.a.a(a3.build()).subscribe());
                }
            } else if (!this.o.isPlaying() || this.o.isPaused()) {
                this.n.a(this.c.a(c.e()).subscribe());
                this.f.d(string, n61);
            } else {
                this.n.a(this.c.a(c.c()).subscribe());
                this.f.b(string, n61);
            }
        }
    }
}
