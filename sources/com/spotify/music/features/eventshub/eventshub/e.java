package com.spotify.music.features.eventshub.eventshub;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;

public final /* synthetic */ class e implements k {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        EventsHubFragment eventsHubFragment = new EventsHubFragment();
        d.a(eventsHubFragment, cVar);
        return eventsHubFragment;
    }
}
