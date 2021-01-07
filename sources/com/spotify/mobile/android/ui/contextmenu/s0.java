package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class s0 implements g {
    public static final /* synthetic */ s0 a = new s0();

    private /* synthetic */ s0() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.d("Error reading video subtitles prefs", new Object[0]);
    }
}
