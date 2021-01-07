package com.spotify.remoteconfig;

import com.spotify.remoteconfig.wc;

final class ci extends wc {
    private final int a;
    private final int b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    static final class b extends wc.a {
        private Integer a;
        private Integer b;
        private Boolean c;
        private Boolean d;
        private Boolean e;

        b() {
        }

        /* access modifiers changed from: package-private */
        public wc a() {
            String str = this.a == null ? " logTrimMemorySampleInterval" : "";
            if (this.b == null) {
                str = je.x0(str, " logTrimMemoryThreshold");
            }
            if (this.c == null) {
                str = je.x0(str, " shouldLogColdStartupSubdurations");
            }
            if (this.d == null) {
                str = je.x0(str, " shouldLogTrimMemoryWarnings");
            }
            if (this.e == null) {
                str = je.x0(str, " shouldSendTimeMeasurements");
            }
            if (str.isEmpty()) {
                return new ci(this.a.intValue(), this.b.intValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public wc.a b(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public wc.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public wc.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public wc.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public wc.a f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }
    }

    ci(int i, int i2, boolean z, boolean z2, boolean z3, a aVar) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // com.spotify.remoteconfig.wc
    public int a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.wc
    public int b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.wc
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.wc
    public boolean d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.wc
    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wc)) {
            return false;
        }
        wc wcVar = (wc) obj;
        if (this.a == wcVar.a() && this.b == wcVar.b() && this.c == wcVar.c() && this.d == wcVar.d() && this.e == wcVar.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidPerfTrackingProperties{logTrimMemorySampleInterval=");
        V0.append(this.a);
        V0.append(", logTrimMemoryThreshold=");
        V0.append(this.b);
        V0.append(", shouldLogColdStartupSubdurations=");
        V0.append(this.c);
        V0.append(", shouldLogTrimMemoryWarnings=");
        V0.append(this.d);
        V0.append(", shouldSendTimeMeasurements=");
        return je.P0(V0, this.e, "}");
    }
}
