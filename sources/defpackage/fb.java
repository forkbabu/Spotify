package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.g;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.layer.b;
import defpackage.jb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: fb  reason: default package */
public class fb implements ua, cb, za, jb.b, ab {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final f c;
    private final b d;
    private final String e;
    private final boolean f;
    private final jb<Float, Float> g;
    private final jb<Float, Float> h;
    private final xb i;
    private ta j;

    public fb(f fVar, b bVar, g gVar) {
        this.c = fVar;
        this.d = bVar;
        this.e = gVar.c();
        this.f = gVar.f();
        jb<Float, Float> a2 = gVar.b().a();
        this.g = a2;
        bVar.i(a2);
        a2.a(this);
        jb<Float, Float> a3 = gVar.d().a();
        this.h = a3;
        bVar.i(a3);
        a3.a(this);
        mc e2 = gVar.e();
        e2.getClass();
        xb xbVar = new xb(e2);
        this.i = xbVar;
        xbVar.a(bVar);
        xbVar.b(this);
    }

    @Override // defpackage.jb.b
    public void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.sa
    public void b(List<sa> list, List<sa> list2) {
        this.j.b(list, list2);
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void c(T t, he<T> heVar) {
        if (!this.i.c(t, heVar)) {
            if (t == k.q) {
                this.g.l(heVar);
            } else if (t == k.r) {
                this.h.l(heVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void d(d dVar, int i2, List<d> list, d dVar2) {
        de.g(dVar, i2, list, dVar2, this);
    }

    @Override // defpackage.ua
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.j.e(rectF, matrix, z);
    }

    @Override // defpackage.za
    public void f(ListIterator<sa> listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.j = new ta(this.c, this.d, "Repeater", this.f, arrayList, null);
        }
    }

    @Override // defpackage.ua
    public void g(Canvas canvas, Matrix matrix, int i2) {
        float floatValue = this.g.g().floatValue();
        float floatValue2 = this.h.g().floatValue();
        float floatValue3 = this.i.i().g().floatValue() / 100.0f;
        float floatValue4 = this.i.e().g().floatValue() / 100.0f;
        for (int i3 = ((int) floatValue) - 1; i3 >= 0; i3--) {
            this.a.set(matrix);
            float f2 = (float) i3;
            this.a.preConcat(this.i.g(f2 + floatValue2));
            this.j.g(canvas, this.a, (int) (de.f(floatValue3, floatValue4, f2 / floatValue) * ((float) i2)));
        }
    }

    @Override // defpackage.sa
    public String getName() {
        return this.e;
    }

    @Override // defpackage.cb
    public Path o() {
        Path o = this.j.o();
        this.b.reset();
        float floatValue = this.g.g().floatValue();
        float floatValue2 = this.h.g().floatValue();
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.a.set(this.i.g(((float) i2) + floatValue2));
            this.b.addPath(o, this.a);
        }
        return this.b;
    }
}
