package com.spotify.effortlesslogin;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import defpackage.ce0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.je0;

public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ EffortlessLoginBottomSheetDialog a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(EffortlessLoginBottomSheetDialog effortlessLoginBottomSheetDialog, String str) {
        this.a = effortlessLoginBottomSheetDialog;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EffortlessLoginBottomSheetDialog effortlessLoginBottomSheetDialog = this.a;
        String str = this.b;
        effortlessLoginBottomSheetDialog.v0.a(new ce0.c(je0.k.b, fe0.u.b, ge0.k.b));
        Context l4 = effortlessLoginBottomSheetDialog.l4();
        boolean z = effortlessLoginBottomSheetDialog.w0;
        int i = EffortlessLoginActivity.H;
        Intent y = je.y(l4, EffortlessLoginActivity.class, "username", str);
        y.putExtra("login_using_samsung_sign_in", z);
        effortlessLoginBottomSheetDialog.H4(y, 11533, null);
    }
}
