package com.spotify.music.features.ads;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("Ad external actions uri: %s", (Uri) obj);
    }
}
