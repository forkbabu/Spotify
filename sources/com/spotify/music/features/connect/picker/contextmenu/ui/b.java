package com.spotify.music.features.connect.picker.contextmenu.ui;

import android.view.View;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.libs.viewuri.ViewUris;

class b implements View.OnClickListener {
    final /* synthetic */ GaiaDevice a;
    final /* synthetic */ DeviceContextMenuActivity b;

    b(DeviceContextMenuActivity deviceContextMenuActivity, GaiaDevice gaiaDevice) {
        this.b = deviceContextMenuActivity;
        this.a = gaiaDevice;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.b.K.a(je.B0(je.V0("connect-context-menu/"), DeviceContextMenuActivity.X0(), "/item/"), InteractionIntent.FORGET_DEVICE, PageIdentifiers.CONNECT_CONTEXTMENU, ViewUris.A1);
        ((zt0) this.b.O.a()).b(this.a.getLoggingIdentifier(), DeviceContextMenuActivity.X0());
        this.b.I.b(this.a.getCosmosIdentifier());
        this.b.finish();
    }
}
