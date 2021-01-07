package com.spotify.music.libs.assistedcuration.presenter;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.libs.assistedcuration.provider.b0;
import io.reactivex.g;

public final class m implements fjf<l> {
    private final wlf<b0> a;
    private final wlf<g<SessionState>> b;
    private final wlf<ExplicitContentFacade> c;
    private final wlf<AgeRestrictedContentFacade> d;

    public m(wlf<b0> wlf, wlf<g<SessionState>> wlf2, wlf<ExplicitContentFacade> wlf3, wlf<AgeRestrictedContentFacade> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a, this.b, this.c, this.d);
    }
}
