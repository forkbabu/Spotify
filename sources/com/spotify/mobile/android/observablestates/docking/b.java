package com.spotify.mobile.android.observablestates.docking;

import io.reactivex.functions.n;

public final /* synthetic */ class b implements n {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((DockingStatus) obj) != DockingStatus.DOCKED;
    }
}
