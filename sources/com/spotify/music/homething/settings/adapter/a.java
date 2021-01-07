package com.spotify.music.homething.settings.adapter;

import android.widget.CompoundButton;

public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ HomethingSettingsAdapter a;
    public final /* synthetic */ ft9 b;

    public /* synthetic */ a(HomethingSettingsAdapter homethingSettingsAdapter, ft9 ft9) {
        this.a = homethingSettingsAdapter;
        this.b = ft9;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.Z(this.b, compoundButton, z);
    }
}
