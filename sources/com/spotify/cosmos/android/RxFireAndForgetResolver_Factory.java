package com.spotify.cosmos.android;

public final class RxFireAndForgetResolver_Factory implements fjf<RxFireAndForgetResolver> {
    private final wlf<RxResolver> arg0Provider;

    public RxFireAndForgetResolver_Factory(wlf<RxResolver> wlf) {
        this.arg0Provider = wlf;
    }

    public static RxFireAndForgetResolver_Factory create(wlf<RxResolver> wlf) {
        return new RxFireAndForgetResolver_Factory(wlf);
    }

    public static RxFireAndForgetResolver newInstance(RxResolver rxResolver) {
        return new RxFireAndForgetResolver(rxResolver);
    }

    @Override // defpackage.wlf
    public RxFireAndForgetResolver get() {
        return newInstance(this.arg0Provider.get());
    }
}
