package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.defaults.playback.ExplicitPlaybackCommandHelper;
import com.spotify.music.libs.restrictedcontent.transformer.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.player.play.f;
import com.spotify.rxjava2.q;
import defpackage.qe8;
import java.util.Collections;

/* renamed from: re8  reason: default package */
public class re8 implements qe8 {
    private final f a;
    private final PlayOrigin b;
    private final c.a c;
    private final q d;
    private final d e;
    private final bec f;
    private final ExplicitPlaybackCommandHelper g;
    private final bre h;
    private final cqe i;

    public re8(f fVar, PlayOrigin playOrigin, c.a aVar, q qVar, d dVar, ExplicitPlaybackCommandHelper explicitPlaybackCommandHelper, bre bre, cqe cqe, bec bec) {
        this.b = playOrigin;
        this.c = aVar;
        this.a = fVar;
        this.d = qVar;
        this.g = explicitPlaybackCommandHelper;
        this.e = dVar;
        this.h = bre;
        this.i = cqe;
        this.f = bec;
    }

    private boolean c(String str, s81 s81) {
        if (!this.e.b(s81)) {
            this.e.a(str, null);
            return false;
        } else if (!this.g.d(s81.metadata().boolValue("explicit", false))) {
            return true;
        } else {
            this.g.e(str, null);
            return false;
        }
    }

    private void f(String str, String str2, Optional<qe8.a> optional) {
        this.d.a(this.a.a(PlayCommand.builder(Context.builder(this.c.getViewUri().toString()).pages(Collections.singletonList(ContextPage.builder().tracks(Collections.singletonList(ContextTrack.builder(str).build())).build())).build(), this.b.toBuilder().viewUri(this.c.getViewUri().toString()).build()).options(PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUri(str).build()).build()).loggingParams(LoggingParams.builder().commandInitiatedTime(Long.valueOf(this.i.d())).pageInstanceId(this.h.get()).interactionId(str2).build()).build()).E(pe8.a).subscribe(new me8(optional)));
    }

    @Override // defpackage.qe8
    public void a(String str, s81 s81, String str2, qe8.a aVar) {
        if (c(str, s81)) {
            this.d.a(this.f.a(str).subscribe(new ne8(this, str, str2, aVar)));
        }
    }

    @Override // defpackage.qe8
    public void b(String str, s81 s81, String str2) {
        if (c(str, s81)) {
            this.d.a(this.f.a(str).subscribe(new oe8(this, str, str2)));
        }
    }

    public /* synthetic */ void d(String str, String str2, Boolean bool) {
        if (bool.booleanValue()) {
            f(str, str2, Optional.absent());
        }
    }

    public /* synthetic */ void e(String str, String str2, qe8.a aVar, Boolean bool) {
        if (bool.booleanValue()) {
            f(str, str2, Optional.of(aVar));
        }
    }
}
