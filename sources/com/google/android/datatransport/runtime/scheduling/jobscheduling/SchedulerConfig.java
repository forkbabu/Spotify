package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class SchedulerConfig {

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static class a {
        private ti a;
        private Map<Priority, b> b = new HashMap();

        public a a(Priority priority, b bVar) {
            this.b.put(priority, bVar);
            return this;
        }

        public SchedulerConfig b() {
            if (this.a != null) {
                int size = this.b.keySet().size();
                Priority.values();
                if (size >= 3) {
                    Map<Priority, b> map = this.b;
                    this.b = new HashMap();
                    return new c(this.a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        public a c(ti tiVar) {
            this.a = tiVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j);

            public abstract a c(Set<Flag> set);

            public abstract a d(long j);
        }

        public static a a() {
            d.b bVar = new d.b();
            bVar.c(Collections.emptySet());
            return bVar;
        }

        /* access modifiers changed from: package-private */
        public abstract long b();

        /* access modifiers changed from: package-private */
        public abstract Set<Flag> c();

        /* access modifiers changed from: package-private */
        public abstract long d();
    }

    /* access modifiers changed from: package-private */
    public abstract ti a();

    public long b(Priority priority, long j, int i) {
        long a2 = j - a().a();
        b bVar = c().get(priority);
        long b2 = bVar.b();
        int i2 = i - 1;
        double max = Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((b2 > 1 ? b2 : 2) * ((long) i2))));
        double pow = Math.pow(3.0d, (double) i2);
        double d = (double) b2;
        Double.isNaN(d);
        Double.isNaN(d);
        return Math.min(Math.max((long) (pow * d * max), a2), bVar.d());
    }

    /* access modifiers changed from: package-private */
    public abstract Map<Priority, b> c();
}
