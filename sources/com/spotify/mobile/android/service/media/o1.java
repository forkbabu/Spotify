package com.spotify.mobile.android.service.media;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class o1 implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ o1(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Couldn't create a radio station for %s", this.a);
    }
}
