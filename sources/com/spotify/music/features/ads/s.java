package com.spotify.music.features.ads;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.a;

public final /* synthetic */ class s implements a {
    public final /* synthetic */ String a;

    public /* synthetic */ s(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        Logger.b("preroll - succeed fetching preroll with view uri: %s", this.a);
    }
}
