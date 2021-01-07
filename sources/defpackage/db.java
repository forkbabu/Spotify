package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.layer.b;
import defpackage.jb;
import java.util.List;

/* renamed from: db  reason: default package */
public class db implements cb, jb.b, ab {
    private final Path a = new Path();
    private final String b;
    private final f c;
    private final PolystarShape.Type d;
    private final boolean e;
    private final jb<?, Float> f;
    private final jb<?, PointF> g;
    private final jb<?, Float> h;
    private final jb<?, Float> i;
    private final jb<?, Float> j;
    private final jb<?, Float> k;
    private final jb<?, Float> l;
    private ra m = new ra();
    private boolean n;

    public db(f fVar, b bVar, PolystarShape polystarShape) {
        this.c = fVar;
        this.b = polystarShape.d();
        PolystarShape.Type j2 = polystarShape.j();
        this.d = j2;
        this.e = polystarShape.k();
        jb<Float, Float> a2 = polystarShape.g().a();
        this.f = a2;
        jb<PointF, PointF> a3 = polystarShape.h().a();
        this.g = a3;
        jb<Float, Float> a4 = polystarShape.i().a();
        this.h = a4;
        jb<Float, Float> a5 = polystarShape.e().a();
        this.j = a5;
        jb<Float, Float> a6 = polystarShape.f().a();
        this.l = a6;
        PolystarShape.Type type = PolystarShape.Type.STAR;
        if (j2 == type) {
            this.i = polystarShape.b().a();
            this.k = polystarShape.c().a();
        } else {
            this.i = null;
            this.k = null;
        }
        bVar.i(a2);
        bVar.i(a3);
        bVar.i(a4);
        bVar.i(a5);
        bVar.i(a6);
        if (j2 == type) {
            bVar.i(this.i);
            bVar.i(this.k);
        }
        a2.a(this);
        a3.a(this);
        a4.a(this);
        a5.a(this);
        a6.a(this);
        if (j2 == type) {
            this.i.a(this);
            this.k.a(this);
        }
    }

