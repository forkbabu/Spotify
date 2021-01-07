package com.spotify.mobile.android.hubframework.defaults;

import android.content.res.Resources;
import com.spotify.music.C0707R;

public final class r implements fjf<Integer> {
    private final wlf<Resources> a;
    private final wlf<Boolean> b;

    public r(wlf<Resources> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        int i;
        Resources resources = this.a.get();
        if (this.b.get().booleanValue()) {
            i = resources.getInteger(C0707R.integer.adaptive_ui_hugs_grid_columns);
        } else {
            i = resources.getInteger(C0707R.integer.hugs_grid_columns);
        }
        return Integer.valueOf(i);
    }
}
