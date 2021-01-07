package com.spotify.encore.consumer.components.authentication.impl.authenticationbutton;

import android.app.Activity;

public final class DefaultAuthenticationButtonViewBinder_Factory implements fjf<DefaultAuthenticationButtonViewBinder> {
    private final wlf<Activity> activityProvider;

    public DefaultAuthenticationButtonViewBinder_Factory(wlf<Activity> wlf) {
        this.activityProvider = wlf;
    }

    public static DefaultAuthenticationButtonViewBinder_Factory create(wlf<Activity> wlf) {
        return new DefaultAuthenticationButtonViewBinder_Factory(wlf);
    }

    public static DefaultAuthenticationButtonViewBinder newInstance(Activity activity) {
        return new DefaultAuthenticationButtonViewBinder(activity);
    }

    @Override // defpackage.wlf
    public DefaultAuthenticationButtonViewBinder get() {
        return newInstance(this.activityProvider.get());
    }
}
