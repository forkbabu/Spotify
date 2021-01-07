package com.spotify.music.features.settings.adapter;

import android.widget.CompoundButton;

public final /* synthetic */ class j1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ Item b;

    public /* synthetic */ j1(p2 p2Var, Item item) {
        this.a = p2Var;
        this.b = item;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.i0(this.b, compoundButton, z);
    }
}
