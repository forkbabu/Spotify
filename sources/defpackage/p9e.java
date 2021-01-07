package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
/* renamed from: p9e  reason: default package */
public final class p9e extends q9e {
    private final String a;
    private final String b;
    private final String c;

    p9e(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null platform");
            }
            throw new NullPointerException("Null osVersion");
        }
        throw new NullPointerException("Null integration");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q9e)) {
            return false;
        }
        q9e q9e = (q9e) obj;
        if (!this.a.equals(q9e.integration()) || !this.b.equals(q9e.osVersion()) || !this.c.equals(q9e.platform())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.q9e
    @JsonProperty("integration")
    public String integration() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.q9e
    @JsonProperty("os_version")
    public String osVersion() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.q9e
    @JsonProperty("device_platform")
    public String platform() {
        return this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShareDestinationRequest{integration=");
        V0.append(this.a);
        V0.append(", osVersion=");
        V0.append(this.b);
        V0.append(", platform=");
        return je.I0(V0, this.c, "}");
    }
}
