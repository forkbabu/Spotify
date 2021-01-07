package com.spotify.music.features.eventshub.concertentity;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.k;

public final /* synthetic */ class b implements k {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        String B = l0Var.B();
        String i = l0Var.i();
        int i2 = ConcertEntityFragment.T0;
        com.spotify.music.libs.viewuri.c b = ViewUris.l0.b(B);
        ConcertEntityFragment concertEntityFragment = new ConcertEntityFragment();
        d.a(concertEntityFragment, cVar);
        Bundle D2 = concertEntityFragment.D2();
        D2.putParcelable("concert_uri", b);
        D2.putString("concert_id", i);
        return concertEntityFragment;
    }
}
