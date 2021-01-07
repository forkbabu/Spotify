package com.spotify.mobile.android.service;

import com.spotify.mobile.android.video.v;

public final /* synthetic */ class h implements v.c {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ h(Runnable runnable) {
        this.a = runnable;
    }

    @Override // com.spotify.mobile.android.video.v.c
    public final void a() {
        this.a.run();
    }
}
