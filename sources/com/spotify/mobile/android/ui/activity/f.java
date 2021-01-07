package com.spotify.mobile.android.ui.activity;

import android.content.DialogInterface;
import androidx.core.app.a;

class f implements DialogInterface.OnDismissListener {
    final /* synthetic */ String[] a;
    final /* synthetic */ PermissionsRequestActivity b;

    f(PermissionsRequestActivity permissionsRequestActivity, String[] strArr) {
        this.b = permissionsRequestActivity;
        this.a = strArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (PermissionsRequestActivity.a(this.b)) {
            PermissionsRequestActivity permissionsRequestActivity = this.b;
            String[] strArr = this.a;
            permissionsRequestActivity.getClass();
            a.i(permissionsRequestActivity, strArr, 49374);
        }
    }
}
