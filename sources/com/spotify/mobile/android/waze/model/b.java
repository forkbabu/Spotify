package com.spotify.mobile.android.waze.model;

import io.reactivex.s;
import io.reactivex.subjects.a;

public class b {
    private final a<WazeBannerModel> a = a.h1();

    public void a(WazeBannerModel wazeBannerModel) {
        this.a.onNext(wazeBannerModel);
    }

    public s<WazeBannerModel> b() {
        return this.a;
    }
}
