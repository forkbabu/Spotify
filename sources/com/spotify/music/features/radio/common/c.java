package com.spotify.music.features.radio.common;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.radio.fragments.AbstractStationFragment;
import com.spotify.music.features.radio.fragments.StationFragment;
import com.spotify.music.libs.viewuri.ViewUris;

public final /* synthetic */ class c implements flb {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // defpackage.flb
    public final elb a(Intent intent, com.spotify.android.flags.c cVar, SessionState sessionState) {
        String B = l0.z(intent.getDataString()).B();
        B.getClass();
        String stringExtra = intent.getStringExtra("title");
        if (cVar != null && !((Boolean) cVar.M0(em9.c)).booleanValue()) {
            return elb.a();
        }
        cVar.getClass();
        String currentUser = sessionState.currentUser();
        int i = AbstractStationFragment.V0;
        com.spotify.music.libs.viewuri.c b = ViewUris.r0.b(B);
        Bundle bundle = new Bundle();
        bundle.putParcelable("StationFragment.station_uri", b);
        bundle.putString("StationFragment.station_title", stringExtra);
        bundle.putLong("StationFragment.station_random", System.currentTimeMillis());
        bundle.putString("username", currentUser);
        StationFragment stationFragment = new StationFragment();
        stationFragment.r4(bundle);
        d.a(stationFragment, cVar);
        return elb.d(stationFragment);
    }
}
