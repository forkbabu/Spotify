package com.spotify.music.libs.carmodeengine.util;

import android.app.Activity;
import android.app.Application;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.mobile.android.util.ui.b;

public class f0 implements d {
    private final Application a;
    private final g0 b;
    private final Application.ActivityLifecycleCallbacks c = new a();

    class a extends b {
        a() {
        }

        @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            f0.a(f0.this);
        }
    }

    public f0(Application application, g0 g0Var) {
        this.a = application;
        this.b = g0Var;
    }

    static void a(f0 f0Var) {
        f0Var.b.b();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.registerActivityLifecycleCallbacks(this.c);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.unregisterActivityLifecycleCallbacks(this.c);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "MicPermissionDetectorPlugin";
    }
}
