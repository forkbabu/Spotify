package com.spotify.music.playlist.extender;

import android.view.View;

public final /* synthetic */ class l implements View.OnClickListener {
    public final /* synthetic */ d0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ l(d0 d0Var, int i) {
        this.a = d0Var;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.W(this.b, view);
    }
}
