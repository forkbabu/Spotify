package com.spotify.music.features.connect.picker.contextmenu.ui;

import android.view.View;
import com.spotify.libs.connect.model.GaiaDeviceIncarnation;

class c implements View.OnClickListener {
    final /* synthetic */ GaiaDeviceIncarnation a;
    final /* synthetic */ DeviceContextMenuActivity b;

    c(DeviceContextMenuActivity deviceContextMenuActivity, GaiaDeviceIncarnation gaiaDeviceIncarnation) {
        this.b = deviceContextMenuActivity;
        this.a = gaiaDeviceIncarnation;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = e90.i;
        DeviceContextMenuActivity.V0(this.b, (p90) l70.o(view, p90.class));
        DeviceContextMenuActivity.W0(this.b, this.a);
    }
}
