package com.spotify.music.features.podcast.entity;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.spotlets.scannables.c;

public class l {
    private final c a;

    public l(c cVar) {
        this.a = cVar;
    }

    public void a(a0 a0Var, q67 q67) {
        a0Var.a(this.a.a(q67.c(), q67.f(), true), SpotifyIconV2.PODCASTS, false, true);
        a0Var.h(q67.g());
        a0Var.i(q67.e());
    }
}
