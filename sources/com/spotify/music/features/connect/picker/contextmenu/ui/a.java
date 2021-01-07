package com.spotify.music.features.connect.picker.contextmenu.ui;

import android.view.View;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.GaiaDeviceIncarnation;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ DeviceContextMenuActivity a;
    public final /* synthetic */ GaiaDevice b;
    public final /* synthetic */ GaiaDeviceIncarnation c;

    public /* synthetic */ a(DeviceContextMenuActivity deviceContextMenuActivity, GaiaDevice gaiaDevice, GaiaDeviceIncarnation gaiaDeviceIncarnation) {
        this.a = deviceContextMenuActivity;
        this.b = gaiaDevice;
        this.c = gaiaDeviceIncarnation;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c1(this.b, this.c, view);
    }
}
