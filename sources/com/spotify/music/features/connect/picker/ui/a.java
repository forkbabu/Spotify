package com.spotify.music.features.connect.picker.ui;

import android.view.View;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ DevicePickerActivity a;

    public /* synthetic */ a(DevicePickerActivity devicePickerActivity) {
        this.a = devicePickerActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DevicePickerActivity devicePickerActivity = this.a;
        ((zt0) devicePickerActivity.P.a()).j("https://www.spotify.com/connect/?utm_source=spotify&utm_medium=android_app&utm_campaign=connect_devicemenu_helpicon");
        devicePickerActivity.L.b(devicePickerActivity);
    }
}
