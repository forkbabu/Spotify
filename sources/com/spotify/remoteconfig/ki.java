package com.spotify.remoteconfig;

import com.spotify.remoteconfig.gj;

final class ki extends gj {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    static final class b extends gj.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;

        b() {
        }

        public gj a() {
            String str = this.a == null ? " connectFrictionlessJoin" : "";
            if (this.b == null) {
                str = je.x0(str, " connectKeepsAlive");
            }
            if (this.c == null) {
                str = je.x0(str, " connectLockScreenVolume");
            }
            if (this.d == null) {
                str = je.x0(str, " connectM2m");
            }
            if (this.e == null) {
                str = je.x0(str, " connectNewCastApi");
            }
            if (str.isEmpty()) {
                return new ki(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public gj.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public gj.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public gj.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public gj.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public gj.a f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }
    }

    ki(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    @Override // com.spotify.remoteconfig.gj
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.gj
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.gj
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.gj
    public boolean d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.gj
    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gj)) {
            return false;
        }
        gj gjVar = (gj) obj;
        if (this.a == gjVar.a() && this.b == gjVar.b() && this.c == gjVar.c() && this.d == gjVar.d() && this.e == gjVar.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ConnectLibCoreProperties{connectFrictionlessJoin=");
        V0.append(this.a);
        V0.append(", connectKeepsAlive=");
        V0.append(this.b);
        V0.append(", connectLockScreenVolume=");
        V0.append(this.c);
        V0.append(", connectM2m=");
        V0.append(this.d);
        V0.append(", connectNewCastApi=");
        return je.P0(V0, this.e, "}");
    }
}
