package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.jvm.internal.h;

/* renamed from: grd  reason: default package */
public final class grd {
    private final String a;
    private final String b;

    public grd(@JsonProperty("uri") String str, @JsonProperty("offline_availability") String str2) {
        h.e(str, "uri");
        h.e(str2, "offlineAvailability");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final grd copy(@JsonProperty("uri") String str, @JsonProperty("offline_availability") String str2) {
        h.e(str, "uri");
        h.e(str2, "offlineAvailability");
        return new grd(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grd)) {
            return false;
        }
        grd grd = (grd) obj;
        return h.a(this.a, grd.a) && h.a(this.b, grd.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("OfflineResourceResponse(uri=");
        V0.append(this.a);
        V0.append(", offlineAvailability=");
        return je.I0(V0, this.b, ")");
    }
}
