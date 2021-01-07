package defpackage;

/* renamed from: w1  reason: default package */
public abstract class w1 {

    /* access modifiers changed from: package-private */
    /* renamed from: w1$a */
    public static class a extends w1 {
        double a;
        double[] b;

        a(double d, double[] dArr) {
            this.a = d;
            this.b = dArr;
        }

        @Override // defpackage.w1
        public double c(double d, int i) {
            return this.b[i];
        }

        @Override // defpackage.w1
        public void d(double d, double[] dArr) {
            double[] dArr2 = this.b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // defpackage.w1
        public void e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.b;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        @Override // defpackage.w1
        public double f(double d, int i) {
            return 0.0d;
        }

        @Override // defpackage.w1
        public void g(double d, double[] dArr) {
            for (int i = 0; i < this.b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // defpackage.w1
        public double[] h() {
            return new double[]{this.a};
        }
    }

    public static w1 a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new z1(dArr, dArr2);
        }
        if (i != 2) {
            return new y1(dArr, dArr2);
        }
        return new a(dArr[0], dArr2[0]);
    }

    public static w1 b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new v1(iArr, dArr, dArr2);
    }

    public abstract double c(double d, int i);

    public abstract void d(double d, double[] dArr);

    public abstract void e(double d, float[] fArr);

    public abstract double f(double d, int i);

    public abstract void g(double d, double[] dArr);

    public abstract double[] h();
}
