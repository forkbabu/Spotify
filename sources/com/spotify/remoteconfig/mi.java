package com.spotify.remoteconfig;

import com.spotify.remoteconfig.jj;

/* access modifiers changed from: package-private */
public final class mi extends jj {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    static final class b extends jj.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        public jj a() {
            String str = this.a == null ? " connectMiniPicker" : "";
            if (this.b == null) {
                str = je.x0(str, " connectMiniPickerDeviceSorting");
            }
            if (this.c == null) {
                str = je.x0(str, " connectRedesignedPicker");
            }
            if (str.isEmpty()) {
                return new mi(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public jj.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public jj.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public jj.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    mi(boolean z, boolean z2, boolean z3, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // com.spotify.remoteconfig.jj
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.jj
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.jj
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jj)) {
            return false;
        }
        jj jjVar = (jj) obj;
        if (this.a == jjVar.a() && this.b == jjVar.b() && this.c == jjVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ConnectUiV2Properties{connectMiniPicker=");
        V0.append(this.a);
        V0.append(", connectMiniPickerDeviceSorting=");
        V0.append(this.b);
        V0.append(", connectRedesignedPicker=");
        return je.P0(V0, this.c, "}");
    }
}
