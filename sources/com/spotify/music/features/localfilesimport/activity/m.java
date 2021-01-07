package com.spotify.music.features.localfilesimport.activity;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        int i = LocalFilesImportActivity.h0;
        Logger.e(th, "Local files: status and tracks observable: on error %s", th.getMessage());
    }
}
