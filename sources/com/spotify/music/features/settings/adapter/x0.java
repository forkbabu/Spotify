package com.spotify.music.features.settings.adapter;

import android.widget.CompoundButton;

public final /* synthetic */ class x0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ Item b;

    public /* synthetic */ x0(p2 p2Var, Item item) {
        this.a = p2Var;
        this.b = item;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.D(this.b, compoundButton, z);
    }
}
