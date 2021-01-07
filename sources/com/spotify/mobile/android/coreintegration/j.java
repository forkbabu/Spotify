package com.spotify.mobile.android.coreintegration;

import io.reactivex.functions.l;

public final /* synthetic */ class j implements l {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        BackgroundFeaturesStatus backgroundFeaturesStatus = (BackgroundFeaturesStatus) obj;
        int i = t.E;
        return Boolean.valueOf(backgroundFeaturesStatus == BackgroundFeaturesStatus.RUNNING);
    }
}
