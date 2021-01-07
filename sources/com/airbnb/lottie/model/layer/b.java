package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.airbnb.lottie.c;
import com.airbnb.lottie.f;
import com.airbnb.lottie.model.content.h;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.e;
import com.airbnb.lottie.model.layer.Layer;
import defpackage.jb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class b implements ua, jb.b, e {
    private final Path a = new Path();
    private final Matrix b = new Matrix();
    private final Paint c;
    private final Paint d;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final RectF h;
    private final RectF i;
    private final RectF j;
    private final RectF k;
    private final String l;
    final Matrix m;
    final f n;
    final Layer o;
    private pb p;
    private lb q;
    private b r;
    private b s;
    private List<b> t;
    private final List<jb<?, ?>> u;
    final xb v;
    private boolean w;

    b(f fVar, Layer layer) {
        boolean z = true;
        this.c = new pa(1);
        this.d = new pa(1, PorterDuff.Mode.DST_IN);
        this.e = new pa(1, PorterDuff.Mode.DST_OUT);
        pa paVar = new pa(1);
        this.f = paVar;
        this.g = new pa(PorterDuff.Mode.CLEAR);
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.m = new Matrix();
        this.u = new ArrayList();
        this.w = true;
        this.n = fVar;
        this.o = layer;
        this.l = je.I0(new StringBuilder(), layer.g(), "#draw");
        if (layer.f() == Layer.MatteType.INVERT) {
            paVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            paVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        mc u2 = layer.u();
        u2.getClass();
        xb xbVar = new xb(u2);
        this.v = xbVar;
        xbVar.b(this);
        if (layer.e() != null && !layer.e().isEmpty()) {
            pb pbVar = new pb(layer.e());
            this.p = pbVar;
            for (jb<h, Path> jbVar : pbVar.a()) {
                jbVar.a(this);
            }
            for (jb<Integer, Integer> jbVar2 : this.p.c()) {
                i(jbVar2);
                jbVar2.a(this);
            }
        }
        if (!this.o.c().isEmpty()) {
            lb lbVar = new lb(this.o.c());
            this.q = lbVar;
            lbVar.j();
            this.q.a(new a(this));
            u(((Float) this.q.g()).floatValue() != 1.0f ? false : z);
            i(this.q);
            return;
        }
        u(true);
    }

    static void h(b bVar, boolean z) {
        if (z != bVar.w) {
            bVar.w = z;
            bVar.n.invalidateSelf();
        }
    }

    private void j() {
        if (this.t == null) {
            if (this.s == null) {
                this.t = Collections.emptyList();
                return;
            }
            this.t = new ArrayList();
            for (b bVar = this.s; bVar != null; bVar = bVar.s) {
                this.t.add(bVar);
            }
        }
    }

    private void k(Canvas canvas) {
        RectF rectF = this.h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.g);
        c.a("Layer#clearLayer");
    }

    private void u(boolean z) {
        if (z != this.w) {
            this.w = z;
            this.n.invalidateSelf();
        }
    }

    @Override // defpackage.jb.b
    public void a() {
        this.n.invalidateSelf();
    }

    @Override // defpackage.sa
    public void b(List<sa> list, List<sa> list2) {
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void c(T t2, he<T> heVar) {
        this.v.c(t2, heVar);
    }

    @Override // com.airbnb.lottie.model.e
    public void d(d dVar, int i2, List<d> list, d dVar2) {
        if (dVar.f(getName(), i2)) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.a(getName());
                if (dVar.c(getName(), i2)) {
                    list.add(dVar2.h(this));
                }
            }
            if (dVar.g(getName(), i2)) {
                q(dVar, dVar.e(getName(), i2) + i2, list, dVar2);
            }
        }
    }

    @Override // defpackage.ua
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        j();
        this.m.set(matrix);
        if (z) {
            List<b> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.m.preConcat(this.t.get(size).v.f());
                }
            } else {
                b bVar = this.s;
                if (bVar != null) {
                    this.m.preConcat(bVar.v.f());
                }
            }
        }
        this.m.preConcat(this.v.f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015a  */
    @Override // defpackage.ua
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
        // Method dump skipped, instructions count: 1085
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.b.g(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.sa
    public String getName() {
        return this.o.g();
    }

    public void i(jb<?, ?> jbVar) {
        if (jbVar != null) {
            this.u.add(jbVar);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void l(Canvas canvas, Matrix matrix, int i2);

    /* access modifiers changed from: package-private */
    public boolean m() {
        pb pbVar = this.p;
        return pbVar != null && !pbVar.a().isEmpty();
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.r != null;
    }

    public void p(jb<?, ?> jbVar) {
        this.u.remove(jbVar);
    }

    /* access modifiers changed from: package-private */
    public void q(d dVar, int i2, List<d> list, d dVar2) {
    }

    /* access modifiers changed from: package-private */
    public void r(b bVar) {
        this.r = bVar;
    }

    /* access modifiers changed from: package-private */
    public void s(b bVar) {
        this.s = bVar;
    }

    /* access modifiers changed from: package-private */
    public void t(float f2) {
        this.v.j(f2);
        if (this.p != null) {
            for (int i2 = 0; i2 < this.p.a().size(); i2++) {
                this.p.a().get(i2).k(f2);
            }
        }
        if (this.o.t() != 0.0f) {
            f2 /= this.o.t();
        }
        lb lbVar = this.q;
        if (lbVar != null) {
            lbVar.k(f2 / this.o.t());
        }
        b bVar = this.r;
        if (bVar != null) {
            this.r.t(bVar.o.t() * f2);
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            this.u.get(i3).k(f2);
        }
    }
}
