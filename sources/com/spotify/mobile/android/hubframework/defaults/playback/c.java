package com.spotify.mobile.android.hubframework.defaults.playback;

import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ ExplicitPlaybackCommandHelper a;

    public /* synthetic */ c(ExplicitPlaybackCommandHelper explicitPlaybackCommandHelper) {
        this.a = explicitPlaybackCommandHelper;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ExplicitPlaybackCommandHelper.c(this.a, ((Boolean) obj).booleanValue());
    }
}
