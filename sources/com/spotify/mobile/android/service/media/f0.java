package com.spotify.mobile.android.service.media;

import com.google.common.base.Optional;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.functions.l;

public final /* synthetic */ class f0 implements l {
    public final /* synthetic */ ExternalIntegrationServicePlaybackImpl a;
    public final /* synthetic */ Optional b;

    public /* synthetic */ f0(ExternalIntegrationServicePlaybackImpl externalIntegrationServicePlaybackImpl, Optional optional) {
        this.a = externalIntegrationServicePlaybackImpl;
        this.b = optional;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ExternalIntegrationServicePlaybackImpl externalIntegrationServicePlaybackImpl = this.a;
        Optional<LoggingParams> optional = this.b;
        externalIntegrationServicePlaybackImpl.getClass();
        return externalIntegrationServicePlaybackImpl.t(((Long) obj).longValue(), optional);
    }
}
