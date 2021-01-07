package com.spotify.music.features.assistedcuration.search;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.y;
import com.spotify.remoteconfig.g5;

public class j extends y {
    private final g5 b;

    j(g5 g5Var) {
        this.b = g5Var;
    }

    @Override // com.spotify.music.navigation.y
    public s a(String str, String str2, SessionState sessionState, boolean z) {
        s sVar = y.a;
        l0 z2 = l0.z(str);
        int ordinal = z2.q().ordinal();
        if (ordinal == 6 || ordinal == 14) {
            sVar = AssistedCurationSearchEntityFragment.K4(str, str2);
        } else if (ordinal == 230 || ordinal == 232) {
            sVar = vd8.a(z2, false, true, sessionState.connected(), sessionState.currentUser(), null, z, false, this.b.a());
        }
        return e.c(str) ? AssistedCurationSearchEntityFragment.K4(str, str2) : sVar;
    }
}
