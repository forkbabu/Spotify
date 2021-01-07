package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.b3;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.genie.p;
import com.spotify.music.libs.external_integration.instrumentation.d;
import com.spotify.music.libs.mediabrowserservice.a2;
import com.spotify.music.libs.mediasession.e0;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.d0;

/* renamed from: nx8  reason: default package */
public class nx8 extends a2 {
    private final iy8 q;
    private final zx8 r;

    public nx8(v1 v1Var, PlayOrigin playOrigin, zx8 zx8, iy8 iy8, cqe cqe, d dVar, pea pea, e0 e0Var, p pVar, b3 b3Var, com.spotify.music.libs.mediabrowserservice.v1 v1Var2) {
        super(v1Var, playOrigin, cqe, dVar, pea, e0Var, pVar, b3Var, v1Var2);
        this.q = iy8;
        this.r = zx8;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void i(Uri uri, Bundle bundle) {
        Logger.l("MediaSessionCallbackHandler.onPlayFromUri uri=%s", uri);
        this.f.A3().h();
        this.q.q(vx8.a(uri, bundle), t());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void j(Uri uri, Bundle bundle) {
        Logger.l("MediaSessionCallbackHandler.onPrepareFromUri uri=%s", uri);
        this.f.A3().h();
        this.q.r(vx8.a(uri, bundle), t());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void l(RatingCompat ratingCompat) {
        Logger.b("Received rating: %s", Boolean.valueOf(ratingCompat.b()));
        this.r.b(ratingCompat, t());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void n(int i) {
        Logger.l("MediaSessionCallbackHandler.onSetShuffleMode %d", Integer.valueOf(i));
        yda t = t();
        if (i == 1) {
            this.q.j(t);
        } else {
            this.q.h(t);
        }
    }

    @Override // com.spotify.music.libs.mediabrowserservice.a2, android.support.v4.media.session.MediaSessionCompat.a
    public void p() {
        Logger.l("MediaSessionCallback.onSkipToPrevious", new Object[0]);
        this.p.b(this.l.f(t()).A(sw8.a).s(new rw8(this)).subscribe());
    }

    @Override // com.spotify.music.libs.mediabrowserservice.a2
    public void u() {
        super.u();
        this.q.i();
    }

    public /* synthetic */ d0 z(LoggingParams loggingParams) {
        return this.f.Z2().k(Optional.of(loggingParams), false);
    }
}
