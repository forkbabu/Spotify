package com.spotify.mobile.android.util.connectivity;

import com.spotify.mobile.android.util.connectivity.h0;

final class q extends h0 {
    private final ConnectionType a;
    private final boolean b;
    private final boolean c;

    /* access modifiers changed from: package-private */
    public static final class b implements h0.a {
        private ConnectionType a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        public h0.a a(ConnectionType connectionType) {
            if (connectionType != null) {
                this.a = connectionType;
                return this;
            }
            throw new NullPointerException("Null connectionType");
        }

        public h0.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.mobile.android.util.connectivity.h0.a
        public h0 build() {
            String str = this.a == null ? " connectionType" : "";
            if (this.b == null) {
                str = je.x0(str, " flightModeEnabled");
            }
            if (this.c == null) {
                str = je.x0(str, " mobileDataDisabled");
            }
            if (str.isEmpty()) {
                return new q(this.a, this.b.booleanValue(), this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public h0.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    q(ConnectionType connectionType, boolean z, boolean z2, a aVar) {
        this.a = connectionType;
        this.b = z;
        this.c = z2;
    }

    @Override // com.spotify.mobile.android.util.connectivity.h0
    public ConnectionType b() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.util.connectivity.h0
    public boolean c() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.util.connectivity.h0
    public boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.a.equals(h0Var.b()) && this.b == h0Var.c() && this.c == h0Var.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("InternetState{connectionType=");
        V0.append(this.a);
        V0.append(", flightModeEnabled=");
        V0.append(this.b);
        V0.append(", mobileDataDisabled=");
        return je.P0(V0, this.c, "}");
    }
}
