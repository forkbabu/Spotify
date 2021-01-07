package com.spotify.music.features.connectui.picker.legacy.ui;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.music.features.connectui.picker.contextmenu.DeviceContextMenuFragment;

public final /* synthetic */ class c implements DeviceContextMenuFragment.a {
    public final /* synthetic */ DevicePickerFragmentV2 a;

    public /* synthetic */ c(DevicePickerFragmentV2 devicePickerFragmentV2) {
        this.a = devicePickerFragmentV2;
    }

    public final void a(int i) {
        this.a.q0.b(SnackbarConfiguration.builder(i).build(), 300);
    }
}
