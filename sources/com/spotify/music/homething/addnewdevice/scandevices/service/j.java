package com.spotify.music.homething.addnewdevice.scandevices.service;

import com.spotify.base.java.logging.Logger;

public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ j(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.a;
        String str = HomethingActivationService.E;
        try {
            runnable.run();
        } catch (Exception e) {
            Logger.e(e, "ERROR: Command exception for device", new Object[0]);
        }
    }
}
