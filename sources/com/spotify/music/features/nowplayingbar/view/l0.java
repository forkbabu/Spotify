package com.spotify.music.features.nowplayingbar.view;

import android.view.View;
import com.spotify.music.features.nowplayingbar.domain.d;

public final /* synthetic */ class l0 implements View.OnClickListener {
    public final /* synthetic */ da2 a;

    public /* synthetic */ l0(da2 da2) {
        this.a = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.accept(d.e.a);
    }
}
