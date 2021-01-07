package com.spotify.mobile.android.service.media;

import io.reactivex.functions.g;

public final /* synthetic */ class l0 implements g {
    public final /* synthetic */ ExternalIntegrationServicePlaybackImpl a;

    public /* synthetic */ l0(ExternalIntegrationServicePlaybackImpl externalIntegrationServicePlaybackImpl) {
        this.a = externalIntegrationServicePlaybackImpl;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.E((zwd) obj);
    }
}
