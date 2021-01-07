package defpackage;

import androidx.constraintlayout.motion.widget.f;
import androidx.constraintlayout.motion.widget.q;

/* renamed from: c2  reason: default package */
public class c2 {
    float a;
    float b;
    float c;
    float d;
    float e;
    float f;

    public void a(float f2, float f3, int i, int i2, float[] fArr) {
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = (f3 - 0.5f) * 2.0f;
        float f8 = f4 + this.c;
        float f9 = f5 + this.d;
        float f10 = (this.a * f6) + f8;
        float f11 = (this.b * f7) + f9;
        float radians = (float) Math.toRadians((double) this.f);
        float radians2 = (float) Math.toRadians((double) this.e);
        double d2 = (double) (((float) (-i)) * f6);
        double d3 = (double) radians;
        double sin = Math.sin(d3);
        Double.isNaN(d2);
        double d4 = sin * d2;
        double d5 = (double) (((float) i2) * f7);
        double cos = Math.cos(d3);
        Double.isNaN(d5);
        double d6 = (double) (((float) i) * f6);
        double cos2 = Math.cos(d3);
        Double.isNaN(d6);
        double d7 = cos2 * d6;
        double sin2 = Math.sin(d3);
        Double.isNaN(d5);
        fArr[0] = (((float) (d4 - (cos * d5))) * radians2) + f10;
        fArr[1] = (radians2 * ((float) (d7 - (sin2 * d5)))) + f11;
    }

    public void b() {
        this.e = 0.0f;
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.a = 0.0f;
    }

    public void c(f fVar, float f2) {
        if (fVar != null) {
            this.e = fVar.b(f2);
        }
    }

    public void d(q qVar, float f2) {
        if (qVar != null) {
            this.e = qVar.b(f2);
            this.f = qVar.a(f2);
        }
    }

    public void e(f fVar, f fVar2, float f2) {
        if (fVar != null || fVar2 != null) {
            if (fVar == null) {
                this.a = fVar.b(f2);
            }
            if (fVar2 == null) {
                this.b = fVar2.b(f2);
            }
        }
    }

    public void f(q qVar, q qVar2, float f2) {
        if (qVar != null) {
            this.a = qVar.b(f2);
        }
        if (qVar2 != null) {
            this.b = qVar2.b(f2);
        }
    }

    public void g(f fVar, f fVar2, float f2) {
        if (fVar != null) {
            this.c = fVar.b(f2);
        }
        if (fVar2 != null) {
            this.d = fVar2.b(f2);
        }
    }

    public void h(q qVar, q qVar2, float f2) {
        if (qVar != null) {
            this.c = qVar.b(f2);
        }
        if (qVar2 != null) {
            this.d = qVar2.b(f2);
        }
    }
}
