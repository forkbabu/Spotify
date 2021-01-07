package com.spotify.mobile.android.video.offline;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class m extends d0 {
    private final String a;
    private final String b;
    private final Map<String, String> c;

    m(String str, String str2, Map<String, String> map) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (map != null) {
                    this.c = map;
                    return;
                }
                throw new NullPointerException("Null metadata");
            }
            throw new NullPointerException("Null mediaUrl");
        }
        throw new NullPointerException("Null sessionId");
    }

    @Override // com.spotify.mobile.android.video.x
    public String b() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.video.x
    public Map<String, String> c() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.video.x
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (!this.a.equals(d0Var.d()) || !this.b.equals(d0Var.b()) || !this.c.equals(d0Var.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("DownloadIdentity{sessionId=");
        V0.append(this.a);
        V0.append(", mediaUrl=");
        V0.append(this.b);
        V0.append(", metadata=");
        return je.M0(V0, this.c, "}");
    }
}
