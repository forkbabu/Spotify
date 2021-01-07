package com.spotify.music.libs.mediasession;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.n;

public final /* synthetic */ class y implements n {
    public static final /* synthetic */ y a = new y();

    private /* synthetic */ y() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((GaiaDevice) obj).isActive();
    }
}
