package com.spotify.music.features.ads;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ c(Activity activity, Uri uri) {
        this.a = activity;
        this.b = uri;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.a.startActivity(new Intent("android.intent.action.VIEW", this.b));
    }
}
