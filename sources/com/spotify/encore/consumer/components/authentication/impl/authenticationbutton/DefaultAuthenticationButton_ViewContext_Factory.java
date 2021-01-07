package com.spotify.encore.consumer.components.authentication.impl.authenticationbutton;

import android.app.Activity;
import com.spotify.encore.consumer.components.authentication.impl.authenticationbutton.DefaultAuthenticationButton;

public final class DefaultAuthenticationButton_ViewContext_Factory implements fjf<DefaultAuthenticationButton.ViewContext> {
    private final wlf<Activity> contextProvider;

    public DefaultAuthenticationButton_ViewContext_Factory(wlf<Activity> wlf) {
        this.contextProvider = wlf;
    }

    public static DefaultAuthenticationButton_ViewContext_Factory create(wlf<Activity> wlf) {
        return new DefaultAuthenticationButton_ViewContext_Factory(wlf);
    }

    public static DefaultAuthenticationButton.ViewContext newInstance(Activity activity) {
        return new DefaultAuthenticationButton.ViewContext(activity);
    }

    @Override // defpackage.wlf
    public DefaultAuthenticationButton.ViewContext get() {
        return newInstance(this.contextProvider.get());
    }
}
