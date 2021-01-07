package com.spotify.mobile.android.hubframework.defaults.playback;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.google.common.base.Optional;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.play.f;
import com.spotify.rxjava2.q;
import io.reactivex.d0;
import io.reactivex.z;

public class PlayFromContextCommandHandler implements a71 {
    private final f a;
    private final bec b;
    private final p71 c;
    private final ExplicitPlaybackCommandHelper f;
    private final j81 n;
    private final ere o;
    private final bre p;
    private final PlayOrigin q;
    private final q r = new q();

    public PlayFromContextCommandHandler(f fVar, bec bec, p71 p71, ExplicitPlaybackCommandHelper explicitPlaybackCommandHelper, j81 j81, ere ere, final n nVar, bre bre, PlayOrigin playOrigin) {
        fVar.getClass();
        this.a = fVar;
        bec.getClass();
        this.b = bec;
        p71.getClass();
        this.c = p71;
        explicitPlaybackCommandHelper.getClass();
        this.f = explicitPlaybackCommandHelper;
        this.n = j81;
        this.o = ere;
        this.p = bre;
        this.q = playOrigin;
        nVar.A().a(new m() {
            /* class com.spotify.mobile.android.hubframework.defaults.playback.PlayFromContextCommandHandler.AnonymousClass1 */

            @w(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                PlayFromContextCommandHandler.this.r.c();
                nVar.A().c(this);
            }

            @w(Lifecycle.Event.ON_PAUSE)
            public void onPause() {
                PlayFromContextCommandHandler.this.r.c();
            }
        });
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        nqe nqe;
        z<Boolean> zVar;
        s81 d = n61.d();
        Context a2 = f51.a(o81.data());
        if (a2 != null) {
            String string = o81.data().string("uri");
            if (string == null) {
                string = "";
            }
            PreparePlayOptions b2 = f51.b(o81.data());
            if ((b2 == null || !b2.playerOptionsOverride().isPresent() || !b2.playerOptionsOverride().get().shufflingContext().isPresent()) ? false : b2.playerOptionsOverride().get().shufflingContext().get().booleanValue()) {
                nqe = this.n.a(n61).h(string);
            } else {
                nqe = this.n.a(n61).d(string);
            }
            this.o.a(nqe);
            String b3 = nqe.b();
            this.c.a(string, d, "play", null);
            Optional<String> absent = Optional.absent();
            if (b2 != null && b2.skipTo().isPresent()) {
                absent = b2.skipTo().get().trackUri();
            }
            if (!this.f.d(d.metadata().boolValue("explicit", false)) || !absent.isPresent()) {
                q qVar = this.r;
                if (!absent.isPresent()) {
                    zVar = z.z(Boolean.TRUE);
                } else {
                    zVar = this.b.a(absent.get());
                }
                qVar.a(zVar.s(new g(this, a2, b3, b2)).subscribe());
                return;
            }
            this.f.e(absent.get(), a2.uri());
        }
    }

    public /* synthetic */ d0 c(Context context, String str, PreparePlayOptions preparePlayOptions, Boolean bool) {
        if (!bool.booleanValue()) {
            return z.z(zwd.b());
        }
        PlayCommand.Builder loggingParams = PlayCommand.builder(context, this.q).loggingParams(LoggingParams.builder().interactionId(str).pageInstanceId(this.p.get()).build());
        if (preparePlayOptions != null) {
            loggingParams.options(preparePlayOptions);
        }
        return this.a.a(loggingParams.build());
    }
}
