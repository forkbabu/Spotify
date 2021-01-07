package com.waze.sdk;

import android.app.PendingIntent;
import com.waze.sdk.i;

public class d extends i {

    public static class b extends i.a<b> {
        public d a() {
            return new d(this, null);
        }

        public i.a b(PendingIntent pendingIntent) {
            this.a = pendingIntent;
            return this;
        }

        public i.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }
    }

    d(b bVar, a aVar) {
        super(bVar);
    }
}
