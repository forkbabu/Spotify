package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.c;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import defpackage.jb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qa  reason: default package */
public abstract class qa implements jb.b, ab, ua {
    private final PathMeasure a = new PathMeasure();
    private final Path b = new Path();
    private final Path c = new Path();
    private final RectF d = new RectF();
    private final f e;
    protected final com.airbnb.lottie.model.layer.b f;
    private final List<b> g = new ArrayList();
    private final float[] h;
    final Paint i;
    private final jb<?, Float> j;
    private final jb<?, Integer> k;
    private final List<jb<?, Float>> l;
    private final jb<?, Float> m;
    private jb<ColorFilter, ColorFilter> n;

    /* access modifiers changed from: private */
    /* renamed from: qa$b */
    public static final class b {
        private final List<cb> a = new ArrayList();
        private final ib b;

        b(ib ibVar, a aVar) {
            this.b = ibVar;
        }
    }

    qa(f fVar, com.airbnb.lottie.model.layer.b bVar, Paint.Cap cap, Paint.Join join, float f2, ec ecVar, cc ccVar, List<cc> list, cc ccVar2) {
        pa paVar = new pa(1);
        this.i = paVar;
        this.e = fVar;
        this.f = bVar;
        paVar.setStyle(Paint.Style.STROKE);
        paVar.setStrokeCap(cap);
        paVar.setStrokeJoin(join);
        paVar.setStrokeMiter(f2);
        this.k = ecVar.a();
        this.j = ccVar.a();
        if (ccVar2 == null) {
            this.m = null;
        } else {
            this.m = ccVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.l.add(list.get(i2).a());
        }
        bVar.i(this.k);
        bVar.i(this.j);
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            bVar.i(this.l.get(i3));
        }
        jb<?, Float> jbVar = this.m;
        if (jbVar != null) {
            bVar.i(jbVar);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.l.get(i4).a(this);
        }
        jb<?, Float> jbVar2 = this.m;
        if (jbVar2 != null) {
            jbVar2.a(this);
        }
    }

    @Override // defpackage.jb.b
    public void a() {
        this.e.invalidateSelf();
    }

    @Override // defpackage.sa
    public void b(List<sa> list, List<sa> list2) {
        ShapeTrimPath.Type type = ShapeTrimPath.Type.INDIVIDUALLY;
        ib ibVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            sa saVar = list.get(size);
            if (saVar instanceof ib) {
                ib ibVar2 = (ib) saVar;
                if (ibVar2.i() == type) {
                    ibVar = ibVar2;
                }
            }
        }
        if (ibVar != null) {
            ibVar.c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            sa saVar2 = list2.get(size2);
            if (saVar2 instanceof ib) {
                ib ibVar3 = (ib) saVar2;
                if (ibVar3.i() == type) {
                    if (bVar != null) {
                        this.g.add(bVar);
                    }
                    bVar = new b(ibVar3, null);
                    ibVar3.c(this);
                }
            }
            if (saVar2 instanceof cb) {
                if (bVar == null) {
                    bVar = new b(ibVar, null);
                }
                bVar.a.add((cb) saVar2);
            }
        }
        if (bVar != null) {
            this.g.add(bVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void c(T t, he<T> heVar) {
        if (t == k.d) {
            this.k.l(heVar);
        } else if (t == k.o) {
            this.j.l(heVar);
        } else if (t == k.C) {
            jb<ColorFilter, ColorFilter> jbVar = this.n;
            if (jbVar != null) {
                this.f.p(jbVar);
            }
            if (heVar == null) {
                this.n = null;
                return;
            }
            yb ybVar = new yb(heVar, null);
            this.n = ybVar;
            ybVar.a(this);
            this.f.i(this.n);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void d(d dVar, int i2, List<d> list, d dVar2) {
        de.g(dVar, i2, list, dVar2, this);
    }

    @Override // defpackage.ua
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.b.reset();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            b bVar = this.g.get(i2);
            for (int i3 = 0; i3 < bVar.a.size(); i3++) {
                this.b.addPath(((cb) bVar.a.get(i3)).o(), matrix);
            }
        }
        this.b.computeBounds(this.d, false);
        float m2 = ((lb) this.j).m();
        RectF rectF2 = this.d;
        float f2 = m2 / 2.0f;
        rectF2.set(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2);
        rectF.set(this.d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        c.a("StrokeContent#getBounds");
    }

    @Override // defpackage.ua
    public void g(Canvas canvas, Matrix matrix, int i2) {
        float f2;
        if (ee.e(matrix)) {
            c.a("StrokeContent#draw");
            return;
        }
        float f3 = 100.0f;
        boolean z = false;
        this.i.setAlpha(de.c((int) ((((((float) i2) / 255.0f) * ((float) ((nb) this.k).m())) / 100.0f) * 255.0f), 0, BitmapRenderer.ALPHA_VISIBLE));
        this.i.setStrokeWidth(ee.d(matrix) * ((lb) this.j).m());
        if (this.i.getStrokeWidth() <= 0.0f) {
            c.a("StrokeContent#draw");
            return;
        }
        float f4 = 1.0f;
        if (this.l.isEmpty()) {
            c.a("StrokeContent#applyDashPattern");
        } else {
            float d2 = ee.d(matrix);
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                this.h[i3] = this.l.get(i3).g().floatValue();
                if (i3 % 2 == 0) {
                    float[] fArr = this.h;
                    if (fArr[i3] < 1.0f) {
                        fArr[i3] = 1.0f;
                    }
                } else {
                    float[] fArr2 = this.h;
                    if (fArr2[i3] < 0.1f) {
                        fArr2[i3] = 0.1f;
                    }
                }
                float[] fArr3 = this.h;
                fArr3[i3] = fArr3[i3] * d2;
            }
            jb<?, Float> jbVar = this.m;
            this.i.setPathEffect(new DashPathEffect(this.h, jbVar == null ? 0.0f : jbVar.g().floatValue() * d2));
            c.a("StrokeContent#applyDashPattern");
        }
        jb<ColorFilter, ColorFilter> jbVar2 = this.n;
        if (jbVar2 != null) {
            this.i.setColorFilter(jbVar2.g());
        }
        int i4 = 0;
        while (i4 < this.g.size()) {
            b bVar = this.g.get(i4);
            if (bVar.b == null) {
                this.b.reset();
                for (int size = bVar.a.size() - 1; size >= 0; size--) {
                    this.b.addPath(((cb) bVar.a.get(size)).o(), matrix);
                }
                c.a("StrokeContent#buildPath");
                canvas.drawPath(this.b, this.i);
                c.a("StrokeContent#drawPath");
            } else if (bVar.b == null) {
                c.a("StrokeContent#applyTrimPath");
            } else {
                this.b.reset();
                int size2 = bVar.a.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    }
                    this.b.addPath(((cb) bVar.a.get(size2)).o(), matrix);
                }
                this.a.setPath(this.b, z);
                float length = this.a.getLength();
                while (this.a.nextContour()) {
                    length += this.a.getLength();
                }
                float floatValue = (bVar.b.f().g().floatValue() * length) / 360.0f;
                float floatValue2 = ((bVar.b.h().g().floatValue() * length) / f3) + floatValue;
                float floatValue3 = ((bVar.b.d().g().floatValue() * length) / f3) + floatValue;
                int size3 = bVar.a.size() - 1;
                float f5 = 0.0f;
                while (size3 >= 0) {
                    this.c.set(((cb) bVar.a.get(size3)).o());
                    this.c.transform(matrix);
                    this.a.setPath(this.c, z);
                    float length2 = this.a.getLength();
                    if (floatValue3 > length) {
                        float f6 = floatValue3 - length;
                        if (f6 < f5 + length2 && f5 < f6) {
                            f2 = length;
                            ee.a(this.c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f6 / length2, f4), 0.0f);
                            canvas.drawPath(this.c, this.i);
                            f5 += length2;
                            size3--;
                            length = f2;
                            z = false;
                            f4 = 1.0f;
                        }
                    }
                    f2 = length;
                    float f7 = f5 + length2;
                    if (f7 >= floatValue2 && f5 <= floatValue3) {
                        if (f7 > floatValue3 || floatValue2 >= f5) {
                            ee.a(this.c, floatValue2 < f5 ? 0.0f : (floatValue2 - f5) / length2, floatValue3 > f7 ? 1.0f : (floatValue3 - f5) / length2, 0.0f);
                            canvas.drawPath(this.c, this.i);
                            f5 += length2;
                            size3--;
                            length = f2;
                            z = false;
                            f4 = 1.0f;
                        } else {
                            canvas.drawPath(this.c, this.i);
                        }
                    }
                    f5 += length2;
                    size3--;
                    length = f2;
                    z = false;
                    f4 = 1.0f;
                }
                c.a("StrokeContent#applyTrimPath");
            }
            i4++;
            f3 = 100.0f;
            z = false;
            f4 = 1.0f;
        }
        c.a("StrokeContent#draw");
    }
}
