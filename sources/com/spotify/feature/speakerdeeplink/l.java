package com.spotify.feature.speakerdeeplink;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

public final /* synthetic */ class l implements g {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("Transferring to %s", ((GaiaDevice) obj).getName());
    }
}
