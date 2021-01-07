package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.util.d;

/* access modifiers changed from: package-private */
public final class g7 implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ i6 a;

    g7(i6 i6Var, n6 n6Var) {
        this.a = i6Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(com.google.android.gms.measurement.internal.g7 r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 483
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g7.a(com.google.android.gms.measurement.internal.g7, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.a.l().M().a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    this.a.s().F(activity, bundle);
                    return;
                }
                this.a.f();
                this.a.k().y(new j7(this, bundle == null, data, z9.X(intent) ? "gs" : "auto", data.getQueryParameter(Constants.REFERRER)));
                this.a.s().F(activity, bundle);
            }
        } catch (Exception e) {
            this.a.l().E().b("Throwable caught in onActivityCreated", e);
        } finally {
            this.a.s().F(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.s().U(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.a.s().S(activity);
        e9 u = this.a.u();
        ((d) u.d()).getClass();
        u.k().y(new g9(u, SystemClock.elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e9 u = this.a.u();
        ((d) u.d()).getClass();
        u.k().y(new d9(u, SystemClock.elapsedRealtime()));
        this.a.s().E(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.a.s().T(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
