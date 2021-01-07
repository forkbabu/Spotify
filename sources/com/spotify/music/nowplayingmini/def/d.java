package com.spotify.music.nowplayingmini.def;

import androidx.fragment.app.Fragment;
import com.spotify.android.flags.c;
import io.reactivex.g;
import io.reactivex.z;

public final class d implements fjf<z<Fragment>> {
    private final wlf<g<c>> a;

    public d(wlf<g<c>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().E().A(b.a);
    }
}
