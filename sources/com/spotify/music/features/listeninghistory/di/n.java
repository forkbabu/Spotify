package com.spotify.music.features.listeninghistory.di;

import android.app.Application;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import kotlin.jvm.internal.h;

public final class n implements fjf<m71> {
    private final wlf<Application> a;

    public n(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Application application = this.a.get();
        h.e(application, "application");
        return new m71(application, SpotifyIconV2.TRACK);
    }
}
