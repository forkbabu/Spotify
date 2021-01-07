package com.waze.sdk;

import android.app.PendingIntent;
import android.os.Bundle;

public class f {
    private final PendingIntent a;

    public static class b {
        private PendingIntent a;

        public f a() {
            return new f(this.a, false, false, false, null, null, null, null);
        }

        public b b(PendingIntent pendingIntent) {
            this.a = pendingIntent;
            return this;
        }
    }

    f(PendingIntent pendingIntent, boolean z, boolean z2, boolean z3, String str, String str2, String str3, a aVar) {
        this.a = pendingIntent;
    }

    /* access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = this.a;
        if (pendingIntent != null) {
            bundle.putParcelable("Intent", pendingIntent);
        }
        return bundle;
    }
}
