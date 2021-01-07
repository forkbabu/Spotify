package com.spotify.mobile.android.ui.activity;

import android.content.DialogInterface;
import androidx.core.app.a;

class g implements DialogInterface.OnClickListener {
    final /* synthetic */ String[] a;
    final /* synthetic */ PermissionsRequestActivity b;

    g(PermissionsRequestActivity permissionsRequestActivity, String[] strArr) {
        this.b = permissionsRequestActivity;
        this.a = strArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        PermissionsRequestActivity permissionsRequestActivity = this.b;
        String[] strArr = this.a;
        int i2 = PermissionsRequestActivity.f;
        permissionsRequestActivity.getClass();
        a.i(permissionsRequestActivity, strArr, 49374);
        PermissionsRequestActivity.b(this.b, false);
        dialogInterface.dismiss();
    }
}
