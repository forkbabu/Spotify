package com.spotify.music.features.connect.dialogs.newdevice;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        int i = NewDeviceFragment.s0;
        Logger.e(th, "Spotify Connect: Failed to report onboarding flow. %s", th);
    }
}
