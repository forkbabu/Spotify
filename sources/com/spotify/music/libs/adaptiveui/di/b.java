package com.spotify.music.libs.adaptiveui.di;

import android.content.Context;
import com.spotify.mobile.android.util.x;
import com.spotify.remoteconfig.AndroidLibsAdaptiveUiProperties;

public final class b implements fjf<Boolean> {
    private final wlf<AndroidLibsAdaptiveUiProperties> a;
    private final wlf<Context> b;

    public b(wlf<AndroidLibsAdaptiveUiProperties> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static boolean a(AndroidLibsAdaptiveUiProperties androidLibsAdaptiveUiProperties, Context context) {
        int ordinal = androidLibsAdaptiveUiProperties.a().ordinal();
        if (ordinal != 1) {
            return ordinal == 2;
        }
        return x.g(context);
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(a(this.a.get(), this.b.get()));
    }
}
