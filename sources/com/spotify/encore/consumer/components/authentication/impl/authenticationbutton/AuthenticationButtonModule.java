package com.spotify.encore.consumer.components.authentication.impl.authenticationbutton;

import com.spotify.encore.consumer.components.authentication.impl.authenticationbutton.DefaultAuthenticationButton;
import kotlin.jvm.internal.h;

public final class AuthenticationButtonModule {
    public static final AuthenticationButtonModule INSTANCE = new AuthenticationButtonModule();

    private AuthenticationButtonModule() {
    }

    public final DefaultAuthenticationButtonViewBinder provideAuthenticationButtonViewBinder(DefaultAuthenticationButton.ViewContext viewContext) {
        h.e(viewContext, "context");
        return new DefaultAuthenticationButtonViewBinder(viewContext.getContext());
    }
}
