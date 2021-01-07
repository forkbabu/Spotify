package com.spotify.magiclink;

import android.content.Intent;
import android.view.View;

public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ TooManyAttemptsBottomSheetDialog a;

    public /* synthetic */ k(TooManyAttemptsBottomSheetDialog tooManyAttemptsBottomSheetDialog) {
        this.a = tooManyAttemptsBottomSheetDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TooManyAttemptsBottomSheetDialog tooManyAttemptsBottomSheetDialog = this.a;
        Intent a2 = n.a(tooManyAttemptsBottomSheetDialog.l4());
        if (a2 != null) {
            tooManyAttemptsBottomSheetDialog.G4(a2, null);
        }
        tooManyAttemptsBottomSheetDialog.M4();
    }
}
