package com.spotify.mobile.android.coreintegration;

import com.spotify.music.container.app.foregroundstate.ForegroundServicesStatus;
import io.reactivex.functions.l;

public final /* synthetic */ class h implements l {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ForegroundServicesStatus foregroundServicesStatus = (ForegroundServicesStatus) obj;
        int i = t.E;
        return Boolean.valueOf(foregroundServicesStatus == ForegroundServicesStatus.FOREGROUND);
    }
}
