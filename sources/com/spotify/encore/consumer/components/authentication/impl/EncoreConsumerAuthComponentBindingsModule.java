package com.spotify.encore.consumer.components.authentication.impl;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButtonConfiguration;
import com.spotify.encore.consumer.components.authentication.impl.authenticationbutton.AuthenticationButtonFactory;
import kotlin.jvm.internal.h;

public final class EncoreConsumerAuthComponentBindingsModule {
    public static final EncoreConsumerAuthComponentBindingsModule INSTANCE = new EncoreConsumerAuthComponentBindingsModule();

    private EncoreConsumerAuthComponentBindingsModule() {
    }

    public final ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration> provideAuthenticationFactory(ajf<AuthenticationButtonFactory> ajf) {
        h.e(ajf, "factory");
        AuthenticationButtonFactory authenticationButtonFactory = ajf.get();
        h.d(authenticationButtonFactory, "factory.get()");
        return authenticationButtonFactory;
    }
}
