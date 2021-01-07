package com.spotify.music.homething.addnewdevice.scandevices.service;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.homething.addnewdevice.scandevices.service.HomethingActivationService;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        int i = HomethingActivationService.a.b;
        Logger.d("Failed to get access token", new Object[0]);
    }
}
