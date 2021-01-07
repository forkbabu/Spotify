package com.spotify.encore.consumer.components.authentication;

import android.app.Activity;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButton;
import com.spotify.encore.consumer.components.authentication.api.authenticationbutton.AuthenticationButtonConfiguration;

public interface AuthenticationEncoreConsumerComponent {

    public interface Factory {
        AuthenticationEncoreConsumerComponent create(Activity activity);
    }

    ComponentFactory<AuthenticationButton, AuthenticationButtonConfiguration> authenticationButtonFactory();
}
