package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;

/* access modifiers changed from: package-private */
public final class CanvasImageViewHolder$2 implements m {
    final /* synthetic */ mm2 a;

    CanvasImageViewHolder$2(mm2 mm2) {
        this.a = mm2;
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        this.a.h();
    }

    @w(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        this.a.g();
    }
}
