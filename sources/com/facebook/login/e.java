package com.facebook.login;

import android.content.DialogInterface;
import com.facebook.internal.f0;
import java.util.Date;

class e implements DialogInterface.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ f0.d b;
    final /* synthetic */ String c;
    final /* synthetic */ Date f;
    final /* synthetic */ Date n;
    final /* synthetic */ DeviceAuthDialog o;

    e(DeviceAuthDialog deviceAuthDialog, String str, f0.d dVar, String str2, Date date, Date date2) {
        this.o = deviceAuthDialog;
        this.a = str;
        this.b = dVar;
        this.c = str2;
        this.f = date;
        this.n = date2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        DeviceAuthDialog.l5(this.o, this.a, this.b, this.c, this.f, this.n);
    }
}
