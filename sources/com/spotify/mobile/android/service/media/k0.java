package com.spotify.mobile.android.service.media;

import io.reactivex.functions.g;

public final /* synthetic */ class k0 implements g {
    public final /* synthetic */ ExternalIntegrationServicePlaybackImpl a;

    public /* synthetic */ k0(ExternalIntegrationServicePlaybackImpl externalIntegrationServicePlaybackImpl) {
        this.a = externalIntegrationServicePlaybackImpl;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.G((zwd) obj);
    }
}
