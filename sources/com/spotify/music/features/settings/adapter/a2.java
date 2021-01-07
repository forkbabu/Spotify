package com.spotify.music.features.settings.adapter;

import android.view.View;

public final /* synthetic */ class a2 implements View.OnClickListener {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ Item b;

    public /* synthetic */ a2(p2 p2Var, Item item) {
        this.a = p2Var;
        this.b = item;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.D0(this.b, view);
    }
}
