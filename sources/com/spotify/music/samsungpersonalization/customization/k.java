package com.spotify.music.samsungpersonalization.customization;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class k<T> implements g<Throwable> {
    public static final k a = new k();

    k() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        Throwable th2 = th;
        h.e(th2, AppProtocol.LogMessage.SEVERITY_ERROR);
        Logger.m(th2, "Error fetching token", new Object[0]);
    }
}
