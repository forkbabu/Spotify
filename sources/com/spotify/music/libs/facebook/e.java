package com.spotify.music.libs.facebook;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = FacebookPlaceholderActivity.P;
        Logger.e((Throwable) obj, "Failed to set access token", new Object[0]);
    }
}
