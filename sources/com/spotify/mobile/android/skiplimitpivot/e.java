package com.spotify.mobile.android.skiplimitpivot;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.remoteconfig.ek;
import kotlin.jvm.internal.h;

public final class e implements d {
    private final SkipLimitPlayerListener a;
    private final ek b;

    public e(SkipLimitPlayerListener skipLimitPlayerListener, ek ekVar) {
        h.e(skipLimitPlayerListener, "skipLimitPlayerListener");
        h.e(ekVar, "properties");
        this.a = skipLimitPlayerListener;
        this.b = ekVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (this.b.a()) {
            this.a.b();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        if (this.b.a()) {
            this.a.c();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SkipLimitPlaybackErrorNotifier";
    }
}
