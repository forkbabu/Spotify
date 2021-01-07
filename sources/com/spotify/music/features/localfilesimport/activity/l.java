package com.spotify.music.features.localfilesimport.activity;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class l implements g {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        int i = LocalFilesImportActivity.h0;
        Logger.e(th, "Local files: status and tracks observable: on error %s", th.getMessage());
    }
}
