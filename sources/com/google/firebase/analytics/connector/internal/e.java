package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.measurement.internal.c6;
import defpackage.wu;

final class e implements wu.a {
    private final /* synthetic */ b a;

    public e(b bVar) {
        this.a = bVar;
    }

    @Override // com.google.android.gms.measurement.internal.g6
    public final void a(String str, String str2, Bundle bundle, long j) {
        if (this.a.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i = c.g;
            String m = f.m(str2, c6.c, c6.a);
            if (m != null) {
                str2 = m;
            }
            bundle2.putString("events", str2);
            b.a(this.a).a(2, bundle2);
        }
    }
}
