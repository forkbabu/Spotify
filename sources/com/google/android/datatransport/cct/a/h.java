package com.google.android.datatransport.cct.a;

/* access modifiers changed from: package-private */
public final class h extends m {
    private final long a;

    h(long j) {
        this.a = j;
    }

    @Override // com.google.android.datatransport.cct.a.m
    public long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m) || this.a != ((m) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return je.E0(je.V0("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
