package com.spotify.encore.consumer.components.authentication.impl.authenticationbutton;

public final class DefaultAuthenticationButton_Factory implements fjf<DefaultAuthenticationButton> {
    private final wlf<DefaultAuthenticationButtonViewBinder> viewBinderProvider;

    public DefaultAuthenticationButton_Factory(wlf<DefaultAuthenticationButtonViewBinder> wlf) {
        this.viewBinderProvider = wlf;
    }

    public static DefaultAuthenticationButton_Factory create(wlf<DefaultAuthenticationButtonViewBinder> wlf) {
        return new DefaultAuthenticationButton_Factory(wlf);
    }

    public static DefaultAuthenticationButton newInstance(DefaultAuthenticationButtonViewBinder defaultAuthenticationButtonViewBinder) {
        return new DefaultAuthenticationButton(defaultAuthenticationButtonViewBinder);
    }

    @Override // defpackage.wlf
    public DefaultAuthenticationButton get() {
        return newInstance(this.viewBinderProvider.get());
    }
}
