package okio;

import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class SegmentedByteString extends ByteString {
    final transient byte[][] n;
    final transient int[] o;

    SegmentedByteString(e eVar, int i) {
        super(null);
        y.b(eVar.b, 0, (long) i);
        t tVar = eVar.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = tVar.c;
            int i6 = tVar.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                tVar = tVar.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.n = new byte[i4][];
        this.o = new int[(i4 * 2)];
        t tVar2 = eVar.a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.n;
            bArr[i7] = tVar2.a;
            int i8 = tVar2.c;
            int i9 = tVar2.b;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.o;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            tVar2.d = true;
            i7++;
            tVar2 = tVar2.f;
        }
    }

    private int F(int i) {
        int binarySearch = Arrays.binarySearch(this.o, 0, this.n.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    private ByteString G() {
        return new ByteString(B());
    }

    private Object writeReplace() {
        return G();
    }

    @Override // okio.ByteString
    public ByteString A() {
        return G().A();
    }

    @Override // okio.ByteString
    public byte[] B() {
        int[] iArr = this.o;
        byte[][] bArr = this.n;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.o;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.n[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // okio.ByteString
    public String C() {
        return G().C();
    }

    /* access modifiers changed from: package-private */
    @Override // okio.ByteString
    public void D(e eVar) {
        int length = this.n.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.o;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            t tVar = new t(this.n[i], i3, (i3 + i4) - i2, true, false);
            t tVar2 = eVar.a;
            if (tVar2 == null) {
                tVar.g = tVar;
                tVar.f = tVar;
                eVar.a = tVar;
            } else {
                tVar2.g.b(tVar);
            }
            i++;
            i2 = i4;
        }
        eVar.b += (long) i2;
    }

    @Override // okio.ByteString
    public String d() {
        return G().d();
    }

    @Override // okio.ByteString, java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.x() == x() && u(0, byteString, 0, x())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString, java.lang.Object
    public int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int length = this.n.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.n[i2];
            int[] iArr = this.o;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.a = i4;
        return i4;
    }

    @Override // okio.ByteString
    public byte n(int i) {
        int i2;
        y.b((long) this.o[this.n.length - 1], (long) i, 1);
        int F = F(i);
        if (F == 0) {
            i2 = 0;
        } else {
            i2 = this.o[F - 1];
        }
        int[] iArr = this.o;
        byte[][] bArr = this.n;
        return bArr[F][(i - i2) + iArr[bArr.length + F]];
    }

    @Override // okio.ByteString
    public String p() {
        return G().p();
    }

    /* access modifiers changed from: package-private */
    @Override // okio.ByteString
    public byte[] q() {
        return B();
    }

    @Override // okio.ByteString
    public ByteString r() {
        return G().r();
    }

    @Override // okio.ByteString, java.lang.Object
    public String toString() {
        return G().toString();
    }

    @Override // okio.ByteString
    public boolean u(int i, ByteString byteString, int i2, int i3) {
        int i4;
        if (i < 0 || i > x() - i3) {
            return false;
        }
        int F = F(i);
        while (i3 > 0) {
            if (F == 0) {
                i4 = 0;
            } else {
                i4 = this.o[F - 1];
            }
            int min = Math.min(i3, ((this.o[F] - i4) + i4) - i);
            int[] iArr = this.o;
            byte[][] bArr = this.n;
            if (!byteString.v(i2, bArr[F], (i - i4) + iArr[bArr.length + F], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            F++;
        }
        return true;
    }

    @Override // okio.ByteString
    public boolean v(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > x() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int F = F(i);
        while (i3 > 0) {
            if (F == 0) {
                i4 = 0;
            } else {
                i4 = this.o[F - 1];
            }
            int min = Math.min(i3, ((this.o[F] - i4) + i4) - i);
            int[] iArr = this.o;
            byte[][] bArr2 = this.n;
            if (!y.a(bArr2[F], (i - i4) + iArr[bArr2.length + F], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            F++;
        }
        return true;
    }

    @Override // okio.ByteString
    public ByteString w() {
        return G().w();
    }

    @Override // okio.ByteString
    public int x() {
        return this.o[this.n.length - 1];
    }

    @Override // okio.ByteString
    public ByteString z(int i, int i2) {
        return G().z(i, i2);
    }
}
