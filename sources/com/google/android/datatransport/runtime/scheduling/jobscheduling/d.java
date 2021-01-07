package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

final class d extends SchedulerConfig.b {
    private final long a;
    private final long b;
    private final Set<SchedulerConfig.Flag> c;

    static final class b extends SchedulerConfig.b.a {
        private Long a;
        private Long b;
        private Set<SchedulerConfig.Flag> c;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b.a
        public SchedulerConfig.b a() {
            String str = this.a == null ? " delta" : "";
            if (this.b == null) {
                str = je.x0(str, " maxAllowedDelay");
            }
            if (this.c == null) {
                str = je.x0(str, " flags");
            }
            if (str.isEmpty()) {
                return new d(this.a.longValue(), this.b.longValue(), this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b.a
        public SchedulerConfig.b.a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b.a
        public SchedulerConfig.b.a c(Set<SchedulerConfig.Flag> set) {
            if (set != null) {
                this.c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b.a
        public SchedulerConfig.b.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    d(long j, long j2, Set set, a aVar) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    public long b() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    public Set<SchedulerConfig.Flag> c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.b)) {
            return false;
        }
        SchedulerConfig.b bVar = (SchedulerConfig.b) obj;
        if (this.a == bVar.b() && this.b == bVar.d() && this.c.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ConfigValue{delta=");
        V0.append(this.a);
        V0.append(", maxAllowedDelay=");
        V0.append(this.b);
        V0.append(", flags=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
