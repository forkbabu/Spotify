package com.spotify.music.features.podcast.entity.di;

import com.spotify.music.C0707R;
import com.spotify.pageloader.s0;

/* access modifiers changed from: package-private */
public final class m0<T> implements tg0<s0> {
    public static final m0 a = new m0();

    m0() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.tg0
    public s0 get() {
        return fbc.b(C0707R.string.show_not_found_error_title, C0707R.string.show_not_found_error_body);
    }
}
