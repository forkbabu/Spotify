package com.spotify.music.yourlibrary.filterchips;

import android.widget.CompoundButton;

public final /* synthetic */ class b implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ n a;

    public /* synthetic */ b(n nVar) {
        this.a = nVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.d(compoundButton, z);
    }
}
