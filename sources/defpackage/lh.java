package defpackage;

import defpackage.oh;

/* renamed from: lh  reason: default package */
final class lh extends oh {
    private final long b;
    private final int c;
    private final int d;
    private final long e;
    private final int f;

    /* renamed from: lh$b */
    static final class b extends oh.a {
        private Long a;
        private Integer b;
        private Integer c;
        private Long d;
        private Integer e;

        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.oh.a
        public oh a() {
            String str = this.a == null ? " maxStorageSizeInBytes" : "";
            if (this.b == null) {
                str = je.x0(str, " loadBatchSize");
            }
            if (this.c == null) {
                str = je.x0(str, " criticalSectionEnterTimeoutMs");
            }
            if (this.d == null) {
                str = je.x0(str, " eventCleanUpAge");
            }
            if (this.e == null) {
                str = je.x0(str, " maxBlobByteSizePerRow");
            }
            if (str.isEmpty()) {
                return new lh(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.oh.a
        public oh.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.oh.a
        public oh.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.oh.a
        public oh.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.oh.a
        public oh.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        public oh.a f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    lh(long j, int i, int i2, long j2, int i3, a aVar) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.oh
    public int a() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.oh
    public long b() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.oh
    public int c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.oh
    public int d() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.oh
    public long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oh)) {
            return false;
        }
        oh ohVar = (oh) obj;
        if (this.b == ohVar.e() && this.c == ohVar.c() && this.d == ohVar.a() && this.e == ohVar.b() && this.f == ohVar.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.e;
        return this.f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder V0 = je.V0("EventStoreConfig{maxStorageSizeInBytes=");
        V0.append(this.b);
        V0.append(", loadBatchSize=");
        V0.append(this.c);
        V0.append(", criticalSectionEnterTimeoutMs=");
        V0.append(this.d);
        V0.append(", eventCleanUpAge=");
        V0.append(this.e);
        V0.append(", maxBlobByteSizePerRow=");
        return je.B0(V0, this.f, "}");
    }
}
