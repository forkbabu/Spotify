package com.spotify.encore.consumer.components.authentication;

import android.app.Activity;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.authentication.AuthenticationEncoreConsumerComponent;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButtonConfiguration;
import com.spotify.encore.consumer.components.authentication.impl.EncoreConsumerAuthComponentBindingsModule_ProvideAuthenticationFactoryFactory;
import com.spotify.encore.consumer.components.authentication.impl.authenticationbutton.AuthenticationButtonFactory;
import com.spotify.encore.consumer.components.authentication.impl.authenticationbutton.AuthenticationButtonFactory_Factory;
import com.spotify.encore.consumer.components.authentication.impl.authenticationbutton.AuthenticationButtonModule_ProvideAuthenticationButtonViewBinderFactory;
import com.spotify.encore.consumer.components.authentication.impl.authenticationbutton.DefaultAuthenticationButton;
import com.spotify.encore.consumer.components.authentication.impl.authenticationbutton.DefaultAuthenticationButtonViewBinder;
import com.spotify.encore.consumer.components.authentication.impl.authenticationbutton.DefaultAuthenticationButton_Factory;
import com.spotify.encore.consumer.components.authentication.impl.authenticationbutton.DefaultAuthenticationButton_ViewContext_Factory;

public final class DaggerAuthenticationEncoreConsumerComponent implements AuthenticationEncoreConsumerComponent {
    private wlf<Activity> activityProvider;
    private wlf<AuthenticationButtonFactory> authenticationButtonFactoryProvider;
    private wlf<DefaultAuthenticationButton> defaultAuthenticationButtonProvider;
    private wlf<DefaultAuthenticationButtonViewBinder> provideAuthenticationButtonViewBinderProvider;
    private wlf<ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration>> provideAuthenticationFactoryProvider;
    private wlf<DefaultAuthenticationButton.ViewContext> viewContextProvider;

    private static final class Factory implements AuthenticationEncoreConsumerComponent.Factory {
        private Factory() {
        }

        @Override // com.spotify.encore.consumer.components.authentication.AuthenticationEncoreConsumerComponent.Factory
        public AuthenticationEncoreConsumerComponent create(Activity activity) {
            activity.getClass();
            return new DaggerAuthenticationEncoreConsumerComponent(activity);
        }
    }

    public static AuthenticationEncoreConsumerComponent.Factory factory() {
        return new Factory();
    }

    private void initialize(Activity activity) {
        fjf a = gjf.a(activity);
        this.activityProvider = a;
        DefaultAuthenticationButton_ViewContext_Factory create = DefaultAuthenticationButton_ViewContext_Factory.create(a);
        this.viewContextProvider = create;
        AuthenticationButtonModule_ProvideAuthenticationButtonViewBinderFactory create2 = AuthenticationButtonModule_ProvideAuthenticationButtonViewBinderFactory.create(create);
        this.provideAuthenticationButtonViewBinderProvider = create2;
        DefaultAuthenticationButton_Factory create3 = DefaultAuthenticationButton_Factory.create(create2);
        this.defaultAuthenticationButtonProvider = create3;
        AuthenticationButtonFactory_Factory create4 = AuthenticationButtonFactory_Factory.create(create3);
        this.authenticationButtonFactoryProvider = create4;
        this.provideAuthenticationFactoryProvider = ljf.a(EncoreConsumerAuthComponentBindingsModule_ProvideAuthenticationFactoryFactory.create(create4));
    }

    @Override // com.spotify.encore.consumer.components.authentication.AuthenticationEncoreConsumerComponent
    public ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration> authenticationButtonFactory() {
        return this.provideAuthenticationFactoryProvider.get();
    }

    private DaggerAuthenticationEncoreConsumerComponent(Activity activity) {
        initialize(activity);
    }
}
