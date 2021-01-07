package com.spotify.offline.data;

import kotlin.jvm.internal.h;

public final class a {
    private final String a;
    private final OfflineAvailability b;

    public a(String str, OfflineAvailability offlineAvailability) {
        h.e(str, "uri");
        h.e(offlineAvailability, "offlineAvailability");
        this.a = str;
        this.b = offlineAvailability;
    }

    public final OfflineAvailability a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        OfflineAvailability offlineAvailability = this.b;
        if (offlineAvailability != null) {
            i = offlineAvailability.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("OfflineResource(uri=");
        V0.append(this.a);
        V0.append(", offlineAvailability=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }
}
