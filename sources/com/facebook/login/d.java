package com.facebook.login;

import android.content.DialogInterface;

class d implements DialogInterface.OnClickListener {
    final /* synthetic */ DeviceAuthDialog a;

    d(DeviceAuthDialog deviceAuthDialog) {
        this.a = deviceAuthDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.C0.setContentView(this.a.m5(false));
        DeviceAuthDialog deviceAuthDialog = this.a;
        deviceAuthDialog.s5(deviceAuthDialog.F0);
    }
}
