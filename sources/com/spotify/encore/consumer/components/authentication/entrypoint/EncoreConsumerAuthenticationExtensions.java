package com.spotify.encore.consumer.components.authentication.entrypoint;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.authentication.DaggerAuthenticationEncoreConsumerComponent;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButtonConfiguration;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerAuthenticationExtensions {
    public static final ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration> authenticationButtonFactory(EncoreConsumerEntryPoint.Buttons buttons) {
        h.e(buttons, "$this$authenticationButtonFactory");
        return DaggerAuthenticationEncoreConsumerComponent.factory().create(buttons.getActivity()).authenticationButtonFactory();
    }
}
