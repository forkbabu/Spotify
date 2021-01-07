package com.spotify.music.features.eventshub.artistconcerts;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
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
        B.getClass();
        int i = ArtistConcertsFragment.H0;
        com.spotify.music.libs.viewuri.c b = ViewUris.R0.b(B);
        ArtistConcertsFragment artistConcertsFragment = new ArtistConcertsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("artist_uri", b);
        artistConcertsFragment.r4(bundle);
        return artistConcertsFragment;
    }
}
