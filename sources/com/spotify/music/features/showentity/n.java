package com.spotify.music.features.showentity;

import android.content.Intent;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.podcast.download.f0;

public final /* synthetic */ class n implements flb {
    public static final /* synthetic */ n a = new n();

    private /* synthetic */ n() {
    }

    @Override // defpackage.flb
    public final elb a(Intent intent, c cVar, SessionState sessionState) {
        l0 z = l0.z(intent.getDataString());
        if (!MoreObjects.isNullOrEmpty(z.a.getQueryParameter("context"))) {
            l0 h = z.h();
            if (h == null) {
                return elb.c(z);
            }
            return elb.c(h);
        } else if (!f0.c(cVar)) {
            return elb.a();
        } else {
            if (z.F() == null) {
                return elb.c(l0.z("spotify:home"));
            }
            String B = z.B();
            B.getClass();
            int i = ShowEntityResolverFragment.p0;
            return elb.d(ShowEntityResolverFragment.L4(B, intent.getBooleanExtra("auto_play", false), intent.getExtras()));
        }
    }
}
