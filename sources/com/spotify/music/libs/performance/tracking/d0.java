package com.spotify.music.libs.performance.tracking;

import android.app.Activity;
import android.os.Bundle;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.util.ui.b;
import defpackage.ej9;
import defpackage.ij9;

public class d0 extends b {
    private final ColdStartTracker a;
    private String b;
    private String c;
    private io.reactivex.disposables.b f;

    public d0(ColdStartTracker coldStartTracker) {
        this.a = coldStartTracker;
    }

    @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        if (!this.a.h()) {
            if ("QuickLoginActivity".equals(activity.getClass().getSimpleName())) {
                this.a.y(null);
            } else if (activity instanceof ij9.b) {
                if (!this.a.h()) {
                    this.a.x(activity, true);
                }
                this.f = ((ij9.b) activity).u0().e().subscribe(new f(this), g.a);
            } else {
                this.a.c("no_main_activity", null);
            }
        }
    }

    @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        this.a.x(activity, false);
        io.reactivex.disposables.b bVar = this.f;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public /* synthetic */ void r(ej9 ej9) {
        if (!this.a.h()) {
            if (!(ej9 instanceof fj9) || this.b != null) {
                boolean z = ej9 instanceof ej9.a;
                if (z && this.c == null) {
                    this.c = ((ej9.a) ej9).b();
                } else if (z) {
                    this.a.c("first_view_cancel", null);
                }
            } else {
                this.b = ((fj9) ej9).d();
            }
        }
    }
}
