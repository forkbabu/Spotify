package com.spotify.music.features.showentity;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.podcast.download.f0;

public final /* synthetic */ class m implements flb {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // defpackage.flb
    public final elb a(Intent intent, c cVar, SessionState sessionState) {
        l0 z = l0.z(intent.getDataString());
        if (!f0.c(cVar)) {
            return elb.a();
        }
        String F = z.F();
        if (F == null) {
            return elb.c(l0.z("spotify:home"));
        }
        return elb.d(ShowEntityResolverFragment.L4(F, true, intent.getExtras()));
    }
}
