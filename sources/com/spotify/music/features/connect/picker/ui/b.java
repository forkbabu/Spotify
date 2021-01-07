package com.spotify.music.features.connect.picker.ui;

import android.view.View;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ DevicePickerActivity a;

    public /* synthetic */ b(DevicePickerActivity devicePickerActivity) {
        this.a = devicePickerActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DevicePickerActivity devicePickerActivity = this.a;
        ((zt0) devicePickerActivity.P.a()).a();
        devicePickerActivity.onBackPressed();
    }
}
