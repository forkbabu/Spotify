package com.spotify.mobile.android.service.media;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class m0 implements g {
    public static final /* synthetic */ m0 a = new m0();

    private /* synthetic */ m0() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = ExternalIntegrationServicePlaybackImpl.r;
        Logger.e((Throwable) obj, "failed to update playback speed", new Object[0]);
    }
}
