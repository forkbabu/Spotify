package com.spotify.music.features.freetierartist;

import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;

public final /* synthetic */ class b implements k {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        int i = ArtistReleasesFragment.m0;
        MoreObjects.checkArgument(l0Var.q() == LinkType.ARTIST_RELEASES, "SpotifyLink needs to be of link type Artists releases");
        ArtistReleasesFragment artistReleasesFragment = new ArtistReleasesFragment();
        Bundle bundle = new Bundle();
        bundle.putString("view_uri", l0Var.B());
        bundle.putString("title", str);
        artistReleasesFragment.r4(bundle);
        d.a(artistReleasesFragment, cVar);
        return artistReleasesFragment;
    }
}
