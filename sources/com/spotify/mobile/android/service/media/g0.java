package com.spotify.mobile.android.service.media;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.functions.l;

public final /* synthetic */ class g0 implements l {
    public final /* synthetic */ ExternalIntegrationServicePlaybackImpl a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ PlayOrigin c;
    public final /* synthetic */ LoggingParams f;

    public /* synthetic */ g0(ExternalIntegrationServicePlaybackImpl externalIntegrationServicePlaybackImpl, Context context, PlayOrigin playOrigin, LoggingParams loggingParams) {
        this.a = externalIntegrationServicePlaybackImpl;
        this.b = context;
        this.c = playOrigin;
        this.f = loggingParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.B(this.b, this.c, this.f, (PreparePlayOptions) obj);
    }
}
