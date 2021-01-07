package com.spotify.libs.onboarding.allboarding.picker;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.h;

final class l implements AppBarLayout.c {
    final /* synthetic */ PickerFragment a;

    l(PickerFragment pickerFragment) {
        this.a = pickerFragment;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        h.e(appBarLayout, "appBarLayout1");
        PickerFragment.M4(this.a).setAlpha(Math.abs(((float) i) / ((float) appBarLayout.getTotalScrollRange())));
    }
}
