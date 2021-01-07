package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.util.ArrayList;
import java.util.List;

public class c extends b {
    private final RectF A = new RectF();
    private Paint B = new Paint();
    private jb<Float, Float> x;
    private final List<b> y = new ArrayList();
    private final RectF z = new RectF();

    public c(f fVar, Layer layer, List<Layer> list, d dVar) {
        super(fVar, layer);
        int i;
        b bVar;
        b bVar2;
        cc s = layer.s();
        if (s != null) {
            jb<Float, Float> a = s.a();
            this.x = a;
            i(a);
            this.x.a(this);
        } else {
            this.x = null;
        }
        q1 q1Var = new q1(dVar.j().size());
        int size = list.size() - 1;
        b bVar3 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            int ordinal = layer2.d().ordinal();
            if (ordinal == 0) {
                bVar2 = new c(fVar, layer2, dVar.n(layer2.k()), dVar);
            } else if (ordinal == 1) {
                bVar2 = new g(fVar, layer2);
            } else if (ordinal == 2) {
                bVar2 = new d(fVar, layer2);
            } else if (ordinal == 3) {
                bVar2 = new e(fVar, layer2);
            } else if (ordinal == 4) {
                bVar2 = new f(fVar, layer2);
            } else if (ordinal != 5) {
                StringBuilder V0 = je.V0("Unknown layer type ");
                V0.append(layer2.d());
                ae.c(V0.toString());
                bVar2 = null;
            } else {
                bVar2 = new h(fVar, layer2);
            }
            if (bVar2 != null) {
                q1Var.o(bVar2.o.b(), bVar2);
                if (bVar3 != null) {
                    bVar3.r(bVar2);
                    bVar3 = null;
                } else {
                    this.y.add(0, bVar2);
                    int ordinal2 = layer2.f().ordinal();
                    if (ordinal2 == 1 || ordinal2 == 2) {
                        bVar3 = bVar2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < q1Var.r(); i++) {
            b bVar4 = (b) q1Var.g(q1Var.n(i));
            if (!(bVar4 == null || (bVar = (b) q1Var.g(bVar4.o.h())) == null)) {
                bVar4.s(bVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void c(T t, he<T> heVar) {
        this.v.c(t, heVar);
        if (t != k.A) {
            return;
        }
        if (heVar == null) {
            jb<Float, Float> jbVar = this.x;
            if (jbVar != null) {
                jbVar.l(null);
                return;
            }
            return;
        }
        yb ybVar = new yb(heVar, null);
        this.x = ybVar;
        ybVar.a(this);
        i(this.x);
    }

    @Override // com.airbnb.lottie.model.layer.b, defpackage.ua
    public void e(RectF rectF, Matrix matrix, boolean z2) {
        super.e(rectF, matrix, z2);
        for (int size = this.y.size() - 1; size >= 0; size--) {
            this.z.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.y.get(size).e(this.z, this.m, true);
            rectF.union(this.z);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.model.layer.b
    public void l(Canvas canvas, Matrix matrix, int i) {
        this.A.set(0.0f, 0.0f, (float) this.o.j(), (float) this.o.i());
        matrix.mapRect(this.A);
        boolean z2 = this.n.z() && this.y.size() > 1 && i != 255;
        if (z2) {
            this.B.setAlpha(i);
            ee.g(canvas, this.A, this.B, 31);
        } else {
            canvas.save();
        }
        if (z2) {
            i = BitmapRenderer.ALPHA_VISIBLE;
        }
        for (int size = this.y.size() - 1; size >= 0; size--) {
            if (!this.A.isEmpty() ? canvas.clipRect(this.A) : true) {
                this.y.get(size).g(canvas, matrix, i);
            }
        }
        canvas.restore();
        com.airbnb.lottie.c.a("CompositionLayer#draw");
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.model.layer.b
    public void q(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        for (int i2 = 0; i2 < this.y.size(); i2++) {
            this.y.get(i2).d(dVar, i, list, dVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void t(float f) {
        super.t(f);
        if (this.x != null) {
            f = ((this.o.a().h() * this.x.g().floatValue()) - this.o.a().o()) / (this.n.l().e() + 0.01f);
        }
        if (this.x == null) {
            f -= this.o.p();
        }
        if (this.o.t() != 0.0f) {
            f /= this.o.t();
        }
        for (int size = this.y.size() - 1; size >= 0; size--) {
            this.y.get(size).t(f);
        }
    }
}
