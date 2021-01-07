package com.spotify.music.features.yourlibrary.musicpages.prefs;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        int i = MusicPagesPrefs.u;
        Logger.d("Failed observing MusicPagesPrefs", new Object[0]);
    }
}
