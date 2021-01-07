package com.spotify.music.features.payfail;

import android.net.Uri;
import java.util.concurrent.Callable;

public final /* synthetic */ class p implements Callable {
    public final /* synthetic */ xa1 a;

    public /* synthetic */ p(xa1 xa1) {
        this.a = xa1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        xa1 xa1 = this.a;
        StringBuilder V0 = je.V0("tinkerbell_paymentfailure_");
        V0.append(xa1.a());
        return Uri.parse("https://www.spotify.com/redirect/generic").buildUpon().appendQueryParameter("redirect_key", "android_paymentfailure").appendQueryParameter("utm_source", "spotify-android-app").appendQueryParameter("utm_medium", "main-banner").appendQueryParameter("utm_campaign", V0.toString()).build();
    }
}
