package com.spotify.mobile.android.service.media;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class z implements l {
    public final /* synthetic */ ExternalIntegrationServicePlaybackImpl a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ PreparePlayOptions c;
    public final /* synthetic */ PlayOrigin f;
    public final /* synthetic */ LoggingParams n;

    public /* synthetic */ z(ExternalIntegrationServicePlaybackImpl externalIntegrationServicePlaybackImpl, Map map, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams) {
        this.a = externalIntegrationServicePlaybackImpl;
        this.b = map;
        this.c = preparePlayOptions;
        this.f = playOrigin;
        this.n = loggingParams;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.C(this.b, this.c, this.f, this.n, (u3) obj);
    }
}
