package com.spotify.mobile.android.video.tracking;

import com.google.common.base.Optional;

public class k<T> {
    private final Optional<T> a;
    private final long b;
    private final long c;

    public k(Optional<T> optional, long j) {
        this.a = optional;
        this.b = j;
        this.c = -1;
    }

    public Optional<T> a() {
        return this.a;
    }

    public Optional<Long> b() {
        long j = this.c;
        if (j != -1) {
            return Optional.of(Long.valueOf(j - this.b));
        }
        return Optional.absent();
    }

    public k<T> c(long j) {
        return new k<>(this.a, this.b, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.b == kVar.b && this.c == kVar.c && this.a.equals(kVar.a);
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return (((this.a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder V0 = je.V0("ObservedFormat{mFormat=");
        V0.append(this.a);
        V0.append(", mStart=");
        V0.append(this.b);
        V0.append(", mEnd=");
        return je.D0(V0, this.c, '}');
    }

    public k(Optional<T> optional, long j, long j2) {
        this.a = optional;
        this.b = j;
        this.c = j2;
    }
}
