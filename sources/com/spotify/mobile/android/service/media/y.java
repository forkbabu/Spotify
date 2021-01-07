package com.spotify.mobile.android.service.media;

import com.spotify.playlist.endpoints.d;
import io.reactivex.functions.l;

public final /* synthetic */ class y implements l {
    public final /* synthetic */ ExternalIntegrationServicePlaybackImpl a;
    public final /* synthetic */ d.b b;

    public /* synthetic */ y(ExternalIntegrationServicePlaybackImpl externalIntegrationServicePlaybackImpl, d.b bVar) {
        this.a = externalIntegrationServicePlaybackImpl;
        this.b = bVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.y(this.b, (String) obj);
    }
}
