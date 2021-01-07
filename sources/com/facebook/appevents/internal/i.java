package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.k;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class i implements Application.ActivityLifecycleCallbacks {

    class a implements Runnable {
        a(i iVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    Context d = k.d();
                    j.c(d, k.h(d, j.h), false);
                    j.c(d, k.i(d, j.h), true);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    class b implements Runnable {
        b(i iVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    Context d = k.d();
                    ArrayList<String> h = k.h(d, j.h);
                    if (h.isEmpty()) {
                        h = k.f(d, j.h);
                    }
                    j.c(d, h, false);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    i() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        try {
            k.l().execute(new a(this));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        try {
            if (j.d.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                k.l().execute(new b(this));
            }
        } catch (Exception unused) {
        }
    }
}
