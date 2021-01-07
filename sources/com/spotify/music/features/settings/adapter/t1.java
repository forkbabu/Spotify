package com.spotify.music.features.settings.adapter;

import android.content.Intent;
import android.view.View;

public final /* synthetic */ class t1 implements View.OnClickListener {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ Item b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ t1(p2 p2Var, Item item, Intent intent) {
        this.a = p2Var;
        this.b = item;
        this.c = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.u(this.b, this.c, view);
    }
}
