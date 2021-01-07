package com.spotify.music.features.ads;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class r implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ r(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.b("preroll - failed to fetch preroll with view uri: %s", this.a);
    }
}
