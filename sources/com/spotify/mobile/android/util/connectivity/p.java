package com.spotify.mobile.android.util.connectivity;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import io.reactivex.s;
import java.util.concurrent.Callable;

public final /* synthetic */ class p implements Callable {
    public final /* synthetic */ Context a;

    public /* synthetic */ p(Context context) {
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri uri;
        Context context = this.a;
        Handler handler = new Handler(Looper.getMainLooper());
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT >= 17) {
            uri = Settings.Global.getUriFor("mobile_data");
        } else {
            uri = Settings.Secure.getUriFor("mobile_data");
        }
        return s.y(new n(handler, context, contentResolver, uri));
    }
}
