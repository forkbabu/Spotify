package com.spotify.music.features.profile.profilelist;

import android.content.Context;
import com.spotify.http.u;
import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.PlaylistMenuMaker;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.music.follow.m;
import com.spotify.music.navigation.t;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.j;
import com.spotify.remoteconfig.AndroidLibsContextMenuPlaylistProperties;
import com.squareup.picasso.Picasso;
import defpackage.y22;
import io.reactivex.y;

public interface h {
    qac a();

    Picasso c();

    u d();

    PlaylistMenuMaker.a e();

    m f();

    y g();

    ere h();

    y i();

    z3<b> j();

    t k();

    y l();

    Context m();

    AndroidLibsContextMenuPlaylistProperties n();

    z3<j> o();

    y22.a p();
}
