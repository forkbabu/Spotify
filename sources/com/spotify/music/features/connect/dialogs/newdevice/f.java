package com.spotify.music.features.connect.dialogs.newdevice;

import android.content.Intent;
import android.view.View;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.libs.viewuri.ViewUris;

class f implements View.OnClickListener {
    final /* synthetic */ GaiaDevice a;
    final /* synthetic */ NewDeviceActivity b;

    f(NewDeviceActivity newDeviceActivity, GaiaDevice gaiaDevice) {
        this.b = newDeviceActivity;
        this.a = gaiaDevice;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        NewDeviceActivity newDeviceActivity = this.b;
        String loggingIdentifier = this.a.getLoggingIdentifier();
        newDeviceActivity.N.a("call-to-action", InteractionIntent.LISTEN_NOW, PageIdentifiers.CONNECT_OVERLAY_NEWDEVICE, ViewUris.B1);
        ((et0) ((ct0) newDeviceActivity.O).b()).d(loggingIdentifier);
        NewDeviceActivity.U0(this.b, true);
        NewDeviceActivity newDeviceActivity2 = this.b;
        GaiaDevice gaiaDevice = this.a;
        newDeviceActivity2.getClass();
        Intent intent = new Intent();
        intent.putExtra("device", gaiaDevice);
        newDeviceActivity2.setResult(-1, intent);
        newDeviceActivity2.finish();
    }
}
