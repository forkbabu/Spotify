package com.spotify.music.features.ads;

import android.net.Uri;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Uri uri = (Uri) obj;
        return Boolean.valueOf(uri != null && "www.spotify.com".equalsIgnoreCase(uri.getHost()));
    }
}
