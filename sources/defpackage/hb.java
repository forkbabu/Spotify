package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.b;

/* renamed from: hb  reason: default package */
public class hb extends qa {
    private final b o;
    private final String p;
    private final boolean q;
    private final jb<Integer, Integer> r;
    private jb<ColorFilter, ColorFilter> s;

    public hb(f fVar, b bVar, ShapeStroke shapeStroke) {
        super(fVar, bVar, shapeStroke.b().d(), shapeStroke.e().d(), shapeStroke.g(), shapeStroke.i(), shapeStroke.j(), shapeStroke.f(), shapeStroke.d());
        this.o = bVar;
        this.p = shapeStroke.h();
        this.q = shapeStroke.k();
        jb<Integer, Integer> a = shapeStroke.c().a();
        this.r = a;
        a.a(this);
        bVar.i(a);
    }

    @Override // defpackage.qa, com.airbnb.lottie.model.e
    public <T> void c(T t, he<T> heVar) {
        super.c(t, heVar);
        if (t == k.b) {
            this.r.l(heVar);
        } else if (t == k.C) {
            jb<ColorFilter, ColorFilter> jbVar = this.s;
            if (jbVar != null) {
                this.o.p(jbVar);
            }
            if (heVar == null) {
                this.s = null;
                return;
            }
            yb ybVar = new yb(heVar, null);
            this.s = ybVar;
            ybVar.a(this);
            this.o.i(this.r);
        }
    }

    @Override // defpackage.qa, defpackage.ua
    public void g(Canvas canvas, Matrix matrix, int i) {
        if (!this.q) {
            this.i.setColor(((kb) this.r).m());
            jb<ColorFilter, ColorFilter> jbVar = this.s;
            if (jbVar != null) {
                this.i.setColorFilter(jbVar.g());
            }
            super.g(canvas, matrix, i);
        }
    }

    @Override // defpackage.sa
    public String getName() {
        return this.p;
    }
}
