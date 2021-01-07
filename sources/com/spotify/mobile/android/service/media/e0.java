package com.spotify.mobile.android.service.media;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class e0 implements l {
    public final /* synthetic */ ExternalIntegrationServicePlaybackImpl a;
    public final /* synthetic */ PreparePlayOptions b;
    public final /* synthetic */ PlayOrigin c;
    public final /* synthetic */ LoggingParams f;
    public final /* synthetic */ String n;
    public final /* synthetic */ Map o;

    public /* synthetic */ e0(ExternalIntegrationServicePlaybackImpl externalIntegrationServicePlaybackImpl, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, String str, Map map) {
        this.a = externalIntegrationServicePlaybackImpl;
        this.b = preparePlayOptions;
        this.c = playOrigin;
        this.f = loggingParams;
        this.n = str;
        this.o = map;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.D(this.b, this.c, this.f, this.n, this.o, (Optional) obj);
    }
}
