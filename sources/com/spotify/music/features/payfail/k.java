package com.spotify.music.features.payfail;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.payfail.BannerModel;
import io.reactivex.functions.l;

public final /* synthetic */ class k implements l {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        SpSharedPreferences.b<Object, Long> bVar = y.m;
        return new q(BannerModel.Content.DOWNLOAD, 0);
    }
}
