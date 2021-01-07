package com.spotify.music.features.yourlibrary.musicpages;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;

public final /* synthetic */ class q0 implements k {
    public static final /* synthetic */ q0 a = new q0();

    private /* synthetic */ q0() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        String currentUser = sessionState.currentUser();
        String B = l0Var.B();
        B.getClass();
        return MusicPagesDrillDownFragment.K4(cVar, currentUser, B, str);
    }
}
