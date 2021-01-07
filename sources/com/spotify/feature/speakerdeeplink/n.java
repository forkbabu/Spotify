package com.spotify.feature.speakerdeeplink;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

public final /* synthetic */ class n implements g {
    public static final /* synthetic */ n a = new n();

    private /* synthetic */ n() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("Transferred to %s", ((GaiaDevice) obj).getName());
    }
}
