package com.spotify.mobile.android.video.offline;

import com.spotify.mobile.android.video.offline.g0;
import java.util.Map;

final class p extends g0 {
    private final String a;
    private final Map<String, String> b;

    /* access modifiers changed from: package-private */
    public static final class b extends g0.a {
        private String a;
        private Map<String, String> b;

        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.mobile.android.video.offline.g0.a
        public g0 a() {
            String str = this.a == null ? " mediaUrl" : "";
            if (this.b == null) {
                str = je.x0(str, " metadata");
            }
            if (str.isEmpty()) {
                return new p(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.mobile.android.video.offline.g0.a
        public Map<String, String> c() {
            Map<String, String> map = this.b;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"metadata\" has not been set");
        }

        @Override // com.spotify.mobile.android.video.offline.g0.a
        public g0.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null mediaUrl");
        }

        @Override // com.spotify.mobile.android.video.offline.g0.a
        public g0.a e(Map<String, String> map) {
            if (map != null) {
                this.b = map;
                return this;
            }
            throw new NullPointerException("Null metadata");
        }
    }

    p(String str, Map map, a aVar) {
        this.a = str;
        this.b = map;
    }

    @Override // com.spotify.mobile.android.video.offline.g0
    public String b() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.video.offline.g0
    public Map<String, String> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (!this.a.equals(g0Var.b()) || !this.b.equals(g0Var.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("DownloadRequest{mediaUrl=");
        V0.append(this.a);
        V0.append(", metadata=");
        return je.M0(V0, this.b, "}");
    }
}
