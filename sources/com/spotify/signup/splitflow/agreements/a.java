package com.spotify.signup.splitflow.agreements;

import android.widget.CompoundButton;
import kotlin.jvm.internal.h;

final class a implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ rmf a;

    a(rmf rmf) {
        this.a = rmf;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final /* synthetic */ void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        h.d(this.a.invoke(compoundButton, Boolean.valueOf(z)), "invoke(...)");
    }
}
