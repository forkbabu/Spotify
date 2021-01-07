package com.spotify.music.features.payfail;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.payfail.BannerModel;
import io.reactivex.functions.l;

public final /* synthetic */ class h implements l {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SpSharedPreferences.b<Object, Long> bVar = y.m;
        return new q(BannerModel.Content.DOWNLOAD, ((Integer) obj).intValue());
    }
}
