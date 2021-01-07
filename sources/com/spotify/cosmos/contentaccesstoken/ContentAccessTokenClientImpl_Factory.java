package com.spotify.cosmos.contentaccesstoken;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import io.reactivex.y;

public final class ContentAccessTokenClientImpl_Factory implements fjf<ContentAccessTokenClientImpl> {
    private final wlf<y> arg0Provider;
    private final wlf<Cosmonaut> arg1Provider;
    private final wlf<RxResolver> arg2Provider;

    public ContentAccessTokenClientImpl_Factory(wlf<y> wlf, wlf<Cosmonaut> wlf2, wlf<RxResolver> wlf3) {
        this.arg0Provider = wlf;
        this.arg1Provider = wlf2;
        this.arg2Provider = wlf3;
    }

    public static ContentAccessTokenClientImpl_Factory create(wlf<y> wlf, wlf<Cosmonaut> wlf2, wlf<RxResolver> wlf3) {
        return new ContentAccessTokenClientImpl_Factory(wlf, wlf2, wlf3);
    }

    public static ContentAccessTokenClientImpl newInstance(y yVar, Cosmonaut cosmonaut, RxResolver rxResolver) {
        return new ContentAccessTokenClientImpl(yVar, cosmonaut, rxResolver);
    }

    @Override // defpackage.wlf
    public ContentAccessTokenClientImpl get() {
        return newInstance(this.arg0Provider.get(), this.arg1Provider.get(), this.arg2Provider.get());
    }
}
