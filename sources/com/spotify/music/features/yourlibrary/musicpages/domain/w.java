package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.spotify.mobius.e0;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;

public final /* synthetic */ class w implements ti0 {
    public static final /* synthetic */ w a = new w();

    private /* synthetic */ w() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        if (((s0.q) obj).Q()) {
            return e0.h();
        }
        return e0.a(z42.l(new r0.d1(C0707R.string.your_library_music_pages_liked_songs_error_on_play_snackbar)));
    }
}
