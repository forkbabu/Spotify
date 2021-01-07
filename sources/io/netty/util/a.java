package io.netty.util;

import io.netty.util.a;
import java.util.concurrent.atomic.AtomicLong;

public abstract class a<T extends a<T>> implements i<T> {
    private static final AtomicLong f = new AtomicLong();
    private final int a;
    private final String b;
    private final long c = f.getAndIncrement();

    protected a(int i, String str) {
        this.a = i;
        this.b = str;
    }

    /* renamed from: d */
    public final int compareTo(T t) {
        if (this == t) {
            return 0;
        }
        int hashCode = super.hashCode() - super.hashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        long j = this.c;
        long j2 = t.c;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        throw new Error("failed to compare two different constants");
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int g() {
        return this.a;
    }

    public final String h() {
        return this.b;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return super.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.b;
    }
}
