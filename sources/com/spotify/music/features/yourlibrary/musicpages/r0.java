package com.spotify.music.features.yourlibrary.musicpages;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.l0;

public final /* synthetic */ class r0 implements flb {
    public static final /* synthetic */ r0 a = new r0();

    private /* synthetic */ r0() {
    }

    @Override // defpackage.flb
    public final elb a(Intent intent, c cVar, SessionState sessionState) {
        l0 z = l0.z(intent.getDataString());
        String currentUser = sessionState.currentUser();
        String B = z.B();
        B.getClass();
        return elb.d(MusicPagesDrillDownFragment.K4(cVar, currentUser, B, intent.getStringExtra("title")));
    }
}
