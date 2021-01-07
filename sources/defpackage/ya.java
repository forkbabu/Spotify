package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.c;
import com.airbnb.lottie.model.content.e;
import com.airbnb.lottie.model.layer.b;

/* renamed from: ya  reason: default package */
public class ya extends qa {
    private final String o;
    private final boolean p;
    private final q1<LinearGradient> q = new q1<>(10);
    private final q1<RadialGradient> r = new q1<>(10);
    private final RectF s = new RectF();
    private final GradientType t;
    private final int u;
    private final jb<c, c> v;
    private final jb<PointF, PointF> w;
    private final jb<PointF, PointF> x;
    private yb y;

    public ya(f fVar, b bVar, e eVar) {
        super(fVar, bVar, eVar.b().d(), eVar.g().d(), eVar.i(), eVar.k(), eVar.m(), eVar.h(), eVar.c());
        this.o = eVar.j();
        this.t = eVar.f();
        this.p = eVar.n();
        this.u = (int) (fVar.l().d() / 32.0f);
        jb<c, c> a = eVar.e().a();
        this.v = a;
        a.a(this);
        bVar.i(a);
        jb<PointF, PointF> a2 = eVar.l().a();
        this.w = a2;
        a2.a(this);
        bVar.i(a2);
        jb<PointF, PointF> a3 = eVar.d().a();
        this.x = a3;
        a3.a(this);
        bVar.i(a3);
    }

    private int[] f(int[] iArr) {
        yb ybVar = this.y;
        if (ybVar != null) {
            Integer[] numArr = (Integer[]) ybVar.g();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int h() {
        int round = Math.round(this.w.f() * ((float) this.u));
        int round2 = Math.round(this.x.f() * ((float) this.u));
        int round3 = Math.round(this.v.f() * ((float) this.u));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qa, com.airbnb.lottie.model.e
    public <T> void c(T t2, he<T> heVar) {
        super.c(t2, heVar);
        if (t2 == k.D) {
            yb ybVar = this.y;
            if (ybVar != null) {
                this.f.p(ybVar);
            }
            if (heVar == null) {
                this.y = null;
                return;
            }
            yb ybVar2 = new yb(heVar, null);
            this.y = ybVar2;
            ybVar2.a(this);
            this.f.i(this.y);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: q1<android.graphics.RadialGradient> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v14, resolved type: q1<android.graphics.LinearGradient> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qa, defpackage.ua
    public void g(Canvas canvas, Matrix matrix, int i) {
        RadialGradient radialGradient;
        if (!this.p) {
            e(this.s, matrix, false);
            if (this.t == GradientType.LINEAR) {
                long h = (long) h();
                radialGradient = this.q.g(h);
                if (radialGradient == null) {
                    PointF g = this.w.g();
                    PointF g2 = this.x.g();
                    c g3 = this.v.g();
                    radialGradient = new LinearGradient(g.x, g.y, g2.x, g2.y, f(g3.a()), g3.b(), Shader.TileMode.CLAMP);
                    this.q.o(h, radialGradient);
                }
            } else {
                long h2 = (long) h();
                radialGradient = this.r.g(h2);
                if (radialGradient == null) {
                    PointF g4 = this.w.g();
                    PointF g5 = this.x.g();
                    c g6 = this.v.g();
                    int[] f = f(g6.a());
                    float[] b = g6.b();
                    float f2 = g4.x;
                    float f3 = g4.y;
                    radialGradient = new RadialGradient(f2, f3, (float) Math.hypot((double) (g5.x - f2), (double) (g5.y - f3)), f, b, Shader.TileMode.CLAMP);
                    this.r.o(h2, radialGradient);
                }
            }
            radialGradient.setLocalMatrix(matrix);
            this.i.setShader(radialGradient);
            super.g(canvas, matrix, i);
        }
    }

    @Override // defpackage.sa
    public String getName() {
        return this.o;
    }
}
