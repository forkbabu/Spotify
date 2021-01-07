package com.spotify.music.features.quicksilver.v2.inappinternalwebview;

import android.net.Uri;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ InAppInternalWebviewFragment a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ a(InAppInternalWebviewFragment inAppInternalWebviewFragment, Uri uri) {
        this.a = inAppInternalWebviewFragment;
        this.b = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k5(this.b);
    }
}
