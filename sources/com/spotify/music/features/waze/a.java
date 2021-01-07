package com.spotify.music.features.waze;

import com.spotify.mobile.android.waze.model.WazeBannerModel;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ d a;

    public /* synthetic */ a(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((WazeBannerModel) obj);
    }
}
