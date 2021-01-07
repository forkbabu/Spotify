package com.spotify.music.features.connectui.picker.legacy.ui;

import android.view.View;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ DevicePickerFragmentV2 a;

    public /* synthetic */ b(DevicePickerFragmentV2 devicePickerFragmentV2) {
        this.a = devicePickerFragmentV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DevicePickerFragmentV2 devicePickerFragmentV2 = this.a;
        ((zt0) devicePickerFragmentV2.p0.a()).a();
        if (devicePickerFragmentV2.r0.a()) {
            devicePickerFragmentV2.n0.c();
        } else {
            devicePickerFragmentV2.y();
        }
    }
}
