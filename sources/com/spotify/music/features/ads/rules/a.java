package com.spotify.music.features.ads.rules;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ a(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.b("Failed to resolve %s for %s slot", "clearSlot", this.a);
    }
}
