package com.spotify.music.libs.bluetooth;

import com.spotify.music.libs.bluetooth.i;

final class h extends i {
    private final String a;
    private final boolean b;

    /* access modifiers changed from: package-private */
    public static final class b implements i.a {
        private String a;
        private Boolean b;

        b() {
        }

        @Override // com.spotify.music.libs.bluetooth.i.a
        public i.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null category");
        }

        @Override // com.spotify.music.libs.bluetooth.i.a
        public i.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.libs.bluetooth.i.a
        public i build() {
            String str = this.a == null ? " category" : "";
            if (this.b == null) {
                str = je.x0(str, " isConnected");
            }
            if (str.isEmpty()) {
                return new h(this.a, this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    h(String str, boolean z, a aVar) {
        this.a = str;
        this.b = z;
    }

    @Override // com.spotify.music.libs.bluetooth.i
    public String b() {
        return this.a;
    }

    @Override // com.spotify.music.libs.bluetooth.i
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.a.equals(iVar.b()) || this.b != iVar.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("BluetoothCategorizationEvent{category=");
        V0.append(this.a);
        V0.append(", isConnected=");
        return je.P0(V0, this.b, "}");
    }
}
