package com.spotify.music.features.settings.adapter;

import android.view.View;

public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ Item b;

    public /* synthetic */ n(p2 p2Var, Item item) {
        this.a = p2Var;
        this.b = item;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.j0(this.b, view);
    }
}
