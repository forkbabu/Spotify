package com.spotify.music.nowplaying.videoads.widget.view;

import android.widget.ProgressBar;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.g0;

public class c {
    private final ProgressBar a;
    private final g0<ProgressBar> b;

    public c(ProgressBar progressBar) {
        this.a = progressBar;
        this.b = new g0<>(progressBar, Optional.absent());
    }

    public void a(long j) {
        this.a.setMax((int) j);
    }

    public void b(long j, long j2, float f) {
        this.b.g(j, j2, f);
    }
}
