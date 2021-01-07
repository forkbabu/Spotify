package com.google.android.datatransport.cct.a;

import java.util.List;

/* access modifiers changed from: package-private */
public final class d extends j {
    private final List<l> a;

    d(List<l> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // com.google.android.datatransport.cct.a.j
    public List<l> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.a.equals(((j) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("BatchedLogRequest{logRequests="), this.a, "}");
    }
}
