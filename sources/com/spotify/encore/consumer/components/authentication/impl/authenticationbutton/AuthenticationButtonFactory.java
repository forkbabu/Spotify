package com.spotify.encore.consumer.components.authentication.impl.authenticationbutton;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButtonConfiguration;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class AuthenticationButtonFactory implements ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration> {
    private final wlf<DefaultAuthenticationButton> buttonProvider;

    public AuthenticationButtonFactory(wlf<DefaultAuthenticationButton> wlf) {
        h.e(wlf, "buttonProvider");
        this.buttonProvider = wlf;
    }

    @Override // com.spotify.encore.ComponentFactory
    public AuthenticationButton make() {
        return (AuthenticationButton) ComponentFactory.DefaultImpls.make(this);
    }

    public AuthenticationButton make(AuthenticationButtonConfiguration authenticationButtonConfiguration) {
        if (h.a(authenticationButtonConfiguration, AuthenticationButtonConfiguration.DefaultButtonConfiguration.INSTANCE)) {
            DefaultAuthenticationButton defaultAuthenticationButton = this.buttonProvider.get();
            h.d(defaultAuthenticationButton, "buttonProvider.get()");
            return defaultAuthenticationButton;
        } else if (authenticationButtonConfiguration == null) {
            DefaultAuthenticationButton defaultAuthenticationButton2 = this.buttonProvider.get();
            h.d(defaultAuthenticationButton2, "buttonProvider.get()");
            return defaultAuthenticationButton2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
