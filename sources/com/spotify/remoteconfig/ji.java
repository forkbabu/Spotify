package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ej;

/* access modifiers changed from: package-private */
public final class ji extends ej {
    private final boolean a;
    private final boolean b;

    static final class b extends ej.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public ej a() {
            String str = this.a == null ? " connectNudge" : "";
            if (this.b == null) {
                str = je.x0(str, " deviceNameNpb");
            }
            if (str.isEmpty()) {
                return new ji(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ej.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public ej.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    ji(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.ej
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.ej
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ej)) {
            return false;
        }
        ej ejVar = (ej) obj;
        if (this.a == ejVar.a() && this.b == ejVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ConnectFlagsProperties{connectNudge=");
        V0.append(this.a);
        V0.append(", deviceNameNpb=");
        return je.P0(V0, this.b, "}");
    }
}
