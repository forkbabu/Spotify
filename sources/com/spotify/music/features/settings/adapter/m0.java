package com.spotify.music.features.settings.adapter;

import android.view.View;
import android.view.ViewGroup;

public final /* synthetic */ class m0 implements View.OnClickListener {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ Item c;

    public /* synthetic */ m0(p2 p2Var, ViewGroup viewGroup, Item item) {
        this.a = p2Var;
        this.b = viewGroup;
        this.c = item;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.R(this.b, this.c, view);
    }
}
