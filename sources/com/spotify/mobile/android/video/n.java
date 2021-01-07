package com.spotify.mobile.android.video;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class n extends d0 {
    private final String a;
    private final String b;
    private final Map<String, String> c;
    private final boolean d;
    private final boolean e;

    n(String str, String str2, Map<String, String> map, boolean z, boolean z2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (map != null) {
                    this.c = map;
                    this.d = z;
                    this.e = z2;
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

    @Override // com.spotify.mobile.android.video.d0
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (!this.a.equals(d0Var.d()) || !this.b.equals(d0Var.b()) || !this.c.equals(d0Var.c()) || this.d != d0Var.e() || this.e != d0Var.f()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.mobile.android.video.d0
    public boolean f() {
        return this.e;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaybackIdentity{sessionId=");
        V0.append(this.a);
        V0.append(", mediaUrl=");
        V0.append(this.b);
        V0.append(", metadata=");
        V0.append(this.c);
        V0.append(", isAudioOnlyAllowed=");
        V0.append(this.d);
        V0.append(", isRoyaltyMedia=");
        return je.P0(V0, this.e, "}");
    }
}
