package com.spotify.music.yourlibrary.filterchips;

import android.widget.CompoundButton;

public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ m a;
    public final /* synthetic */ int b;

    public /* synthetic */ a(m mVar, int i) {
        this.a = mVar;
        this.b = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.b(this.b, compoundButton, z);
    }
}
