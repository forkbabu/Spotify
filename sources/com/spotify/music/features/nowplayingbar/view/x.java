package com.spotify.music.features.nowplayingbar.view;

import android.view.View;
import com.spotify.music.features.nowplayingbar.domain.d;

public final /* synthetic */ class x implements View.OnClickListener {
    public final /* synthetic */ da2 a;

    public /* synthetic */ x(da2 da2) {
        this.a = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.accept(d.a.a);
    }
}
