package com.spotify.music.features.ads.screensaver;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.a;

public final /* synthetic */ class i implements a {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public /* synthetic */ i(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        Logger.b("%s success for %s slot", this.a, this.b);
    }
}
