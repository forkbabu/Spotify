package com.spotify.encore.consumer.components.authentication.api.authenticationbutton;

import com.spotify.encore.ComponentConfiguration;
import kotlin.jvm.internal.f;

public abstract class AuthenticationButtonConfiguration implements ComponentConfiguration {

    public static final class DefaultButtonConfiguration extends AuthenticationButtonConfiguration {
        public static final DefaultButtonConfiguration INSTANCE = new DefaultButtonConfiguration();

        private DefaultButtonConfiguration() {
            super(null);
        }
    }

    private AuthenticationButtonConfiguration() {
    }

    public /* synthetic */ AuthenticationButtonConfiguration(f fVar) {
        this();
    }
}
