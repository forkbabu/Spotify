package com.spotify.music.features.eventshub.concertslist;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;

public final /* synthetic */ class a implements k {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        ConcertsListFragment concertsListFragment = new ConcertsListFragment();
        d.a(concertsListFragment, cVar);
        if (intent.hasExtra("event-result-arg")) {
            Bundle D2 = concertsListFragment.e().D2();
            if (D2 == null) {
                D2 = new Bundle();
                concertsListFragment.e().r4(D2);
            }
            Bundle extras = intent.getExtras();
            extras.getClass();
            D2.putAll(extras);
        }
        return concertsListFragment;
    }
}
