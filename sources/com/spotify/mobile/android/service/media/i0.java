package com.spotify.mobile.android.service.media;

import io.reactivex.functions.l;

public final /* synthetic */ class i0 implements l {
    public static final /* synthetic */ i0 a = new i0();

    private /* synthetic */ i0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = ExternalIntegrationServicePlaybackImpl.r;
        return Boolean.valueOf(!g51.d((String) obj).booleanValue());
    }
}
