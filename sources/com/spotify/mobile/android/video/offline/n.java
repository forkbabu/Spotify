package com.spotify.mobile.android.video.offline;

import com.google.android.exoplayer2.offline.x;
import com.spotify.mobile.android.video.offline.e0;
import java.util.List;

/* access modifiers changed from: package-private */
public final class n extends e0 {
    private final String a;
    private final h0 b;
    private final List<x> c;

    /* access modifiers changed from: package-private */
    public static final class b extends e0.a {
        private String a;
        private h0 b;
        private List<x> c;

        b() {
        }

        /* access modifiers changed from: package-private */
        public e0 a() {
            String str = this.a == null ? " url" : "";
            if (this.c == null) {
                str = je.x0(str, " streamKeys");
            }
            if (str.isEmpty()) {
                return new n(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        public e0.a b(h0 h0Var) {
            this.b = h0Var;
            return this;
        }

        /* access modifiers changed from: package-private */
        public e0.a c(List<x> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null streamKeys");
        }

        /* access modifiers changed from: package-private */
        public e0.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null url");
        }

        /* access modifiers changed from: package-private */
        public List<x> e() {
            List<x> list = this.c;
            if (list != null) {
                return list;
            }
            throw new IllegalStateException("Property \"streamKeys\" has not been set");
        }
    }

    n(String str, h0 h0Var, List list, a aVar) {
        this.a = str;
        this.b = h0Var;
        this.c = list;
    }

    @Override // com.spotify.mobile.android.video.offline.e0
    public h0 a() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.video.offline.e0
    public List<x> b() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.video.offline.e0
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        h0 h0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (!this.a.equals(e0Var.c()) || ((h0Var = this.b) != null ? !h0Var.equals(e0Var.a()) : e0Var.a() != null) || !this.c.equals(e0Var.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        h0 h0Var = this.b;
        return ((hashCode ^ (h0Var == null ? 0 : h0Var.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("DownloadInfo{url=");
        V0.append(this.a);
        V0.append(", licenseKeySetId=");
        V0.append(this.b);
        V0.append(", streamKeys=");
        return je.L0(V0, this.c, "}");
    }
}
