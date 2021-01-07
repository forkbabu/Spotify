package com.spotify.music.features.nowplayingbar.view;

import android.view.View;
import com.spotify.music.features.nowplayingbar.domain.d;

public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ da2 a;

    public /* synthetic */ q(da2 da2) {
        this.a = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.accept(new d.g(null));
    }
}
