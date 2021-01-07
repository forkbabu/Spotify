package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.spotify.mobius.e0;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;

public final /* synthetic */ class d0 implements ti0 {
    public static final /* synthetic */ d0 a = new d0();

    private /* synthetic */ d0() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        if (((s0.r) obj).Q()) {
            return e0.h();
        }
        return e0.a(z42.l(new r0.d1(C0707R.string.your_library_music_pages_liked_songs_error_on_play_snackbar)));
    }
}
