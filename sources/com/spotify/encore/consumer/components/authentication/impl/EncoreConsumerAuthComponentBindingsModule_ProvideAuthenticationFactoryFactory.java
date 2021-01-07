package com.spotify.encore.consumer.components.authentication.impl;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButtonConfiguration;
import com.spotify.encore.consumer.components.authentication.impl.authenticationbutton.AuthenticationButtonFactory;

public final class EncoreConsumerAuthComponentBindingsModule_ProvideAuthenticationFactoryFactory implements fjf<ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration>> {
    private final wlf<AuthenticationButtonFactory> factoryProvider;

    public EncoreConsumerAuthComponentBindingsModule_ProvideAuthenticationFactoryFactory(wlf<AuthenticationButtonFactory> wlf) {
        this.factoryProvider = wlf;
    }

    public static EncoreConsumerAuthComponentBindingsModule_ProvideAuthenticationFactoryFactory create(wlf<AuthenticationButtonFactory> wlf) {
        return new EncoreConsumerAuthComponentBindingsModule_ProvideAuthenticationFactoryFactory(wlf);
    }

    public static ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration> provideAuthenticationFactory(ajf<AuthenticationButtonFactory> ajf) {
        ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration> provideAuthenticationFactory = EncoreConsumerAuthComponentBindingsModule.INSTANCE.provideAuthenticationFactory(ajf);
        yif.g(provideAuthenticationFactory, "Cannot return null from a non-@Nullable @Provides method");
        return provideAuthenticationFactory;
    }

    @Override // defpackage.wlf
    public ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration> get() {
        return provideAuthenticationFactory(ejf.a(this.factoryProvider));
    }
}
