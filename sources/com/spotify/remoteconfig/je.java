package com.spotify.remoteconfig;

import com.spotify.remoteconfig.u6;

final class je extends u6 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    static final class b extends u6.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;

        b() {
        }

        public u6 a() {
            String str = this.a == null ? " clearQueueButtonEnabled" : "";
            if (this.b == null) {
                str = defpackage.je.x0(str, " enableStableIds");
            }
            if (this.c == null) {
                str = defpackage.je.x0(str, " queueV2");
            }
            if (this.d == null) {
                str = defpackage.je.x0(str, " socialListeningInQueue");
            }
            if (str.isEmpty()) {
                return new je(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), null);
            }
            throw new IllegalStateException(defpackage.je.x0("Missing required properties:", str));
        }

        public u6.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public u6.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public u6.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public u6.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }
    }

    je(boolean z, boolean z2, boolean z3, boolean z4, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override // com.spotify.remoteconfig.u6
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.u6
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.u6
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.u6
    public boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        if (this.a == u6Var.a() && this.b == u6Var.b() && this.c == u6Var.c() && this.d == u6Var.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = defpackage.je.V0("AndroidFeatureQueueProperties{clearQueueButtonEnabled=");
        V0.append(this.a);
        V0.append(", enableStableIds=");
        V0.append(this.b);
        V0.append(", queueV2=");
        V0.append(this.c);
        V0.append(", socialListeningInQueue=");
        return defpackage.je.P0(V0, this.d, "}");
    }
}
