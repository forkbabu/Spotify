package com.spotify.music.features.ads.rules;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.a;

public final /* synthetic */ class b implements a {
    public final /* synthetic */ String a;

    public /* synthetic */ b(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        Logger.b("%s success for %s slot", "clearSlot", this.a);
    }
}
