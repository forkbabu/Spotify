package com.spotify.music.features.ads.audioplus;

import android.content.Intent;
import androidx.fragment.app.o;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.c;

public class i implements c {
    private final o a;
    private h b;

    public i(o oVar) {
        this.a = oVar;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.c
    public void P0(Intent intent) {
    }

    public h a() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.c
    public void r2(AnchorBar anchorBar) {
        h hVar = new h(anchorBar, this.a);
        this.b = hVar;
        anchorBar.e(hVar);
    }
}
