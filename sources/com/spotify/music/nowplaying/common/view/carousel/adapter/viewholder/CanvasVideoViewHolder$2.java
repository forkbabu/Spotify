package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;

/* access modifiers changed from: package-private */
public class CanvasVideoViewHolder$2 implements m {
    final /* synthetic */ mm2 a;
    final /* synthetic */ f b;

    CanvasVideoViewHolder$2(f fVar, mm2 mm2) {
        this.b = fVar;
        this.a = mm2;
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (this.b.C != null) {
            this.b.C.pause();
        }
        f.u0(this.b);
        this.a.h();
        if (this.b.C != null) {
            this.b.C.d();
        }
        this.b.C = null;
    }

    @w(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        this.b.p();
        if (this.b.C == null) {
            f.J0(this.b);
        }
        this.a.g();
        if (this.b.Q != null) {
            f fVar = this.b;
            fVar.M0(fVar.Q);
        }
        this.b.C.resume();
        f.E0(this.b);
    }
}
