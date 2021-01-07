package com.spotify.music.features.freetierartist;

import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.ViewUris;

public class j implements mfa {
    @Override // defpackage.mfa
    public s a(String str, c cVar, boolean z) {
        return ArtistFragment.K4(str, cVar, z);
    }

    @Override // defpackage.mfa
    public s b(String str, Bundle bundle, c cVar) {
        com.spotify.music.libs.viewuri.c b = ViewUris.R0.b(str);
        ArtistConcertFragment artistConcertFragment = new ArtistConcertFragment();
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putParcelable("artist_uri", b);
        artistConcertFragment.e().r4(bundle2);
        d.a(artistConcertFragment.e(), cVar);
        return artistConcertFragment;
    }
}
