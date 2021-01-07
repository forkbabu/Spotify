package com.spotify.music.nowplayingmini.def;

import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        DefaultModeFragment defaultModeFragment = new DefaultModeFragment();
        d.a(defaultModeFragment, (c) obj);
        return defaultModeFragment;
    }
}
