package com.comscore.android.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.comscore.Analytics;

public class BackgroundManager implements Application.ActivityLifecycleCallbacks {
    private Application a;

    public BackgroundManager(Application application) {
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Analytics.notifyExitForeground();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Analytics.notifyEnterForeground();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public void register() {
        this.a.registerActivityLifecycleCallbacks(this);
    }

    public void unregister() {
        this.a.unregisterActivityLifecycleCallbacks(this);
    }
}
