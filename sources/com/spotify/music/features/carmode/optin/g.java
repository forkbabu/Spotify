package com.spotify.music.features.carmode.optin;

import android.content.Context;
import androidx.core.content.a;
import com.spotify.music.C0707R;

public final /* synthetic */ class g implements qg0 {
    public final /* synthetic */ SnackbarCoordinatedCarModeOptInButton a;

    public /* synthetic */ g(SnackbarCoordinatedCarModeOptInButton snackbarCoordinatedCarModeOptInButton) {
        this.a = snackbarCoordinatedCarModeOptInButton;
    }

    @Override // defpackage.qg0
    public final void accept(Object obj) {
        SnackbarCoordinatedCarModeOptInButton snackbarCoordinatedCarModeOptInButton = this.a;
        snackbarCoordinatedCarModeOptInButton.getClass();
        snackbarCoordinatedCarModeOptInButton.setImageDrawable(a.d((Context) obj, C0707R.drawable.opt_out_icon));
        snackbarCoordinatedCarModeOptInButton.setVisibility(0);
    }
}
