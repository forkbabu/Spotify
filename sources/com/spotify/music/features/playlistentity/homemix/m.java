package com.spotify.music.features.playlistentity.homemix;

import android.content.Context;
import androidx.fragment.app.Fragment;

public final class m implements fjf<l> {
    private final wlf<Context> a;
    private final wlf<Fragment> b;
    private final wlf<String> c;
    private final wlf<kv5> d;

    public m(wlf<Context> wlf, wlf<Fragment> wlf2, wlf<String> wlf3, wlf<kv5> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
