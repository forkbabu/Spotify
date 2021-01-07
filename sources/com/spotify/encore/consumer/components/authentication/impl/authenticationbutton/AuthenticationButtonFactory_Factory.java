package com.spotify.encore.consumer.components.authentication.impl.authenticationbutton;

public final class AuthenticationButtonFactory_Factory implements fjf<AuthenticationButtonFactory> {
    private final wlf<DefaultAuthenticationButton> buttonProvider;

    public AuthenticationButtonFactory_Factory(wlf<DefaultAuthenticationButton> wlf) {
        this.buttonProvider = wlf;
    }

    public static AuthenticationButtonFactory_Factory create(wlf<DefaultAuthenticationButton> wlf) {
        return new AuthenticationButtonFactory_Factory(wlf);
    }

    public static AuthenticationButtonFactory newInstance(wlf<DefaultAuthenticationButton> wlf) {
        return new AuthenticationButtonFactory(wlf);
    }

    @Override // defpackage.wlf
    public AuthenticationButtonFactory get() {
        return newInstance(this.buttonProvider);
    }
}
