package com.spotify.music.features.eventshub.locationsearch;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;

public final /* synthetic */ class d implements k {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        LocationSearchFragment locationSearchFragment = new LocationSearchFragment();
        com.spotify.android.flags.d.a(locationSearchFragment, cVar);
        return locationSearchFragment;
    }
}
