package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* access modifiers changed from: package-private */
public final class b extends BackendResponse {
    private final BackendResponse.Status a;
    private final long b;

    b(BackendResponse.Status status, long j) {
        this.a = status;
        this.b = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        if (!this.a.equals(backendResponse.c()) || this.b != backendResponse.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder V0 = je.V0("BackendResponse{status=");
        V0.append(this.a);
        V0.append(", nextRequestWaitMillis=");
        return je.E0(V0, this.b, "}");
    }
}
