package com.spotify.music.features.settings.adapter;

import android.widget.CompoundButton;

public final /* synthetic */ class u0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ p2 a;

    public /* synthetic */ u0(p2 p2Var) {
        this.a = p2Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.X(compoundButton, z);
    }
}
