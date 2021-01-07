package com.spotify.music.features.notificationsettings.channeldetails;

import android.widget.CompoundButton;
import kotlin.jvm.internal.h;

public final class a implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ rmf a;

    public a(rmf rmf) {
        this.a = rmf;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final /* synthetic */ void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        h.d(this.a.invoke(compoundButton, Boolean.valueOf(z)), "invoke(...)");
    }
}
