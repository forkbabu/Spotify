package com.spotify.encore.consumer.components.authentication.impl.authenticationbutton;

import com.spotify.encore.consumer.components.authentication.impl.authenticationbutton.DefaultAuthenticationButton;

public final class AuthenticationButtonModule_ProvideAuthenticationButtonViewBinderFactory implements fjf<DefaultAuthenticationButtonViewBinder> {
    private final wlf<DefaultAuthenticationButton.ViewContext> contextProvider;

    public AuthenticationButtonModule_ProvideAuthenticationButtonViewBinderFactory(wlf<DefaultAuthenticationButton.ViewContext> wlf) {
        this.contextProvider = wlf;
    }

    public static AuthenticationButtonModule_ProvideAuthenticationButtonViewBinderFactory create(wlf<DefaultAuthenticationButton.ViewContext> wlf) {
        return new AuthenticationButtonModule_ProvideAuthenticationButtonViewBinderFactory(wlf);
    }

    public static DefaultAuthenticationButtonViewBinder provideAuthenticationButtonViewBinder(DefaultAuthenticationButton.ViewContext viewContext) {
        DefaultAuthenticationButtonViewBinder provideAuthenticationButtonViewBinder = AuthenticationButtonModule.INSTANCE.provideAuthenticationButtonViewBinder(viewContext);
        yif.g(provideAuthenticationButtonViewBinder, "Cannot return null from a non-@Nullable @Provides method");
        return provideAuthenticationButtonViewBinder;
    }

    @Override // defpackage.wlf
    public DefaultAuthenticationButtonViewBinder get() {
        return provideAuthenticationButtonViewBinder(this.contextProvider.get());
    }
}
