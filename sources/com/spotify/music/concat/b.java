package com.spotify.music.concat;

import android.view.View;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ g a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ b(g gVar, da2 da2) {
        this.a = gVar;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d(this.b, view);
    }
}
