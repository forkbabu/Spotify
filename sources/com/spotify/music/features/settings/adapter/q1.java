package com.spotify.music.features.settings.adapter;

import android.widget.CompoundButton;

public final /* synthetic */ class q1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ p2 a;

    public /* synthetic */ q1(p2 p2Var) {
        this.a = p2Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.V(compoundButton, z);
    }
}
