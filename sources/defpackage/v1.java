package defpackage;

import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: v1  reason: default package */
public class v1 extends w1 {
    private final double[] a;
    a[] b;

    /* renamed from: v1$a */
    private static class a {
        private static double[] s = new double[91];
        double[] a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double g;
        double h;
        double i;
        double j;
        double k;
        double l;
        double m;
        double n;
        double o;
        double p;
        boolean q;
        boolean r = false;

        a(int i2, double d2, double d3, double d4, double d5, double d6, double d7) {
            double d8;
            double d9 = d4;
            boolean z = false;
            int i3 = 1;
            this.q = i2 == 1 ? true : z;
            this.c = d2;
            this.d = d3;
            this.i = 1.0d / (d3 - d2);
            if (3 == i2) {
                this.r = true;
            }
            double d10 = d6 - d9;
            double d11 = d7 - d5;
            if (this.r || Math.abs(d10) < 0.001d || Math.abs(d11) < 0.001d) {
                this.r = true;
                this.e = d9;
                this.f = d6;
                this.g = d5;
                this.h = d7;
                double hypot = Math.hypot(d11, d10);
                this.b = hypot;
                this.n = hypot * this.i;
                double d12 = this.d;
                double d13 = this.c;
                this.l = d10 / (d12 - d13);
                this.m = d11 / (d12 - d13);
                return;
            }
            this.a = new double[101];
            boolean z2 = this.q;
            double d14 = (double) (z2 ? -1 : i3);
            Double.isNaN(d14);
            this.j = d14 * d10;
            double d15 = (double) (z2 ? 1 : -1);
            Double.isNaN(d15);
            this.k = d11 * d15;
            this.l = z2 ? d6 : d9;
            this.m = z2 ? d5 : d7;
            double[] dArr = s;
            double d16 = d5 - d7;
            int i4 = 0;
            double d17 = 0.0d;
            double d18 = 0.0d;
            double d19 = 0.0d;
            while (i4 < dArr.length) {
                double d20 = (double) i4;
                Double.isNaN(d20);
                Double.isNaN(d20);
                double length = (double) (dArr.length - 1);
                Double.isNaN(length);
                Double.isNaN(length);
                double radians = Math.toRadians((d20 * 90.0d) / length);
                double sin = Math.sin(radians) * d10;
                double cos = Math.cos(radians) * d16;
                if (i4 > 0) {
                    d8 = Math.hypot(sin - d18, cos - d19) + d17;
                    dArr[i4] = d8;
                } else {
                    d8 = d17;
                }
                i4++;
                d19 = cos;
                d17 = d8;
                d18 = sin;
            }
            this.b = d17;
            for (int i5 = 0; i5 < dArr.length; i5++) {
                dArr[i5] = dArr[i5] / d17;
            }
            int i6 = 0;
            while (true) {
                double[] dArr2 = this.a;
                if (i6 < dArr2.length) {
                    double d21 = (double) i6;
                    double length2 = (double) (dArr2.length - 1);
                    Double.isNaN(d21);
                    Double.isNaN(length2);
                    Double.isNaN(d21);
                    Double.isNaN(length2);
                    double d22 = d21 / length2;
                    int binarySearch = Arrays.binarySearch(dArr, d22);
                    if (binarySearch >= 0) {
                        this.a[i6] = (double) (binarySearch / (dArr.length - 1));
                    } else if (binarySearch == -1) {
                        this.a[i6] = 0.0d;
                    } else {
                        int i7 = -binarySearch;
                        int i8 = i7 - 2;
                        double d23 = (double) i8;
                        Double.isNaN(d23);
                        Double.isNaN(d23);
                        double length3 = (double) (dArr.length - 1);
                        Double.isNaN(length3);
                        Double.isNaN(length3);
                        this.a[i6] = (((d22 - dArr[i8]) / (dArr[i7 - 1] - dArr[i8])) + d23) / length3;
                    }
                    i6++;
                } else {
                    this.n = this.b * this.i;
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public double a() {
            double d2 = this.j * this.p;
            double hypot = this.n / Math.hypot(d2, (-this.k) * this.o);
            if (this.q) {
                d2 = -d2;
            }
            return d2 * hypot;
        }

        /* access modifiers changed from: package-private */
        public double b() {
            double d2 = this.j * this.p;
            double d3 = (-this.k) * this.o;
            double hypot = this.n / Math.hypot(d2, d3);
            return this.q ? (-d3) * hypot : d3 * hypot;
        }

        public double c(double d2) {
            double d3 = (d2 - this.c) * this.i;
            double d4 = this.e;
            return ((this.f - d4) * d3) + d4;
        }

        public double d(double d2) {
            double d3 = (d2 - this.c) * this.i;
            double d4 = this.g;
            return ((this.h - d4) * d3) + d4;
        }

        /* access modifiers changed from: package-private */
        public double e() {
            return (this.j * this.o) + this.l;
        }

        /* access modifiers changed from: package-private */
        public double f() {
            return (this.k * this.p) + this.m;
        }

        /* access modifiers changed from: package-private */
        public void g(double d2) {
            double d3 = (this.q ? this.d - d2 : d2 - this.c) * this.i;
            double d4 = 0.0d;
            if (d3 > 0.0d) {
                d4 = 1.0d;
                if (d3 < 1.0d) {
                    double[] dArr = this.a;
                    double length = (double) (dArr.length - 1);
                    Double.isNaN(length);
                    Double.isNaN(length);
                    double d5 = d3 * length;
                    int i2 = (int) d5;
                    double d6 = (double) i2;
                    Double.isNaN(d6);
                    Double.isNaN(d6);
                    d4 = ((dArr[i2 + 1] - dArr[i2]) * (d5 - d6)) + dArr[i2];
                }
            }
            double d7 = d4 * 1.5707963267948966d;
            this.o = Math.sin(d7);
            this.p = Math.cos(d7);
        }
    }

    public v1(int[] iArr, double[] dArr, double[][] dArr2) {
        this.a = dArr;
        this.b = new a[(dArr.length - 1)];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            a[] aVarArr = this.b;
            if (i < aVarArr.length) {
                int i4 = iArr[i];
                if (i4 == 0) {
                    i3 = 3;
                } else if (i4 == 1) {
                    i2 = 1;
                    i3 = 1;
                } else if (i4 == 2) {
                    i2 = 2;
                    i3 = 2;
                } else if (i4 == 3) {
                    i2 = i2 == 1 ? 2 : 1;
                    i3 = i2;
                }
                int i5 = i + 1;
                aVarArr[i] = new a(i3, dArr[i], dArr[i5], dArr2[i][0], dArr2[i][1], dArr2[i5][0], dArr2[i5][1]);
                i = i5;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.w1
    public double c(double d, int i) {
        a[] aVarArr = this.b;
        int i2 = 0;
        if (d < aVarArr[0].c) {
            d = aVarArr[0].c;
        } else if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        while (true) {
            a[] aVarArr2 = this.b;
            if (i2 >= aVarArr2.length) {
                return Double.NaN;
            }
            if (d > aVarArr2[i2].d) {
                i2++;
            } else if (!aVarArr2[i2].r) {
                aVarArr2[i2].g(d);
                if (i == 0) {
                    return this.b[i2].e();
                }
                return this.b[i2].f();
            } else if (i == 0) {
                return aVarArr2[i2].c(d);
            } else {
                return aVarArr2[i2].d(d);
            }
        }
    }

    @Override // defpackage.w1
    public void d(double d, double[] dArr) {
        a[] aVarArr = this.b;
        if (d < aVarArr[0].c) {
            d = aVarArr[0].c;
        }
        if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].d) {
                i++;
            } else if (aVarArr2[i].r) {
                dArr[0] = aVarArr2[i].c(d);
                dArr[1] = this.b[i].d(d);
                return;
            } else {
                aVarArr2[i].g(d);
                dArr[0] = this.b[i].e();
                dArr[1] = this.b[i].f();
                return;
            }
        }
    }

    @Override // defpackage.w1
    public void e(double d, float[] fArr) {
        a[] aVarArr = this.b;
        if (d < aVarArr[0].c) {
            d = aVarArr[0].c;
        } else if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].d) {
                i++;
            } else if (aVarArr2[i].r) {
                fArr[0] = (float) aVarArr2[i].c(d);
                fArr[1] = (float) this.b[i].d(d);
                return;
            } else {
                aVarArr2[i].g(d);
                fArr[0] = (float) this.b[i].e();
                fArr[1] = (float) this.b[i].f();
                return;
            }
        }
    }

    @Override // defpackage.w1
    public double f(double d, int i) {
        a[] aVarArr = this.b;
        int i2 = 0;
        if (d < aVarArr[0].c) {
            d = aVarArr[0].c;
        }
        if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        while (true) {
            a[] aVarArr2 = this.b;
            if (i2 >= aVarArr2.length) {
                return Double.NaN;
            }
            if (d > aVarArr2[i2].d) {
                i2++;
            } else if (!aVarArr2[i2].r) {
                aVarArr2[i2].g(d);
                if (i == 0) {
                    return this.b[i2].a();
                }
                return this.b[i2].b();
            } else if (i == 0) {
                return aVarArr2[i2].l;
            } else {
                return aVarArr2[i2].m;
            }
        }
    }

    @Override // defpackage.w1
    public void g(double d, double[] dArr) {
        a[] aVarArr = this.b;
        if (d < aVarArr[0].c) {
            d = aVarArr[0].c;
        } else if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].d) {
                i++;
            } else if (aVarArr2[i].r) {
                dArr[0] = aVarArr2[i].l;
                dArr[1] = aVarArr2[i].m;
                return;
            } else {
                aVarArr2[i].g(d);
                dArr[0] = this.b[i].a();
                dArr[1] = this.b[i].b();
                return;
            }
        }
    }

    @Override // defpackage.w1
    public double[] h() {
        return this.a;
    }
}
