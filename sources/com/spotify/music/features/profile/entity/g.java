package com.spotify.music.features.profile.entity;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.c;
import com.spotify.android.glue.components.toolbar.d;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.http.u;
import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.PlaylistMenuMaker;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.music.follow.m;
import com.spotify.music.libs.web.h;
import com.spotify.music.navigation.t;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.j;
import com.spotify.remoteconfig.AndroidLibsContextMenuPlaylistProperties;
import com.spotify.remoteconfig.s6;
import com.squareup.picasso.Picasso;
import defpackage.ij9;
import defpackage.t8a;
import defpackage.y22;
import io.reactivex.y;

public interface g {
    jz1 A();

    qac a();

    txc b();

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

    boolean q();

    s6 r();

    t8a.a s();

    h t();

    kzc u();

    c v();

    d w();

    ij9.b x();

    Activity y();

    Cosmonaut z();
}
