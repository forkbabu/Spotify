package defpackage;

import java.util.Comparator;

/* renamed from: zof  reason: default package */
public class zof {
    private int a = 0;

    public zof a(Object obj, Object obj2, Comparator<?> comparator) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.a != 0 || obj == obj2) {
            return this;
        }
        int i9 = -1;
        if (obj == null) {
            this.a = -1;
            return this;
        } else if (obj2 == null) {
            this.a = 1;
            return this;
        } else {
            if (obj.getClass().isArray()) {
                int i10 = 0;
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    long[] jArr2 = (long[]) obj2;
                    if (this.a == 0 && jArr != jArr2) {
                        if (jArr.length != jArr2.length) {
                            if (jArr.length >= jArr2.length) {
                                i9 = 1;
                            }
                            this.a = i9;
                        } else {
                            for (int i11 = 0; i11 < jArr.length && (i8 = this.a) == 0; i11++) {
                                long j = jArr[i11];
                                long j2 = jArr2[i11];
                                if (i8 == 0) {
                                    this.a = j < j2 ? -1 : j > j2 ? 1 : 0;
                                }
                            }
                        }
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int[] iArr2 = (int[]) obj2;
                    if (this.a == 0 && iArr != iArr2) {
                        if (iArr.length != iArr2.length) {
                            if (iArr.length >= iArr2.length) {
                                i9 = 1;
                            }
                            this.a = i9;
                        } else {
                            for (int i12 = 0; i12 < iArr.length && (i7 = this.a) == 0; i12++) {
                                int i13 = iArr[i12];
                                int i14 = iArr2[i12];
                                if (i7 == 0) {
                                    this.a = i13 < i14 ? -1 : i13 > i14 ? 1 : 0;
                                }
                            }
                        }
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    short[] sArr2 = (short[]) obj2;
                    if (this.a == 0 && sArr != sArr2) {
                        if (sArr.length != sArr2.length) {
                            if (sArr.length >= sArr2.length) {
                                i9 = 1;
                            }
                            this.a = i9;
                        } else {
                            for (int i15 = 0; i15 < sArr.length && (i6 = this.a) == 0; i15++) {
                                short s = sArr[i15];
                                short s2 = sArr2[i15];
                                if (i6 == 0) {
                                    this.a = s < s2 ? -1 : s > s2 ? 1 : 0;
                                }
                            }
                        }
                    }
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    char[] cArr2 = (char[]) obj2;
                    if (this.a == 0 && cArr != cArr2) {
                        if (cArr.length != cArr2.length) {
                            if (cArr.length >= cArr2.length) {
                                i9 = 1;
                            }
                            this.a = i9;
                        } else {
                            for (int i16 = 0; i16 < cArr.length && (i5 = this.a) == 0; i16++) {
                                char c = cArr[i16];
                                char c2 = cArr2[i16];
                                if (i5 == 0) {
                                    this.a = c < c2 ? -1 : c > c2 ? 1 : 0;
                                }
                            }
                        }
                    }
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = (byte[]) obj2;
                    if (this.a == 0 && bArr != bArr2) {
                        if (bArr.length != bArr2.length) {
                            if (bArr.length >= bArr2.length) {
                                i9 = 1;
                            }
                            this.a = i9;
                        } else {
                            for (int i17 = 0; i17 < bArr.length && (i4 = this.a) == 0; i17++) {
                                byte b = bArr[i17];
                                byte b2 = bArr2[i17];
                                if (i4 == 0) {
                                    this.a = b < b2 ? -1 : b > b2 ? 1 : 0;
                                }
                            }
                        }
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    double[] dArr2 = (double[]) obj2;
                    if (this.a == 0 && dArr != dArr2) {
                        if (dArr.length != dArr2.length) {
                            if (dArr.length >= dArr2.length) {
                                i9 = 1;
                            }
                            this.a = i9;
                        } else {
                            while (i10 < dArr.length && (i3 = this.a) == 0) {
                                double d = dArr[i10];
                                double d2 = dArr2[i10];
                                if (i3 == 0) {
                                    this.a = Double.compare(d, d2);
                                }
                                i10++;
                            }
                        }
                    }
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    float[] fArr2 = (float[]) obj2;
                    if (this.a == 0 && fArr != fArr2) {
                        if (fArr.length != fArr2.length) {
                            if (fArr.length >= fArr2.length) {
                                i9 = 1;
                            }
                            this.a = i9;
                        } else {
                            while (i10 < fArr.length && (i2 = this.a) == 0) {
                                float f = fArr[i10];
                                float f2 = fArr2[i10];
                                if (i2 == 0) {
                                    this.a = Float.compare(f, f2);
                                }
                                i10++;
                            }
                        }
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    boolean[] zArr2 = (boolean[]) obj2;
                    if (this.a == 0 && zArr != zArr2) {
                        if (zArr.length != zArr2.length) {
                            if (zArr.length >= zArr2.length) {
                                i9 = 1;
                            }
                            this.a = i9;
                        } else {
                            while (i10 < zArr.length && (i = this.a) == 0) {
                                boolean z = zArr[i10];
                                boolean z2 = zArr2[i10];
                                if (i == 0 && z != z2) {
                                    if (!z) {
                                        this.a = -1;
                                    } else {
                                        this.a = 1;
                                    }
                                }
                                i10++;
                            }
                        }
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    Object[] objArr2 = (Object[]) obj2;
                    if (this.a == 0 && objArr != objArr2) {
                        if (objArr.length != objArr2.length) {
                            if (objArr.length >= objArr2.length) {
                                i9 = 1;
                            }
                            this.a = i9;
                        } else {
                            while (i10 < objArr.length && this.a == 0) {
                                a(objArr[i10], objArr2[i10], comparator);
                                i10++;
                            }
                        }
                    }
                }
            } else if (comparator == null) {
                this.a = ((Comparable) obj).compareTo(obj2);
            } else {
                this.a = comparator.compare(obj, obj2);
            }
            return this;
        }
    }

    public int b() {
        return this.a;
    }
}
