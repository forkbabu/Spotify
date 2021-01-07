package com.spotify.music.libs.podcast.download;

import androidx.lifecycle.n;
import io.reactivex.y;

public final class x implements fjf<DownloadDialogLifecycleAwareUtil> {
    private final wlf<d0> a;
    private final wlf<a0> b;
    private final wlf<y> c;
    private final wlf<n> d;

    public x(wlf<d0> wlf, wlf<a0> wlf2, wlf<y> wlf3, wlf<n> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DownloadDialogLifecycleAwareUtil(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
