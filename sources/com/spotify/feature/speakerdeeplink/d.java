package com.spotify.feature.speakerdeeplink;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("Is transfer possible: %b", Boolean.valueOf(((Optional) obj).isPresent()));
    }
}
