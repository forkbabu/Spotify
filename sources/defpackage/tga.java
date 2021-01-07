package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.jvm.internal.h;

/* renamed from: tga  reason: default package */
public final class tga {
    private final boolean a;
    private final String b;

    public tga(@JsonProperty("isConnected") boolean z, @JsonProperty("partnerIntegrationId") String str) {
        h.e(str, "partnerIntegrationId");
        this.a = z;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final tga copy(@JsonProperty("isConnected") boolean z, @JsonProperty("partnerIntegrationId") String str) {
        h.e(str, "partnerIntegrationId");
        return new tga(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tga)) {
            return false;
        }
        tga tga = (tga) obj;
        return this.a == tga.a && h.a(this.b, tga.b);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.b;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Integration(isConnected=");
        V0.append(this.a);
        V0.append(", partnerIntegrationId=");
        return je.I0(V0, this.b, ")");
    }
}
