package com.spotify.music.libs.assistedcuration.presenter;

import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.libs.assistedcuration.AssistedCurationLogger;
import com.spotify.music.libs.assistedcuration.provider.b0;

public final class j implements fjf<i> {
    private final wlf<String> a;
    private final wlf<b0> b;
    private final wlf<ExplicitContentFacade> c;
    private final wlf<AgeRestrictedContentFacade> d;
    private final wlf<AssistedCurationLogger.a> e;

    public j(wlf<String> wlf, wlf<b0> wlf2, wlf<ExplicitContentFacade> wlf3, wlf<AgeRestrictedContentFacade> wlf4, wlf<AssistedCurationLogger.a> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a, this.b, this.c, this.d, this.e);
    }
}
