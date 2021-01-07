package com.spotify.music.podcast.player.trailer.impl;

import com.spotify.music.podcast.player.trailer.impl.j;
import com.spotify.music.podcast.player.trailer.impl.k;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.play.f;
import defpackage.unc;
import defpackage.zwd;
import io.reactivex.g;
import io.reactivex.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class PlayerApiTrailerPlayerActionPerformer implements k {
    private final f a;
    private final lxd b;
    private final g<Boolean> c;
    private final d d;
    private final unc e;

    public PlayerApiTrailerPlayerActionPerformer(f fVar, lxd lxd, g<Boolean> gVar, d dVar, unc unc) {
        h.e(fVar, "player");
        h.e(lxd, "playerCommandFactory");
        h.e(gVar, "isResumedFlowable");
        h.e(dVar, "playerControls");
        h.e(unc, "interactionIdProcessor");
        this.a = fVar;
        this.b = lxd;
        this.c = gVar;
        this.d = dVar;
        this.e = unc;
    }

    public static final k.a b(PlayerApiTrailerPlayerActionPerformer playerApiTrailerPlayerActionPerformer, zwd zwd) {
        playerApiTrailerPlayerActionPerformer.getClass();
        if (zwd instanceof zwd.b) {
            return k.a.b.a;
        }
        if (!(zwd instanceof zwd.a)) {
            return new k.a.C0330a("Unknown failure.");
        }
        String c2 = ((zwd.a) zwd).c();
        h.d(c2, "commandResult.reasons()");
        return new k.a.C0330a(c2);
    }

    public static final z c(PlayerApiTrailerPlayerActionPerformer playerApiTrailerPlayerActionPerformer, String str) {
        return playerApiTrailerPlayerActionPerformer.d.a(c.f(ResumeCommand.builder().loggingParams(playerApiTrailerPlayerActionPerformer.e(str)).build()));
    }

    public static final z d(PlayerApiTrailerPlayerActionPerformer playerApiTrailerPlayerActionPerformer, String str) {
        return playerApiTrailerPlayerActionPerformer.d.a(c.d(PauseCommand.builder().loggingParams(LoggingParams.builder().pageInstanceId(playerApiTrailerPlayerActionPerformer.e.a()).interactionId(playerApiTrailerPlayerActionPerformer.e.b(new unc.a.C0688a(str))).build()).build()));
    }

    private final LoggingParams e(String str) {
        return LoggingParams.builder().pageInstanceId(this.e.a()).interactionId(this.e.b(new unc.a.b(str))).build();
    }

    private final z<k.a> f(String str) {
        z<R> A = this.d.a(c.j(SkipToNextTrackCommand.builder().loggingParams(e(str)).options(CommandOptions.builder().overrideRestrictions(true).build()).build())).A(new g(new PlayerApiTrailerPlayerActionPerformer$skipToNext$1(this)));
        h.d(A, "playerControls.execute(\n…mandResultToActionResult)");
        return A;
    }

    @Override // com.spotify.music.podcast.player.trailer.impl.k
    public z<k.a> a(j jVar) {
        Boolean bool = Boolean.FALSE;
        h.e(jVar, "action");
        if (jVar instanceof j.b) {
            j.b bVar = (j.b) jVar;
            String b2 = bVar.b();
            z<R> A = this.a.a(this.b.a(bVar.a()).loggingParams(e(b2)).options(PreparePlayOptions.builder().suppressions(kotlin.collections.d.G("mft")).playerOptionsOverride(PlayerOptionOverrides.builder().shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build()).build()).build()).A(new g(new PlayerApiTrailerPlayerActionPerformer$playFromNewContext$1(this)));
            h.d(A, "player.play(buildPlayFro…mandResultToActionResult)");
            return A;
        } else if (jVar instanceof j.d) {
            z<R> A2 = this.c.D(bool).s(new f(this, ((j.d) jVar).a())).A(new g(new PlayerApiTrailerPlayerActionPerformer$resumeOrPausePlayer$2(this)));
            h.d(A2, "isResumedFlowable\n      …mandResultToActionResult)");
            return A2;
        } else if (jVar instanceof j.e) {
            return f(((j.e) jVar).a());
        } else {
            if (jVar instanceof j.c) {
                String uri = ((j.c) jVar).a().uri();
                h.d(uri, "action.trailerTrack.uri()");
                return f(uri);
            } else if (jVar instanceof j.a) {
                z<k.a> z = z.z(k.a.b.a);
                h.d(z, "Single.just(ActionResult.Success)");
                return z;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
