package defpackage;

import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.b3;
import com.spotify.mobile.android.service.media.h2;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.genie.p;
import com.spotify.music.libs.external_integration.instrumentation.d;
import com.spotify.music.libs.mediabrowserservice.a2;
import com.spotify.music.libs.mediabrowserservice.s1;
import com.spotify.music.libs.mediasession.e0;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.d0;

/* renamed from: cq5  reason: default package */
public class cq5 extends a2 {
    private final PlayOrigin q;

    public cq5(v1 v1Var, PlayOrigin playOrigin, cqe cqe, d dVar, pea pea, e0 e0Var, p pVar, b3 b3Var, com.spotify.music.libs.mediabrowserservice.v1 v1Var2) {
        super(v1Var, playOrigin, cqe, dVar, pea, e0Var, pVar, b3Var, v1Var2);
        this.q = playOrigin;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.a2, android.support.v4.media.session.MediaSessionCompat.a
    public void g(String str, Bundle bundle) {
        if (a2.y(bundle)) {
            this.f.A3().h();
        }
        String d = s1.d(str);
        String string = bundle.getString("com.spotify.music.extra.CONTEXT_URI");
        if (string != null) {
            d = string;
        }
        this.p.b(this.l.n(t(), d, null).A(wp5.a).s(new xp5(this, bundle, d)).subscribe());
    }

    public d0 z(Bundle bundle, String str, LoggingParams loggingParams) {
        h2 h2Var;
        if (bundle.getBoolean("com.spotify.music.extra.IS_SHARED_ON_DEMAND_TRACK", false)) {
            h2.a c = h2.c(str);
            c.e(ImmutableMap.of(PlayerTrack.Metadata.MFT_UNPLAYABLE_POLICY, "remove"));
            c.g(PreparePlayOptions.builder().suppressions(ImmutableSet.of("mft/inject_random_tracks")).build());
            c.f(this.q.toBuilder().featureClasses(ImmutableSet.of("social_play")).build());
            c.d(loggingParams);
            h2Var = c.b();
        } else {
            h2.a c2 = h2.c(str);
            c2.g(tl1.a(str, bundle));
            c2.f(this.q);
            c2.d(loggingParams);
            h2Var = c2.b();
        }
        return this.f.Z2().p(h2Var);
    }
}
