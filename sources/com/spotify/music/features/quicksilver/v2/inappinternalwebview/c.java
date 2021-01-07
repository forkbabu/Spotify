package com.spotify.music.features.quicksilver.v2.inappinternalwebview;

import android.net.Uri;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ InAppInternalWebviewFragment a;

    public /* synthetic */ c(InAppInternalWebviewFragment inAppInternalWebviewFragment) {
        this.a = inAppInternalWebviewFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        InAppInternalWebviewFragment inAppInternalWebviewFragment = this.a;
        Uri uri = (Uri) obj;
        if (inAppInternalWebviewFragment.B2() != null) {
            inAppInternalWebviewFragment.B2().runOnUiThread(new a(inAppInternalWebviewFragment, uri));
        }
    }
}
