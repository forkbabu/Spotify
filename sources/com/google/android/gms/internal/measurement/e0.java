package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.h;

final class e0 extends h.a {
    private final /* synthetic */ Bundle n;
    private final /* synthetic */ Activity o;
    private final /* synthetic */ h.b p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e0(h.b bVar, Bundle bundle, Activity activity) {
        super(true);
        this.p = bVar;
        this.n = bundle;
        this.o = activity;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        Bundle bundle;
        if (this.n != null) {
            bundle = new Bundle();
            if (this.n.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.n.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        h.this.h.onActivityCreated(b.F3(this.o), bundle, this.b);
    }
}
