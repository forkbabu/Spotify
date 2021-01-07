package com.spotify.effortlesslogin;

import android.view.View;
import defpackage.ce0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.je0;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ EffortlessLoginBottomSheetDialog a;

    public /* synthetic */ d(EffortlessLoginBottomSheetDialog effortlessLoginBottomSheetDialog) {
        this.a = effortlessLoginBottomSheetDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EffortlessLoginBottomSheetDialog effortlessLoginBottomSheetDialog = this.a;
        effortlessLoginBottomSheetDialog.v0.a(new ce0.c(je0.k.b, fe0.t.b, ge0.k.b));
        effortlessLoginBottomSheetDialog.M4();
    }
}
