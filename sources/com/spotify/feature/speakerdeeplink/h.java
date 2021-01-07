package com.spotify.feature.speakerdeeplink;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.n;

public final /* synthetic */ class h implements n {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((GaiaDevice) obj).isBeingActivated();
    }
}
