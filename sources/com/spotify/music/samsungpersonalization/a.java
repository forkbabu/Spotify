package com.spotify.music.samsungpersonalization;

import android.content.Context;
import androidx.lifecycle.n;
import com.spotify.music.samsungpersonalization.customization.c;
import com.spotify.music.samsungpersonalization.customization.d;

public final class a implements fjf<SamsungPersonalizationSettingsHandler> {
    private final wlf<Context> a;
    private final wlf<d> b;
    private final wlf<b> c;
    private final wlf<c> d;
    private final wlf<n> e;

    public a(wlf<Context> wlf, wlf<d> wlf2, wlf<b> wlf3, wlf<c> wlf4, wlf<n> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SamsungPersonalizationSettingsHandler(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
