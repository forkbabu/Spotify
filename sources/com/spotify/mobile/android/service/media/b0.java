package com.spotify.mobile.android.service.media;

import com.spotify.player.model.Context;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.playlist.models.k;
import io.reactivex.functions.l;

public final /* synthetic */ class b0 implements l {
    public final /* synthetic */ ExternalIntegrationServicePlaybackImpl a;
    public final /* synthetic */ PreparePlayOptions b;
    public final /* synthetic */ k c;
    public final /* synthetic */ Context f;

    public /* synthetic */ b0(ExternalIntegrationServicePlaybackImpl externalIntegrationServicePlaybackImpl, PreparePlayOptions preparePlayOptions, k kVar, Context context) {
        this.a = externalIntegrationServicePlaybackImpl;
        this.b = preparePlayOptions;
        this.c = kVar;
        this.f = context;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.A(this.b, this.c, this.f, (Boolean) obj);
    }
}
