package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.c;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.i;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.layer.b;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import defpackage.jb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wa  reason: default package */
public class wa implements ua, jb.b, ab {
    private final Path a;
    private final Paint b = new pa(1);
    private final b c;
    private final String d;
    private final boolean e;
    private final List<cb> f = new ArrayList();
    private final jb<Integer, Integer> g;
    private final jb<Integer, Integer> h;
    private jb<ColorFilter, ColorFilter> i;
    private final f j;

    public wa(f fVar, b bVar, i iVar) {
        Path path = new Path();
        this.a = path;
        this.c = bVar;
        this.d = iVar.d();
        this.e = iVar.f();
        this.j = fVar;
        if (iVar.b() == null || iVar.e() == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(iVar.c());
        jb<Integer, Integer> a2 = iVar.b().a();
        this.g = a2;
        a2.a(this);
        bVar.i(a2);
        jb<Integer, Integer> a3 = iVar.e().a();
        this.h = a3;
        a3.a(this);
        bVar.i(a3);
    }

    @Override // defpackage.jb.b
    public void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.sa
    public void b(List<sa> list, List<sa> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            sa saVar = list2.get(i2);
            if (saVar instanceof cb) {
                this.f.add((cb) saVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void c(T t, he<T> heVar) {
        if (t == k.a) {
            this.g.l(heVar);
        } else if (t == k.d) {
            this.h.l(heVar);
        } else if (t == k.C) {
            jb<ColorFilter, ColorFilter> jbVar = this.i;
            if (jbVar != null) {
                this.c.p(jbVar);
            }
            if (heVar == null) {
                this.i = null;
                return;
            }
            yb ybVar = new yb(heVar, null);
            this.i = ybVar;
            ybVar.a(this);
            this.c.i(this.i);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void d(d dVar, int i2, List<d> list, d dVar2) {
        de.g(dVar, i2, list, dVar2, this);
    }

    @Override // defpackage.ua
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.a.addPath(this.f.get(i2).o(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.ua
    public void g(Canvas canvas, Matrix matrix, int i2) {
        if (!this.e) {
            this.b.setColor(((kb) this.g).m());
            this.b.setAlpha(de.c((int) ((((((float) i2) / 255.0f) * ((float) this.h.g().intValue())) / 100.0f) * 255.0f), 0, BitmapRenderer.ALPHA_VISIBLE));
            jb<ColorFilter, ColorFilter> jbVar = this.i;
            if (jbVar != null) {
                this.b.setColorFilter(jbVar.g());
            }
            this.a.reset();
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                this.a.addPath(this.f.get(i3).o(), matrix);
            }
            canvas.drawPath(this.a, this.b);
            c.a("FillContent#draw");
        }
    }

    @Override // defpackage.sa
    public String getName() {
        return this.d;
    }
}
