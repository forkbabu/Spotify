package com.spotify.music.features.search.mobius;

import android.content.Context;
import com.spotify.music.C0707R;

public final class n0 implements fjf<String> {
    private final wlf<Context> a;

    public n0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().getString(C0707R.string.recent_searches_title);
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