    @Override // defpackage.jb.b
    public void a() {
        this.n = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.sa
    public void b(List<sa> list, List<sa> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            sa saVar = list.get(i2);
            if (saVar instanceof ib) {
                ib ibVar = (ib) saVar;
                if (ibVar.i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.m.a(ibVar);
                    ibVar.c(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void c(T t, he<T> heVar) {
        jb<?, Float> jbVar;
        jb<?, Float> jbVar2;
        if (t == k.s) {
            this.f.l(heVar);
        } else if (t == k.t) {
            this.h.l(heVar);
        } else if (t == k.j) {
            this.g.l(heVar);
        } else if (t == k.u && (jbVar2 = this.i) != null) {
            jbVar2.l(heVar);
        } else if (t == k.v) {
            this.j.l(heVar);
        } else if (t == k.w && (jbVar = this.k) != null) {
            jbVar.l(heVar);
        } else if (t == k.x) {
            this.l.l(heVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void d(d dVar, int i2, List<d> list, d dVar2) {
        de.g(dVar, i2, list, dVar2, this);
    }

    @Override // defpackage.sa
    public String getName() {
        return this.b;
    }

    @Override // defpackage.cb
    public Path o() {
        float f2;
        float f3;
        float f4;
        float f5;
        double d2;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        double d3;
        float f11;
        float f12;
        float f13;
        double d4;
        double d5;
        double d6;
        if (this.n) {
            return this.a;
        }
        this.a.reset();
        if (this.e) {
            this.n = true;
            return this.a;
        }
        int ordinal = this.d.ordinal();
        double d7 = 0.0d;
        if (ordinal == 0) {
            float floatValue = this.f.g().floatValue();
            jb<?, Float> jbVar = this.h;
            if (jbVar != null) {
                d7 = (double) jbVar.g().floatValue();
            }
            double radians = Math.toRadians(d7 - 90.0d);
            double d8 = (double) floatValue;
            Double.isNaN(d8);
            Double.isNaN(d8);
            float f14 = (float) (6.283185307179586d / d8);
            float f15 = f14 / 2.0f;
            float f16 = floatValue - ((float) ((int) floatValue));
            if (f16 != 0.0f) {
                double d9 = (double) ((1.0f - f16) * f15);
                Double.isNaN(d9);
                Double.isNaN(d9);
                radians += d9;
            }
            float floatValue2 = this.j.g().floatValue();
            float floatValue3 = this.i.g().floatValue();
            jb<?, Float> jbVar2 = this.k;
            float floatValue4 = jbVar2 != null ? jbVar2.g().floatValue() / 100.0f : 0.0f;
            jb<?, Float> jbVar3 = this.l;
            float floatValue5 = jbVar3 != null ? jbVar3.g().floatValue() / 100.0f : 0.0f;
            if (f16 != 0.0f) {
                f6 = je.a(floatValue2, floatValue3, f16, floatValue3);
                double d10 = (double) f6;
                double cos = Math.cos(radians);
                Double.isNaN(d10);
                Double.isNaN(d10);
                f3 = floatValue3;
                f2 = floatValue4;
                f5 = (float) (cos * d10);
                double sin = Math.sin(radians);
                Double.isNaN(d10);
                Double.isNaN(d10);
                f4 = (float) (d10 * sin);
                this.a.moveTo(f5, f4);
                double d11 = (double) ((f14 * f16) / 2.0f);
                Double.isNaN(d11);
                Double.isNaN(d11);
                d2 = radians + d11;
            } else {
                f3 = floatValue3;
                f2 = floatValue4;
                double d12 = (double) floatValue2;
                double cos2 = Math.cos(radians);
                Double.isNaN(d12);
                Double.isNaN(d12);
                float f17 = (float) (cos2 * d12);
                double sin2 = Math.sin(radians);
                Double.isNaN(d12);
                Double.isNaN(d12);
                f4 = (float) (sin2 * d12);
                this.a.moveTo(f17, f4);
                double d13 = (double) f15;
                Double.isNaN(d13);
                Double.isNaN(d13);
                d2 = radians + d13;
                f5 = f17;
                f6 = 0.0f;
            }
            double ceil = Math.ceil(d8) * 2.0d;
            int i2 = 0;
            boolean z = false;
            while (true) {
                double d14 = (double) i2;
                if (d14 >= ceil) {
                    break;
                }
                float f18 = z ? floatValue2 : f3;
                if (f6 == 0.0f || d14 != ceil - 2.0d) {
                    f7 = f14;
                    f8 = f15;
                } else {
                    f7 = f14;
                    f8 = (f14 * f16) / 2.0f;
                }
                if (f6 == 0.0f || d14 != ceil - 1.0d) {
                    f9 = f6;
                    f6 = f18;
                } else {
                    f9 = f6;
                }
                double d15 = (double) f6;
                double cos3 = Math.cos(d2);
                Double.isNaN(d15);
                Double.isNaN(d15);
                float f19 = (float) (cos3 * d15);
                double sin3 = Math.sin(d2);
                Double.isNaN(d15);
                Double.isNaN(d15);
                float f20 = (float) (d15 * sin3);
                if (f2 == 0.0f && floatValue5 == 0.0f) {
                    this.a.lineTo(f19, f20);
                    f13 = f8;
                    f10 = f20;
                    f11 = floatValue2;
                    d3 = d2;
                    f12 = floatValue5;
                } else {
                    f11 = floatValue2;
                    d3 = d2;
                    double atan2 = (double) ((float) (Math.atan2((double) f4, (double) f5) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    f12 = floatValue5;
                    f10 = f20;
                    double atan22 = (double) ((float) (Math.atan2((double) f20, (double) f19) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    float f21 = z ? f2 : f12;
                    float f22 = z ? f12 : f2;
                    float f23 = (z ? f3 : f11) * f21 * 0.47829f;
                    float f24 = cos4 * f23;
                    float f25 = f23 * sin4;
                    float f26 = (z ? f11 : f3) * f22 * 0.47829f;
                    float f27 = cos5 * f26;
                    float f28 = f26 * sin5;
                    if (f16 != 0.0f) {
                        if (i2 == 0) {
                            f24 *= f16;
                            f25 *= f16;
                        } else if (d14 == ceil - 1.0d) {
                            f27 *= f16;
                            f28 *= f16;
                        }
                    }
                    this.a.cubicTo(f5 - f24, f4 - f25, f19 + f27, f10 + f28, f19, f10);
                    f13 = f8;
                }
                double d16 = (double) f13;
                Double.isNaN(d16);
                Double.isNaN(d16);
                d2 = d3 + d16;
                z = !z;
                i2++;
                floatValue5 = f12;
                f5 = f19;
                floatValue2 = f11;
                f15 = f15;
                f14 = f7;
                f6 = f9;
                f4 = f10;
            }
            PointF g2 = this.g.g();
            this.a.offset(g2.x, g2.y);
            this.a.close();
        } else if (ordinal == 1) {
            int floor = (int) Math.floor((double) this.f.g().floatValue());
            jb<?, Float> jbVar4 = this.h;
            if (jbVar4 != null) {
                d7 = (double) jbVar4.g().floatValue();
            }
            double radians2 = Math.toRadians(d7 - 90.0d);
            double d17 = (double) floor;
            Double.isNaN(d17);
            Double.isNaN(d17);
            float floatValue6 = this.l.g().floatValue() / 100.0f;
            float floatValue7 = this.j.g().floatValue();
            double d18 = (double) floatValue7;
            double cos6 = Math.cos(radians2);
            Double.isNaN(d18);
            Double.isNaN(d18);
            float f29 = (float) (cos6 * d18);
            double sin6 = Math.sin(radians2);
            Double.isNaN(d18);
            Double.isNaN(d18);
            float f30 = (float) (sin6 * d18);
            this.a.moveTo(f29, f30);
            double d19 = (double) ((float) (6.283185307179586d / d17));
            Double.isNaN(d19);
            Double.isNaN(d19);
            double d20 = radians2 + d19;
            double ceil2 = Math.ceil(d17);
            int i3 = 0;
            while (((double) i3) < ceil2) {
                double cos7 = Math.cos(d20);
                Double.isNaN(d18);
                Double.isNaN(d18);
                float f31 = (float) (cos7 * d18);
                double sin7 = Math.sin(d20);
                Double.isNaN(d18);
                Double.isNaN(d18);
                float f32 = (float) (sin7 * d18);
                if (floatValue6 != 0.0f) {
                    d6 = d18;
                    d5 = d20;
                    double atan23 = (double) ((float) (Math.atan2((double) f30, (double) f29) - 1.5707963267948966d));
                    float cos8 = (float) Math.cos(atan23);
                    d4 = d19;
                    double atan24 = (double) ((float) (Math.atan2((double) f32, (double) f31) - 1.5707963267948966d));
                    float f33 = floatValue7 * floatValue6 * 0.25f;
                    this.a.cubicTo(f29 - (cos8 * f33), f30 - (((float) Math.sin(atan23)) * f33), f31 + (((float) Math.cos(atan24)) * f33), f32 + (f33 * ((float) Math.sin(atan24))), f31, f32);
                } else {
                    d5 = d20;
                    d6 = d18;
                    d4 = d19;
                    this.a.lineTo(f31, f32);
                }
                Double.isNaN(d4);
                Double.isNaN(d4);
                d20 = d5 + d4;
                i3++;
                f30 = f32;
                f29 = f31;
                ceil2 = ceil2;
                d18 = d6;
                d19 = d4;
            }
            PointF g3 = this.g.g();
            this.a.offset(g3.x, g3.y);
            this.a.close();
        }
        this.a.close();
        this.m.b(this.a);
        this.n = true;
        return this.a;
    }
}
