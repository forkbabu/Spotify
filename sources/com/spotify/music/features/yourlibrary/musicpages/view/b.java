package com.spotify.music.features.yourlibrary.musicpages.view;

import android.view.View;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ da2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ b(da2 da2, String str) {
        this.a = da2;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.accept(s0.t(this.b));
    }
}
