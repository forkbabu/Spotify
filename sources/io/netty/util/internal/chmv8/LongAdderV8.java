package io.netty.util.internal.chmv8;

import io.netty.util.internal.chmv8.Striped64;
import io.netty.util.internal.g;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LongAdderV8 extends Striped64 implements Serializable, g {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 0;
        this.a = null;
        this.b = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(h());
    }

    @Override // io.netty.util.internal.g
    public void a() {
        b(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b2, code lost:
        if (r13.a != r6) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b4, code lost:
        r5 = new io.netty.util.internal.chmv8.Striped64.b[(r7 << 1)];
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b9, code lost:
        if (r8 >= r7) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00bb, code lost:
        r5[r8] = r6[r8];
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c2, code lost:
        r13.a = r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0049 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0111 A[SYNTHETIC] */
    @Override // io.netty.util.internal.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(long r14) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.chmv8.LongAdderV8.b(long):void");
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return (double) h();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) h();
    }

    /* access modifiers changed from: package-private */
    public final long g(long j, long j2) {
        return j + j2;
    }

    public long h() {
        long j = this.b;
        Striped64.b[] bVarArr = this.a;
        if (bVarArr != null) {
            for (Striped64.b bVar : bVarArr) {
                if (bVar != null) {
                    j += bVar.a;
                }
            }
        }
        return j;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) h();
    }

    @Override // java.lang.Number
    public long longValue() {
        return h();
    }

    @Override // java.lang.Object
    public String toString() {
        return Long.toString(h());
    }
}
