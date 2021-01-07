package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.c;
import com.airbnb.lottie.model.content.d;
import com.airbnb.lottie.model.layer.b;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import defpackage.jb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xa  reason: default package */
public class xa implements ua, jb.b, ab {
    private final String a;
    private final boolean b;
    private final b c;
    private final q1<LinearGradient> d = new q1<>(10);
    private final q1<RadialGradient> e = new q1<>(10);
    private final Path f;
    private final Paint g;
    private final RectF h;
    private final List<cb> i;
    private final GradientType j;
    private final jb<c, c> k;
    private final jb<Integer, Integer> l;
    private final jb<PointF, PointF> m;
    private final jb<PointF, PointF> n;
    private jb<ColorFilter, ColorFilter> o;
    private yb p;
    private final f q;
    private final int r;

    public xa(f fVar, b bVar, d dVar) {
        Path path = new Path();
        this.f = path;
        this.g = new pa(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.c = bVar;
        this.a = dVar.f();
        this.b = dVar.i();
        this.q = fVar;
        this.j = dVar.e();
        path.setFillType(dVar.c());
        this.r = (int) (fVar.l().d() / 32.0f);
        jb<c, c> a2 = dVar.d().a();
        this.k = a2;
        a2.a(this);
        bVar.i(a2);
        jb<Integer, Integer> a3 = dVar.g().a();
        this.l = a3;
        a3.a(this);
        bVar.i(a3);
        jb<PointF, PointF> a4 = dVar.h().a();
        this.m = a4;
        a4.a(this);
        bVar.i(a4);
        jb<PointF, PointF> a5 = dVar.b().a();
        this.n = a5;
        a5.a(this);
        bVar.i(a5);
    }

    private int[] f(int[] iArr) {
        yb ybVar = this.p;
        if (ybVar != null) {
            Integer[] numArr = (Integer[]) ybVar.g();
            int i2 = 0;
            if (iArr.length == numArr.length) {
                while (i2 < iArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i2 < numArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr;
    }

    private int h() {
        int round = Math.round(this.m.f() * ((float) this.r));
        int round2 = Math.round(this.n.f() * ((float) this.r));
        int round3 = Math.round(this.k.f() * ((float) this.r));
        int i2 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        return round3 != 0 ? i2 * 31 * round3 : i2;
    }

    @Override // defpackage.jb.b
    public void a() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.sa
    public void b(List<sa> list, List<sa> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            sa saVar = list2.get(i2);
            if (saVar instanceof cb) {
                this.i.add((cb) saVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.e
    public <T> void c(T t, he<T> heVar) {
        if (t == k.d) {
            this.l.l(heVar);
        } else if (t == k.C) {
            jb<ColorFilter, ColorFilter> jbVar = this.o;
            if (jbVar != null) {
                this.c.p(jbVar);
            }
            if (heVar == null) {
                this.o = null;
                return;
            }
            yb ybVar = new yb(heVar, null);
            this.o = ybVar;
            ybVar.a(this);
            this.c.i(this.o);
        } else if (t == k.D) {
            yb ybVar2 = this.p;
            if (ybVar2 != null) {
                this.c.p(ybVar2);
            }
            if (heVar == null) {
                this.p = null;
                return;
            }
            yb ybVar3 = new yb(heVar, null);
            this.p = ybVar3;
            ybVar3.a(this);
            this.c.i(this.p);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void d(com.airbnb.lottie.model.d dVar, int i2, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        de.g(dVar, i2, list, dVar2, this);
    }

    @Override // defpackage.ua
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(this.i.get(i2).o(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v19, resolved type: q1<android.graphics.RadialGradient> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ua
    public void g(Canvas canvas, Matrix matrix, int i2) {
        RadialGradient radialGradient;
        if (!this.b) {
            this.f.reset();
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                this.f.addPath(this.i.get(i3).o(), matrix);
            }
            this.f.computeBounds(this.h, false);
            if (this.j == GradientType.LINEAR) {
                long h2 = (long) h();
                radialGradient = this.d.g(h2);
                if (radialGradient == null) {
                    PointF g2 = this.m.g();
                    PointF g3 = this.n.g();
                    c g4 = this.k.g();
                    LinearGradient linearGradient = new LinearGradient(g2.x, g2.y, g3.x, g3.y, f(g4.a()), g4.b(), Shader.TileMode.CLAMP);
                    this.d.o(h2, linearGradient);
                    radialGradient = linearGradient;
                }
            } else {
                long h3 = (long) h();
                radialGradient = this.e.g(h3);
                if (radialGradient == null) {
                    PointF g5 = this.m.g();
                    PointF g6 = this.n.g();
                    c g7 = this.k.g();
                    int[] f2 = f(g7.a());
                    float[] b2 = g7.b();
                    float f3 = g5.x;
                    float f4 = g5.y;
                    float hypot = (float) Math.hypot((double) (g6.x - f3), (double) (g6.y - f4));
                    radialGradient = new RadialGradient(f3, f4, hypot <= 0.0f ? 0.001f : hypot, f2, b2, Shader.TileMode.CLAMP);
                    this.e.o(h3, radialGradient);
                }
            }
            radialGradient.setLocalMatrix(matrix);
            this.g.setShader(radialGradient);
            jb<ColorFilter, ColorFilter> jbVar = this.o;
            if (jbVar != null) {
                this.g.setColorFilter(jbVar.g());
            }
            this.g.setAlpha(de.c((int) ((((((float) i2) / 255.0f) * ((float) this.l.g().intValue())) / 100.0f) * 255.0f), 0, BitmapRenderer.ALPHA_VISIBLE));
            canvas.drawPath(this.f, this.g);
            com.airbnb.lottie.c.a("GradientFillContent#draw");
        }
    }

    @Override // defpackage.sa
    public String getName() {
        return this.a;
    }
}
