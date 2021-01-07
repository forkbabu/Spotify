package com.spotify.instrumentation.navigation.logger;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.x;
import com.spotify.instrumentation.navigation.logger.f;
import kotlin.jvm.internal.h;

public final class NavigationLoggerApplicationInstaller {
    private final a a = new a();
    private final m b;

    public final class a implements Application.ActivityLifecycleCallbacks {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            h.e(activity, "activity");
            Intent intent = activity.getIntent();
            if (bundle == null) {
                h.d(intent, "intent");
                if (h.a(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.LAUNCHER")) {
                    NavigationLoggerApplicationInstaller.this.a().g(f.e.a);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            h.e(activity, "activity");
            h.e(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            h.e(activity, "activity");
        }
    }

    public NavigationLoggerApplicationInstaller(m mVar) {
        h.e(mVar, "navigationLogger");
        this.b = mVar;
    }

    public final m a() {
        return this.b;
    }

    public final void b(Application application) {
        h.e(application, "app");
        application.registerActivityLifecycleCallbacks(this.a);
        n g = x.g();
        h.d(g, "ProcessLifecycleOwner.get()");
        Lifecycle A = ((x) g).A();
        h.d(A, "ProcessLifecycleOwner.get().lifecycle");
        A.a(new NavigationLoggerApplicationInstaller$init$1(this));
    }
}
