package com.spotify.music.features.creatorartist;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.k;

public final /* synthetic */ class c implements k {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, com.spotify.android.flags.c cVar, SessionState sessionState) {
        String B = l0Var.B();
        B.getClass();
        int i = BiographyFragment.N0;
        com.spotify.music.libs.viewuri.c b = ViewUris.R0.b(B);
        BiographyFragment biographyFragment = new BiographyFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("artist_uri", b);
        biographyFragment.r4(bundle);
        d.a(biographyFragment.e(), cVar);
        return biographyFragment;
    }
}
