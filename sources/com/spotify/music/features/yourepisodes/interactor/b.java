package com.spotify.music.features.yourepisodes.interactor;

import androidx.lifecycle.n;

public final class b implements fjf<DownloadInteractorImpl> {
    private final wlf<n> a;
    private final wlf<ih0> b;

    public b(wlf<n> wlf, wlf<ih0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DownloadInteractorImpl(this.a.get(), this.b.get());
    }
}
