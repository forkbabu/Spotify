package com.spotify.music.features.quicksilver.v2.inappinternalwebview;

import android.view.View;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ InAppInternalWebviewFragment a;

    public /* synthetic */ b(InAppInternalWebviewFragment inAppInternalWebviewFragment) {
        this.a = inAppInternalWebviewFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.B2().finish();
    }
}
