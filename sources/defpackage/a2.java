package defpackage;

import java.util.Arrays;

/* renamed from: a2  reason: default package */
public class a2 {
    float[] a = new float[0];
    double[] b = new double[0];
    double[] c;
    int d;

    public void a(double d2, float f) {
        int length = this.a.length + 1;
        int binarySearch = Arrays.binarySearch(this.b, d2);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.b = Arrays.copyOf(this.b, length);
        this.a = Arrays.copyOf(this.a, length);
        this.c = new double[length];
        double[] dArr = this.b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.b[binarySearch] = d2;
        this.a[binarySearch] = f;
    }

    /* access modifiers changed from: package-private */
    public double b(double d2) {
        if (d2 <= 0.0d) {
            d2 = 1.0E-5d;
        } else if (d2 >= 1.0d) {
            d2 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.b, d2);
        if (binarySearch > 0 || binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.a;
        int i2 = i - 1;
        double d3 = (double) (fArr[i] - fArr[i2]);
        double[] dArr = this.b;
        Double.isNaN(d3);
        double d4 = d3 / (dArr[i] - dArr[i2]);
        double d5 = d2 * d4;
        double d6 = (double) fArr[i2];
        Double.isNaN(d6);
        return (d6 - (d4 * dArr[i2])) + d5;
    }

    /* access modifiers changed from: package-private */
    public double c(double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        } else if (d2 > 1.0d) {
            d2 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.b, d2);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.a;
        int i2 = i - 1;
        double d3 = (double) (fArr[i] - fArr[i2]);
        double[] dArr = this.b;
        Double.isNaN(d3);
        double d4 = d3 / (dArr[i] - dArr[i2]);
        double d5 = this.c[i2];
        double d6 = (double) fArr[i2];
        Double.isNaN(d6);
        return ((((d2 * d2) - (dArr[i2] * dArr[i2])) * d4) / 2.0d) + ((d2 - dArr[i2]) * (d6 - (dArr[i2] * d4))) + d5;
    }

    public double d(double d2) {
        switch (this.d) {
            case 1:
                return 0.0d;
            case 2:
                return Math.signum((((c(d2) * 4.0d) + 3.0d) % 4.0d) - 2.0d) * b(d2) * 4.0d;
            case 3:
                return b(d2) * 2.0d;
            case 4:
                return (-b(d2)) * 2.0d;
            case 5:
                return Math.sin(6.283185307179586d * c(d2)) * -6.283185307179586d * b(d2);
            case 6:
                return ((((c(d2) * 4.0d) + 2.0d) % 4.0d) - 2.0d) * b(d2) * 4.0d;
            default:
                return Math.cos(6.283185307179586d * c(d2)) * b(d2) * 6.283185307179586d;
        }
    }

    public double e(double d2) {
        double abs;
        switch (this.d) {
            case 1:
                return Math.signum(0.5d - (c(d2) % 1.0d));
            case 2:
                abs = Math.abs((((c(d2) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c(d2) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((c(d2) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(6.283185307179586d * c(d2));
            case 6:
                double abs2 = 1.0d - Math.abs(((c(d2) * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            default:
                return Math.sin(6.283185307179586d * c(d2));
        }
        return 1.0d - abs;
    }

    public void f() {
        double d2 = 0.0d;
        int i = 0;
        while (true) {
            float[] fArr = this.a;
            if (i >= fArr.length) {
                break;
            }
            double d3 = (double) fArr[i];
            Double.isNaN(d3);
            d2 += d3;
            i++;
        }
        int i2 = 1;
        double d4 = 0.0d;
        int i3 = 1;
        while (true) {
            float[] fArr2 = this.a;
            if (i3 >= fArr2.length) {
                break;
            }
            int i4 = i3 - 1;
            double[] dArr = this.b;
            double d5 = (double) ((fArr2[i4] + fArr2[i3]) / 2.0f);
            Double.isNaN(d5);
            d4 += (dArr[i3] - dArr[i4]) * d5;
            i3++;
        }
        int i5 = 0;
        while (true) {
            float[] fArr3 = this.a;
            if (i5 >= fArr3.length) {
                break;
            }
            double d6 = (double) fArr3[i5];
            Double.isNaN(d6);
            fArr3[i5] = (float) (d6 * (d2 / d4));
            i5++;
        }
        this.c[0] = 0.0d;
        while (true) {
            float[] fArr4 = this.a;
            if (i2 < fArr4.length) {
                int i6 = i2 - 1;
                double[] dArr2 = this.b;
                double d7 = dArr2[i2] - dArr2[i6];
                double[] dArr3 = this.c;
                double d8 = dArr3[i6];
                double d9 = (double) ((fArr4[i6] + fArr4[i2]) / 2.0f);
                Double.isNaN(d9);
                dArr3[i2] = (d7 * d9) + d8;
                i2++;
            } else {
                return;
            }
        }
    }

    public void g(int i) {
        this.d = i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("pos =");
        V0.append(Arrays.toString(this.b));
        V0.append(" period=");
        V0.append(Arrays.toString(this.a));
        return V0.toString();
    }
}
