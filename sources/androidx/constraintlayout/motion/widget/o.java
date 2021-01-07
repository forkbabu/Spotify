package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.b;
import java.util.LinkedHashMap;

/* access modifiers changed from: package-private */
public class o implements Comparable<o> {
    static String[] x = {"position", "x", "y", "width", "height", "pathRotate"};
    x1 a;
    int b;
    float c;
    float f;
    float n;
    float o;
    float p;
    float q;
    float r;
    int s;
    LinkedHashMap<String, ConstraintAttribute> t;
    int u;
    double[] v;
    double[] w;

    public o() {
        this.b = 0;
        this.r = Float.NaN;
        this.s = -1;
        this.t = new LinkedHashMap<>();
        this.u = 0;
        this.v = new double[18];
        this.w = new double[18];
    }

    private boolean g(float f2, float f3) {
        if (Float.isNaN(f2) || Float.isNaN(f3)) {
            if (Float.isNaN(f2) != Float.isNaN(f3)) {
                return true;
            }
            return false;
        } else if (Math.abs(f2 - f3) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(o oVar) {
        return Float.compare(this.f, oVar.f);
    }

    public void d(b.a aVar) {
        this.a = x1.c(aVar.c.c);
        b.c cVar = aVar.c;
        this.s = cVar.d;
        this.r = cVar.g;
        this.b = cVar.e;
        float f2 = aVar.b.e;
        for (String str : aVar.f.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f.get(str);
            if (constraintAttribute.b() != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.t.put(str, constraintAttribute);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(o oVar, boolean[] zArr, boolean z) {
        zArr[0] = zArr[0] | g(this.f, oVar.f);
        zArr[1] = zArr[1] | g(this.n, oVar.n) | z;
        zArr[2] = z | g(this.o, oVar.o) | zArr[2];
        zArr[3] = zArr[3] | g(this.p, oVar.p);
        zArr[4] = g(this.q, oVar.q) | zArr[4];
    }

    /* access modifiers changed from: package-private */
    public void i(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f2 = this.n;
        float f3 = this.o;
        float f4 = this.p;
        float f5 = this.q;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f6 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f2 = f6;
            } else if (i3 == 2) {
                f3 = f6;
            } else if (i3 == 3) {
                f4 = f6;
            } else if (i3 == 4) {
                f5 = f6;
            }
        }
        fArr[i] = (f4 / 2.0f) + f2 + 0.0f;
        fArr[i + 1] = (f5 / 2.0f) + f3 + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void k(float f2, float f3, float f4, float f5) {
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = f5;
    }

    /* access modifiers changed from: package-private */
    public void l(float f2, float f3, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f8 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f4 = f8;
            } else if (i2 == 2) {
                f6 = f8;
            } else if (i2 == 3) {
                f5 = f8;
            } else if (i2 == 4) {
                f7 = f8;
            }
        }
        float f9 = f4 - ((0.0f * f5) / 2.0f);
        float f10 = f6 - ((0.0f * f7) / 2.0f);
        fArr[0] = (((f5 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
        fArr[1] = (((f7 * 1.0f) + f10) * f3) + ((1.0f - f3) * f10) + 0.0f;
    }

    public o(int i, int i2, h hVar, o oVar, o oVar2) {
        this.b = 0;
        this.r = Float.NaN;
        this.s = -1;
        this.t = new LinkedHashMap<>();
        this.u = 0;
        this.v = new double[18];
        this.w = new double[18];
        int i3 = hVar.m;
        if (i3 == 1) {
            float f2 = ((float) hVar.a) / 100.0f;
            this.c = f2;
            this.b = hVar.h;
            float f3 = Float.isNaN(hVar.i) ? f2 : hVar.i;
            float f4 = Float.isNaN(hVar.j) ? f2 : hVar.j;
            float f5 = oVar2.p - oVar.p;
            float f6 = oVar2.q - oVar.q;
            this.f = this.c;
            f2 = !Float.isNaN(hVar.k) ? hVar.k : f2;
            float f7 = oVar.n;
            float f8 = oVar.p;
            float f9 = oVar.o;
            float f10 = oVar.q;
            float f11 = ((oVar2.p / 2.0f) + oVar2.n) - ((f8 / 2.0f) + f7);
            float f12 = ((oVar2.q / 2.0f) + oVar2.o) - ((f10 / 2.0f) + f9);
            float f13 = f11 * f2;
            float f14 = f5 * f3;
            float f15 = f14 / 2.0f;
            this.n = (float) ((int) ((f7 + f13) - f15));
            float f16 = f2 * f12;
            float f17 = f6 * f4;
            float f18 = f17 / 2.0f;
            this.o = (float) ((int) ((f9 + f16) - f18));
            this.p = (float) ((int) (f8 + f14));
            this.q = (float) ((int) (f10 + f17));
            float f19 = Float.isNaN(hVar.l) ? 0.0f : hVar.l;
            this.u = 1;
            float f20 = (float) ((int) ((oVar.n + f13) - f15));
            this.n = f20;
            float f21 = (float) ((int) ((oVar.o + f16) - f18));
            this.o = f21;
            this.n = f20 + ((-f12) * f19);
            this.o = f21 + (f11 * f19);
            this.a = x1.c(hVar.f);
            this.s = hVar.g;
        } else if (i3 != 2) {
            float f22 = ((float) hVar.a) / 100.0f;
            this.c = f22;
            this.b = hVar.h;
            float f23 = Float.isNaN(hVar.i) ? f22 : hVar.i;
            float f24 = Float.isNaN(hVar.j) ? f22 : hVar.j;
            float f25 = oVar2.p;
            float f26 = oVar.p;
            float f27 = f25 - f26;
            float f28 = oVar2.q;
            float f29 = oVar.q;
            float f30 = f28 - f29;
            this.f = this.c;
            float f31 = oVar.n;
            float f32 = oVar.o;
            float f33 = ((f25 / 2.0f) + oVar2.n) - ((f26 / 2.0f) + f31);
            float f34 = ((f28 / 2.0f) + oVar2.o) - ((f29 / 2.0f) + f32);
            float f35 = f27 * f23;
            float f36 = f35 / 2.0f;
            this.n = (float) ((int) (((f33 * f22) + f31) - f36));
            float f37 = (f34 * f22) + f32;
            float f38 = f30 * f24;
            float f39 = f38 / 2.0f;
            this.o = (float) ((int) (f37 - f39));
            this.p = (float) ((int) (f26 + f35));
            this.q = (float) ((int) (f29 + f38));
            float f40 = Float.isNaN(hVar.k) ? f22 : hVar.k;
            float f41 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
            f22 = !Float.isNaN(hVar.l) ? hVar.l : f22;
            float f42 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
            this.u = 2;
            this.n = (float) ((int) (((f42 * f34) + ((f40 * f33) + oVar.n)) - f36));
            this.o = (float) ((int) (((f34 * f22) + ((f33 * f41) + oVar.o)) - f39));
            this.a = x1.c(hVar.f);
            this.s = hVar.g;
        } else {
            float f43 = ((float) hVar.a) / 100.0f;
            this.c = f43;
            this.b = hVar.h;
            float f44 = Float.isNaN(hVar.i) ? f43 : hVar.i;
            float f45 = Float.isNaN(hVar.j) ? f43 : hVar.j;
            float f46 = oVar2.p;
            float f47 = oVar.p;
            float f48 = f46 - f47;
            float f49 = oVar2.q;
            float f50 = oVar.q;
            float f51 = f49 - f50;
            this.f = this.c;
            float f52 = oVar.n;
            float f53 = oVar.o;
            float f54 = (f46 / 2.0f) + oVar2.n;
            float f55 = (f49 / 2.0f) + oVar2.o;
            float f56 = f48 * f44;
            this.n = (float) ((int) ((((f54 - ((f47 / 2.0f) + f52)) * f43) + f52) - (f56 / 2.0f)));
            float f57 = f51 * f45;
            this.o = (float) ((int) ((((f55 - ((f50 / 2.0f) + f53)) * f43) + f53) - (f57 / 2.0f)));
            this.p = (float) ((int) (f47 + f56));
            this.q = (float) ((int) (f50 + f57));
            this.u = 3;
            if (!Float.isNaN(hVar.k)) {
                this.n = (float) ((int) (hVar.k * ((float) ((int) (((float) i) - this.p)))));
            }
            if (!Float.isNaN(hVar.l)) {
                this.o = (float) ((int) (hVar.l * ((float) ((int) (((float) i2) - this.q)))));
            }
            this.a = x1.c(hVar.f);
            this.s = hVar.g;
        }
    }
}
