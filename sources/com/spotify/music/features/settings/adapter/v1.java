package com.spotify.music.features.settings.adapter;

import android.view.View;

public final /* synthetic */ class v1 implements View.OnClickListener {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ Item b;
    public final /* synthetic */ View.OnClickListener c;

    public /* synthetic */ v1(p2 p2Var, Item item, View.OnClickListener onClickListener) {
        this.a = p2Var;
        this.b = item;
        this.c = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.F0(this.b, this.c, view);
    }
}
