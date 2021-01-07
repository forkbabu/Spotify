package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import defpackage.wu;

final class f implements wu.a {
    private final /* synthetic */ d a;

    public f(d dVar) {
        this.a = dVar;
    }

    @Override // com.google.android.gms.measurement.internal.g6
    public final void a(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals("crash") && c.e(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            d.a(this.a).a(3, bundle2);
        }
    }
}
