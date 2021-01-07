package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.a;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.layer.b;
import defpackage.jb;
import java.util.List;

/* renamed from: va  reason: default package */
public class va implements cb, jb.b, ab {
    private final Path a = new Path();
    private final String b;
    private final f c;
    private final jb<?, PointF> d;
    private final jb<?, PointF> e;
    private final a f;
    private ra g = new ra();
    private boolean h;

    public va(f fVar, b bVar, a aVar) {
        this.b = aVar.b();
        this.c = fVar;
        jb<PointF, PointF> a2 = aVar.d().a();
        this.d = a2;
        jb<PointF, PointF> a3 = aVar.c().a();
        this.e = a3;
        this.f = aVar;
        bVar.i(a2);
        bVar.i(a3);
        a2.a(this);
        a3.a(this);
    }

    @Override // defpackage.jb.b
    public void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.sa
    public void b(List<sa> list, List<sa> list2) {
        for (int i = 0; i < list.size(); i++) {
            sa saVar = list.get(i);
            if (saVar instanceof ib) {
                ib ibVar = (ib) saVar;
                if (ibVar.i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.g.a(ibVar);
                    ibVar.c(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void c(T t, he<T> heVar) {
        if (t == k.g) {
            this.d.l(heVar);
        } else if (t == k.j) {
            this.e.l(heVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void d(d dVar, int i, List<d> list, d dVar2) {
        de.g(dVar, i, list, dVar2, this);
    }

    @Override // defpackage.sa
    public String getName() {
        return this.b;
    }

    @Override // defpackage.cb
    public Path o() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e()) {
            this.h = true;
            return this.a;
        }
        PointF g2 = this.d.g();
        float f2 = g2.x / 2.0f;
        float f3 = g2.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = 0.55228f * f3;
        this.a.reset();
        if (this.f.f()) {
            float f6 = -f3;
            this.a.moveTo(0.0f, f6);
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            this.a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            float f10 = f5 + 0.0f;
            this.a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            float f11 = f4 + 0.0f;
            this.a.cubicTo(f11, f3, f2, f10, f2, 0.0f);
            this.a.cubicTo(f2, f9, f11, f6, 0.0f, f6);
        } else {
            float f12 = -f3;
            this.a.moveTo(0.0f, f12);
            float f13 = f4 + 0.0f;
            float f14 = 0.0f - f5;
            this.a.cubicTo(f13, f12, f2, f14, f2, 0.0f);
            float f15 = f5 + 0.0f;
            this.a.cubicTo(f2, f15, f13, f3, 0.0f, f3);
            float f16 = 0.0f - f4;
            float f17 = -f2;
            this.a.cubicTo(f16, f3, f17, f15, f17, 0.0f);
            this.a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
        }
        PointF g3 = this.e.g();
        this.a.offset(g3.x, g3.y);
        this.a.close();
        this.g.b(this.a);
        this.h = true;
        return this.a;
    }
}
