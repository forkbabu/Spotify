package com.spotify.music.features.ads.audioplus.overlay.brandads;

import android.view.View;
import com.spotify.music.features.ads.ui.a;

public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ n a;
    public final /* synthetic */ a b;

    public /* synthetic */ i(n nVar, a aVar) {
        this.a = nVar;
        this.b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d(this.b, view);
    }
}
