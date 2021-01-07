package com.spotify.music.mainactivity;

import com.spotify.android.glue.components.toolbar.d;
import com.spotify.android.glue.patterns.prettylist.u;

public final class s implements fjf<u> {
    private final wlf<d> a;

    public s(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        u R = this.a.get().R();
        yif.g(R, "Cannot return null from a non-@Nullable @Provides method");
        return R;
    }
}
