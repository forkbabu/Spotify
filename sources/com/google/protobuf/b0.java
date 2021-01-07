package com.google.protobuf;

import java.util.Arrays;

public final class b0 {
    private static final b0 f = new b0(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private b0() {
        this(0, new int[8], new Object[8], true);
    }

    public static b0 b() {
        return f;
    }

    static b0 h(b0 b0Var, b0 b0Var2) {
        int i = b0Var.a + b0Var2.a;
        int[] copyOf = Arrays.copyOf(b0Var.b, i);
        System.arraycopy(b0Var2.b, 0, copyOf, b0Var.a, b0Var2.a);
        Object[] copyOf2 = Arrays.copyOf(b0Var.c, i);
        System.arraycopy(b0Var2.c, 0, copyOf2, b0Var.a, b0Var2.a);
        return new b0(i, copyOf, copyOf2, true);
    }

    static b0 i() {
        return new b0(0, new int[8], new Object[8], true);
    }

    private void k(int i, Object obj) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public int c() {
        int i;
        int i2;
        int i3 = this.d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.a; i5++) {
            int i6 = this.b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 != 0) {
                if (i8 == 1) {
                    ((Long) this.c[i5]).longValue();
                    i2 = CodedOutputStream.r(i7) + 8;
                } else if (i8 == 2) {
                    i = CodedOutputStream.e(i7, (ByteString) this.c[i5]);
                } else if (i8 == 3) {
                    i4 = ((b0) this.c[i5]).c() + (CodedOutputStream.r(i7) * 2) + i4;
                } else if (i8 == 5) {
                    ((Integer) this.c[i5]).intValue();
                    i2 = CodedOutputStream.r(i7) + 4;
                } else {
                    throw new IllegalStateException(InvalidProtocolBufferException.a());
                }
                i4 += i2;
            } else {
                i = CodedOutputStream.u(i7, ((Long) this.c[i5]).longValue());
            }
            i4 = i + i4;
        }
        this.d = i4;
        return i4;
    }

    public void d() {
        this.e = false;
    }

    /* access modifiers changed from: package-private */
    public boolean e(int i, g gVar) {
        int B;
        a();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            k(i, Long.valueOf(gVar.w()));
            return true;
        } else if (i3 == 1) {
            k(i, Long.valueOf(gVar.t()));
            return true;
        } else if (i3 == 2) {
            k(i, gVar.i());
            return true;
        } else if (i3 == 3) {
            b0 b0Var = new b0(0, new int[8], new Object[8], true);
            do {
                B = gVar.B();
                if (B == 0) {
                    break;
                }
            } while (b0Var.e(B, gVar));
            gVar.a((i2 << 3) | 4);
            k(i, b0Var);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                k(i, Integer.valueOf(gVar.s()));
                return true;
            }
            throw InvalidProtocolBufferException.a();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.a == b0Var.a && Arrays.equals(this.b, b0Var.b) && Arrays.deepEquals(this.c, b0Var.c);
    }

    /* access modifiers changed from: package-private */
    public b0 f(int i, ByteString byteString) {
        a();
        if (i != 0) {
            k((i << 3) | 2, byteString);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* access modifiers changed from: package-private */
    public b0 g(int i, int i2) {
        a();
        if (i != 0) {
            k((i << 3) | 0, Long.valueOf((long) i2));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        return Arrays.deepHashCode(this.c) + ((hashCode + ((527 + this.a) * 31)) * 31);
    }

    /* access modifiers changed from: package-private */
    public final void j(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            w.c(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public void l(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                codedOutputStream.U(i3, ((Long) this.c[i]).longValue());
            } else if (i4 == 1) {
                codedOutputStream.H(i3, ((Long) this.c[i]).longValue());
            } else if (i4 == 2) {
                codedOutputStream.C(i3, (ByteString) this.c[i]);
            } else if (i4 == 3) {
                codedOutputStream.R(i3, 3);
                ((b0) this.c[i]).l(codedOutputStream);
                codedOutputStream.R(i3, 4);
            } else if (i4 == 5) {
                codedOutputStream.F(i3, ((Integer) this.c[i]).intValue());
            } else {
                throw InvalidProtocolBufferException.a();
            }
        }
    }

    private b0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
