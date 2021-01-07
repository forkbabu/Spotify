package com.spotify.music.features.ads.screensaver;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class p implements g {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public /* synthetic */ p(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.b("Failed to resolve %s for %s slot", this.a, this.b);
    }
}
