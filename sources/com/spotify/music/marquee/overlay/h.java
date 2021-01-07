package com.spotify.music.marquee.overlay;

import android.view.View;

public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ MarqueeOverlayFragment a;

    public /* synthetic */ h(MarqueeOverlayFragment marqueeOverlayFragment) {
        this.a = marqueeOverlayFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.u0.m();
    }
}
