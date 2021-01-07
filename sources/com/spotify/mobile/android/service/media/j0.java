package com.spotify.mobile.android.service.media;

import io.reactivex.functions.g;

public final /* synthetic */ class j0 implements g {
    public final /* synthetic */ ExternalIntegrationServicePlaybackImpl a;

    public /* synthetic */ j0(ExternalIntegrationServicePlaybackImpl externalIntegrationServicePlaybackImpl) {
        this.a = externalIntegrationServicePlaybackImpl;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.z((zwd) obj);
    }
}
