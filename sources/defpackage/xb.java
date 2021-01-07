package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.layer.b;
import defpackage.jb;
import java.util.Collections;

/* renamed from: xb  reason: default package */
public class xb {
    private final Matrix a = new Matrix();
    private final Matrix b;
    private final Matrix c;
    private final Matrix d;
    private final float[] e;
    private jb<PointF, PointF> f;
    private jb<?, PointF> g;
    private jb<ie, ie> h;
    private jb<Float, Float> i;
    private jb<Integer, Integer> j;
    private lb k;
    private lb l;
    private jb<?, Float> m;
    private jb<?, Float> n;

    public xb(mc mcVar) {
        this.f = mcVar.b() == null ? null : mcVar.b().a();
        this.g = mcVar.e() == null ? null : mcVar.e().a();
        this.h = mcVar.g() == null ? null : mcVar.g().a();
        this.i = mcVar.f() == null ? null : mcVar.f().a();
        lb lbVar = mcVar.h() == null ? null : (lb) mcVar.h().a();
        this.k = lbVar;
        if (lbVar != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.l = mcVar.i() == null ? null : (lb) mcVar.i().a();
        if (mcVar.d() != null) {
            this.j = mcVar.d().a();
        }
        if (mcVar.j() != null) {
            this.m = mcVar.j().a();
        } else {
            this.m = null;
        }
        if (mcVar.c() != null) {
            this.n = mcVar.c().a();
        } else {
            this.n = null;
        }
    }

    private void d() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.e[i2] = 0.0f;
        }
    }

    public void a(b bVar) {
        bVar.i(this.j);
        bVar.i(this.m);
        bVar.i(this.n);
        bVar.i(this.f);
        bVar.i(this.g);
        bVar.i(this.h);
        bVar.i(this.i);
        bVar.i(this.k);
        bVar.i(this.l);
    }

    public void b(jb.b bVar) {
        jb<Integer, Integer> jbVar = this.j;
        if (jbVar != null) {
            jbVar.a.add(bVar);
        }
        jb<?, Float> jbVar2 = this.m;
        if (jbVar2 != null) {
            jbVar2.a.add(bVar);
        }
        jb<?, Float> jbVar3 = this.n;
        if (jbVar3 != null) {
            jbVar3.a.add(bVar);
        }
        jb<PointF, PointF> jbVar4 = this.f;
        if (jbVar4 != null) {
            jbVar4.a.add(bVar);
        }
        jb<?, PointF> jbVar5 = this.g;
        if (jbVar5 != null) {
            jbVar5.a.add(bVar);
        }
        jb<ie, ie> jbVar6 = this.h;
        if (jbVar6 != null) {
            jbVar6.a.add(bVar);
        }
        jb<Float, Float> jbVar7 = this.i;
        if (jbVar7 != null) {
            jbVar7.a.add(bVar);
        }
        lb lbVar = this.k;
        if (lbVar != null) {
            lbVar.a.add(bVar);
        }
        lb lbVar2 = this.l;
        if (lbVar2 != null) {
            lbVar2.a.add(bVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: he<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> boolean c(T t, he<T> heVar) {
        lb lbVar;
        lb lbVar2;
        jb<?, Float> jbVar;
        jb<?, Float> jbVar2;
        if (t == k.e) {
            jb<PointF, PointF> jbVar3 = this.f;
            if (jbVar3 == null) {
                this.f = new yb(heVar, new PointF());
                return true;
            }
            he<A> heVar2 = jbVar3.e;
            jbVar3.e = heVar;
            return true;
        } else if (t == k.f) {
            jb<?, PointF> jbVar4 = this.g;
            if (jbVar4 == null) {
                this.g = new yb(heVar, new PointF());
                return true;
            }
            he<A> heVar3 = jbVar4.e;
            jbVar4.e = heVar;
            return true;
        } else if (t == k.k) {
            jb<ie, ie> jbVar5 = this.h;
            if (jbVar5 == null) {
                this.h = new yb(heVar, new ie());
                return true;
            }
            he<A> heVar4 = jbVar5.e;
            jbVar5.e = heVar;
            return true;
        } else if (t == k.l) {
            jb<Float, Float> jbVar6 = this.i;
            if (jbVar6 == null) {
                this.i = new yb(heVar, Float.valueOf(0.0f));
                return true;
            }
            he<A> heVar5 = jbVar6.e;
            jbVar6.e = heVar;
            return true;
        } else if (t == k.c) {
            jb<Integer, Integer> jbVar7 = this.j;
            if (jbVar7 == null) {
                this.j = new yb(heVar, 100);
                return true;
            }
            he<A> heVar6 = jbVar7.e;
            jbVar7.e = heVar;
            return true;
        } else if (t != k.y || (jbVar2 = this.m) == null) {
            if (t != k.z || (jbVar = this.n) == null) {
                if (t == k.m && (lbVar2 = this.k) != null) {
                    if (lbVar2 == null) {
                        this.k = new lb(Collections.singletonList(new fe(Float.valueOf(0.0f))));
                    }
                    lb lbVar3 = this.k;
                    he<A> heVar7 = lbVar3.e;
                    lbVar3.e = heVar;
                    return true;
                } else if (t != k.n || (lbVar = this.l) == null) {
                    return false;
                } else {
                    if (lbVar == null) {
                        this.l = new lb(Collections.singletonList(new fe(Float.valueOf(0.0f))));
                    }
                    lb lbVar4 = this.l;
                    he<A> heVar8 = lbVar4.e;
                    lbVar4.e = heVar;
                    return true;
                }
            } else if (jbVar == null) {
                this.n = new yb(heVar, 100);
                return true;
            } else {
                he<A> heVar9 = jbVar.e;
                jbVar.e = heVar;
                return true;
            }
        } else if (jbVar2 == null) {
            this.m = new yb(heVar, 100);
            return true;
        } else {
            he<A> heVar10 = jbVar2.e;
            jbVar2.e = heVar;
            return true;
        }
    }

    public jb<?, Float> e() {
        return this.n;
    }

    public Matrix f() {
        float f2;
        this.a.reset();
        jb<?, PointF> jbVar = this.g;
        if (jbVar != null) {
            PointF g2 = jbVar.g();
            float f3 = g2.x;
            if (!(f3 == 0.0f && g2.y == 0.0f)) {
                this.a.preTranslate(f3, g2.y);
            }
        }
        jb<Float, Float> jbVar2 = this.i;
        if (jbVar2 != null) {
            if (jbVar2 instanceof yb) {
                f2 = jbVar2.g().floatValue();
            } else {
                f2 = ((lb) jbVar2).m();
            }
            if (f2 != 0.0f) {
                this.a.preRotate(f2);
            }
        }
        if (this.k != null) {
            lb lbVar = this.l;
            float cos = lbVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-lbVar.m()) + 90.0f)));
            lb lbVar2 = this.l;
            float sin = lbVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-lbVar2.m()) + 90.0f)));
            d();
            float[] fArr = this.e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f4 = -sin;
            fArr[3] = f4;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            d();
            float[] fArr2 = this.e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians((double) this.k.m()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.c.setValues(fArr2);
            d();
            float[] fArr3 = this.e;
            fArr3[0] = cos;
            fArr3[1] = f4;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.d.setValues(fArr3);
            this.c.preConcat(this.b);
            this.d.preConcat(this.c);
            this.a.preConcat(this.d);
        }
        jb<ie, ie> jbVar3 = this.h;
        if (jbVar3 != null) {
            ie g3 = jbVar3.g();
            if (!(g3.b() == 1.0f && g3.c() == 1.0f)) {
                this.a.preScale(g3.b(), g3.c());
            }
        }
        jb<PointF, PointF> jbVar4 = this.f;
        if (jbVar4 != null) {
            PointF g4 = jbVar4.g();
            float f5 = g4.x;
            if (!(f5 == 0.0f && g4.y == 0.0f)) {
                this.a.preTranslate(-f5, -g4.y);
            }
        }
        return this.a;
    }

    public Matrix g(float f2) {
        jb<?, PointF> jbVar = this.g;
        PointF pointF = null;
        PointF g2 = jbVar == null ? null : jbVar.g();
        jb<ie, ie> jbVar2 = this.h;
        ie g3 = jbVar2 == null ? null : jbVar2.g();
        this.a.reset();
        if (g2 != null) {
            this.a.preTranslate(g2.x * f2, g2.y * f2);
        }
        if (g3 != null) {
            double d2 = (double) f2;
            this.a.preScale((float) Math.pow((double) g3.b(), d2), (float) Math.pow((double) g3.c(), d2));
        }
        jb<Float, Float> jbVar3 = this.i;
        if (jbVar3 != null) {
            float floatValue = jbVar3.g().floatValue();
            jb<PointF, PointF> jbVar4 = this.f;
            if (jbVar4 != null) {
                pointF = jbVar4.g();
            }
            Matrix matrix = this.a;
            float f3 = floatValue * f2;
            float f4 = 0.0f;
            float f5 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f4 = pointF.y;
            }
            matrix.preRotate(f3, f5, f4);
        }
        return this.a;
    }

    public jb<?, Integer> h() {
        return this.j;
    }

    public jb<?, Float> i() {
        return this.m;
    }

    public void j(float f2) {
        jb<Integer, Integer> jbVar = this.j;
        if (jbVar != null) {
            jbVar.k(f2);
        }
        jb<?, Float> jbVar2 = this.m;
        if (jbVar2 != null) {
            jbVar2.k(f2);
        }
        jb<?, Float> jbVar3 = this.n;
        if (jbVar3 != null) {
            jbVar3.k(f2);
        }
        jb<PointF, PointF> jbVar4 = this.f;
        if (jbVar4 != null) {
            jbVar4.k(f2);
        }
        jb<?, PointF> jbVar5 = this.g;
        if (jbVar5 != null) {
            jbVar5.k(f2);
        }
        jb<ie, ie> jbVar6 = this.h;
        if (jbVar6 != null) {
            jbVar6.k(f2);
        }
        jb<Float, Float> jbVar7 = this.i;
        if (jbVar7 != null) {
            jbVar7.k(f2);
        }
        lb lbVar = this.k;
        if (lbVar != null) {
            lbVar.k(f2);
        }
        lb lbVar2 = this.l;
        if (lbVar2 != null) {
            lbVar2.k(f2);
        }
    }
}
