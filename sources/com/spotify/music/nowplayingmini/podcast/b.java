package com.spotify.music.nowplayingmini.podcast;

import androidx.fragment.app.Fragment;
import com.spotify.android.flags.c;
import io.reactivex.g;
import io.reactivex.z;

public final class b implements fjf<z<Fragment>> {
    private final wlf<g<c>> a;

    public b(wlf<g<c>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().E().A(a.a);
    }
}
