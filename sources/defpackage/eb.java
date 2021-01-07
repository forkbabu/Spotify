package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.layer.b;
import defpackage.jb;
import java.util.List;

/* renamed from: eb  reason: default package */
public class eb implements jb.b, ab, cb {
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final String c;
    private final boolean d;
    private final f e;
    private final jb<?, PointF> f;
    private final jb<?, PointF> g;
    private final jb<?, Float> h;
    private ra i = new ra();
    private boolean j;

    public eb(f fVar, b bVar, com.airbnb.lottie.model.content.f fVar2) {
        this.c = fVar2.c();
        this.d = fVar2.f();
        this.e = fVar;
        jb<PointF, PointF> a2 = fVar2.d().a();
        this.f = a2;
        jb<PointF, PointF> a3 = fVar2.e().a();
        this.g = a3;
        jb<Float, Float> a4 = fVar2.b().a();
        this.h = a4;
        bVar.i(a2);
        bVar.i(a3);
        bVar.i(a4);
        a2.a(this);
        a3.a(this);
        a4.a(this);
    }

    @Override // defpackage.jb.b
    public void a() {
        this.j = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.sa
    public void b(List<sa> list, List<sa> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            sa saVar = list.get(i2);
            if (saVar instanceof ib) {
                ib ibVar = (ib) saVar;
                if (ibVar.i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.i.a(ibVar);
                    ibVar.c(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void c(T t, he<T> heVar) {
        if (t == k.h) {
            this.g.l(heVar);
        } else if (t == k.j) {
            this.f.l(heVar);
        } else if (t == k.i) {
            this.h.l(heVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void d(d dVar, int i2, List<d> list, d dVar2) {
        de.g(dVar, i2, list, dVar2, this);
    }

    @Override // defpackage.sa
    public String getName() {
        return this.c;
    }

    @Override // defpackage.cb
    public Path o() {
        float f2;
        if (this.j) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.j = true;
            return this.a;
        }
        PointF g2 = this.g.g();
        float f3 = g2.x / 2.0f;
        float f4 = g2.y / 2.0f;
        jb<?, Float> jbVar = this.h;
        if (jbVar == null) {
            f2 = 0.0f;
        } else {
            f2 = ((lb) jbVar).m();
        }
        float min = Math.min(f3, f4);
        if (f2 > min) {
            f2 = min;
        }
        PointF g3 = this.f.g();
        this.a.moveTo(g3.x + f3, (g3.y - f4) + f2);
        this.a.lineTo(g3.x + f3, (g3.y + f4) - f2);
        if (f2 > 0.0f) {
            RectF rectF = this.b;
            float f5 = g3.x;
            float f6 = f2 * 2.0f;
            float f7 = g3.y;
            rectF.set((f5 + f3) - f6, (f7 + f4) - f6, f5 + f3, f7 + f4);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((g3.x - f3) + f2, g3.y + f4);
        if (f2 > 0.0f) {
            RectF rectF2 = this.b;
            float f8 = g3.x;
            float f9 = g3.y;
            float f10 = f2 * 2.0f;
            rectF2.set(f8 - f3, (f9 + f4) - f10, (f8 - f3) + f10, f9 + f4);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(g3.x - f3, (g3.y - f4) + f2);
        if (f2 > 0.0f) {
            RectF rectF3 = this.b;
            float f11 = g3.x;
            float f12 = g3.y;
            float f13 = f2 * 2.0f;
            rectF3.set(f11 - f3, f12 - f4, (f11 - f3) + f13, (f12 - f4) + f13);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((g3.x + f3) - f2, g3.y - f4);
        if (f2 > 0.0f) {
            RectF rectF4 = this.b;
            float f14 = g3.x;
            float f15 = f2 * 2.0f;
            float f16 = g3.y;
            rectF4.set((f14 + f3) - f15, f16 - f4, f14 + f3, (f16 - f4) + f15);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.b(this.a);
        this.j = true;
        return this.a;
    }
}
