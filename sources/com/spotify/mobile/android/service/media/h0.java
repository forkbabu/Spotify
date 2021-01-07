package com.spotify.mobile.android.service.media;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class h0 implements l {
    public final /* synthetic */ ExternalIntegrationServicePlaybackImpl a;
    public final /* synthetic */ long b;

    public /* synthetic */ h0(ExternalIntegrationServicePlaybackImpl externalIntegrationServicePlaybackImpl, long j) {
        this.a = externalIntegrationServicePlaybackImpl;
        this.b = j;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.F(this.b, (PlayerState) obj);
    }
}
