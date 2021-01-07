package com.spotify.feature.speakerdeeplink;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("%s is now active", ((GaiaDevice) obj).getName());
    }
}
