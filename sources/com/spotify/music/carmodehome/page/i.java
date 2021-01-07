package com.spotify.music.carmodehome.page;

import androidx.lifecycle.n;

public final class i implements fjf<DisposableItemPresenterLifecycleObserver> {
    private final wlf<n> a;

    public i(wlf<n> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DisposableItemPresenterLifecycleObserver(this.a.get());
    }
}
