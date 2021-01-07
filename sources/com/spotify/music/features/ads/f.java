package com.spotify.music.features.ads;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ Uri a;

    public /* synthetic */ f(Uri uri) {
        this.a = uri;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.b("Error in opening uri: %s", this.a);
    }
}
