package com.spotify.mobile.android.video;

import com.spotify.mobile.android.video.e0;
import java.util.Map;

final class o extends e0 {
    private final boolean a;
    private final boolean b;
    private final String c;
    private final Map<String, String> d;

    /* access modifiers changed from: package-private */
    public static final class b extends e0.a {
        private Boolean a;
        private Boolean b;
        private String c;
        private Map<String, String> d;

        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.mobile.android.video.e0.a
        public e0 a() {
            String str = this.a == null ? " isAudioOnlyAllowed" : "";
            if (this.b == null) {
                str = je.x0(str, " isRoyaltyMedia");
            }
            if (this.c == null) {
                str = je.x0(str, " mediaUrl");
            }
            if (this.d == null) {
                str = je.x0(str, " metadata");
            }
            if (str.isEmpty()) {
                return new o(this.a.booleanValue(), this.b.booleanValue(), this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.mobile.android.video.e0.a
        public Map<String, String> c() {
            Map<String, String> map = this.d;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"metadata\" has not been set");
        }

        @Override // com.spotify.mobile.android.video.e0.a
        public e0.a d(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.mobile.android.video.e0.a
        public e0.a e(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.mobile.android.video.e0.a
        public e0.a f(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null mediaUrl");
        }

        @Override // com.spotify.mobile.android.video.e0.a
        public e0.a g(Map<String, String> map) {
            if (map != null) {
                this.d = map;
                return this;
            }
            throw new NullPointerException("Null metadata");
        }
    }

    o(boolean z, boolean z2, String str, Map map, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = map;
    }

    @Override // com.spotify.mobile.android.video.e0
    public boolean b() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.video.e0
    public boolean c() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.video.e0
    public String d() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.video.e0
    public Map<String, String> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.a != e0Var.b() || this.b != e0Var.c() || !this.c.equals(e0Var.d()) || !this.d.equals(e0Var.e())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return ((((i2 ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaybackRequest{isAudioOnlyAllowed=");
        V0.append(this.a);
        V0.append(", isRoyaltyMedia=");
        V0.append(this.b);
        V0.append(", mediaUrl=");
        V0.append(this.c);
        V0.append(", metadata=");
        return je.M0(V0, this.d, "}");
    }
}
