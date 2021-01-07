package com.spotify.music.features.ads.audioplus.overlay.brandads;

import android.view.View;
import com.spotify.music.features.ads.ui.a;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ l a;
    public final /* synthetic */ a b;

    public /* synthetic */ d(l lVar, a aVar) {
        this.a = lVar;
        this.b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.f(this.b, view);
    }
}
