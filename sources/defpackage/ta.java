package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.e;
import com.airbnb.lottie.model.layer.b;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import defpackage.jb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ta  reason: default package */
public class ta implements ua, cb, jb.b, e {
    private Paint a;
    private RectF b;
    private final Matrix c;
    private final Path d;
    private final RectF e;
    private final String f;
    private final boolean g;
    private final List<sa> h;
    private final f i;
    private List<cb> j;
    private xb k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ta(com.airbnb.lottie.f r8, com.airbnb.lottie.model.layer.b r9, com.airbnb.lottie.model.content.j r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.c()
            boolean r4 = r10.d()
            java.util.List r0 = r10.b()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = 0
        L_0x0017:
            int r6 = r0.size()
            if (r2 >= r6) goto L_0x002f
            java.lang.Object r6 = r0.get(r2)
            com.airbnb.lottie.model.content.b r6 = (com.airbnb.lottie.model.content.b) r6
            sa r6 = r6.a(r8, r9)
            if (r6 == 0) goto L_0x002c
            r5.add(r6)
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0017
        L_0x002f:
            java.util.List r10 = r10.b()
        L_0x0033:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x004a
            java.lang.Object r0 = r10.get(r1)
            com.airbnb.lottie.model.content.b r0 = (com.airbnb.lottie.model.content.b) r0
            boolean r2 = r0 instanceof defpackage.mc
            if (r2 == 0) goto L_0x0047
            mc r0 = (defpackage.mc) r0
            r6 = r0
            goto L_0x004c
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0033
        L_0x004a:
            r10 = 0
            r6 = r10
        L_0x004c:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta.<init>(com.airbnb.lottie.f, com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.content.j):void");
    }

    @Override // defpackage.jb.b
    public void a() {
        this.i.invalidateSelf();
    }

    @Override // defpackage.sa
    public void b(List<sa> list, List<sa> list2) {
        ArrayList arrayList = new ArrayList(this.h.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            sa saVar = this.h.get(size);
            saVar.b(arrayList, this.h.subList(0, size));
            arrayList.add(saVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void c(T t, he<T> heVar) {
        xb xbVar = this.k;
        if (xbVar != null) {
            xbVar.c(t, heVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void d(d dVar, int i2, List<d> list, d dVar2) {
        if (dVar.f(this.f, i2)) {
            if (!"__container".equals(this.f)) {
                dVar2 = dVar2.a(this.f);
                if (dVar.c(this.f, i2)) {
                    list.add(dVar2.h(this));
                }
            }
            if (dVar.g(this.f, i2)) {
                int e2 = dVar.e(this.f, i2) + i2;
                for (int i3 = 0; i3 < this.h.size(); i3++) {
                    sa saVar = this.h.get(i3);
                    if (saVar instanceof e) {
                        ((e) saVar).d(dVar, e2, list, dVar2);
                    }
                }
            }
        }
    }

    @Override // defpackage.ua
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.c.set(matrix);
        xb xbVar = this.k;
        if (xbVar != null) {
            this.c.preConcat(xbVar.f());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            sa saVar = this.h.get(size);
            if (saVar instanceof ua) {
                ((ua) saVar).e(this.e, this.c, z);
                rectF.union(this.e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<cb> f() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                sa saVar = this.h.get(i2);
                if (saVar instanceof cb) {
                    this.j.add((cb) saVar);
                }
            }
        }
        return this.j;
    }

    @Override // defpackage.ua
    public void g(Canvas canvas, Matrix matrix, int i2) {
        boolean z;
        if (!this.g) {
            this.c.set(matrix);
            xb xbVar = this.k;
            if (xbVar != null) {
                this.c.preConcat(xbVar.f());
                i2 = (int) ((((((float) (this.k.h() == null ? 100 : this.k.h().g().intValue())) / 100.0f) * ((float) i2)) / 255.0f) * 255.0f);
            }
            boolean z2 = false;
            if (this.i.z()) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= this.h.size()) {
                        z = false;
                        break;
                    }
                    if ((this.h.get(i3) instanceof ua) && (i4 = i4 + 1) >= 2) {
                        z = true;
                        break;
                    }
                    i3++;
                }
                if (z && i2 != 255) {
                    z2 = true;
                }
            }
            if (z2) {
                this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
                e(this.b, this.c, true);
                this.a.setAlpha(i2);
                ee.g(canvas, this.b, this.a, 31);
            }
            if (z2) {
                i2 = BitmapRenderer.ALPHA_VISIBLE;
            }
            for (int size = this.h.size() - 1; size >= 0; size--) {
                sa saVar = this.h.get(size);
                if (saVar instanceof ua) {
                    ((ua) saVar).g(canvas, this.c, i2);
                }
            }
            if (z2) {
                canvas.restore();
            }
        }
    }

    @Override // defpackage.sa
    public String getName() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public Matrix h() {
        xb xbVar = this.k;
        if (xbVar != null) {
            return xbVar.f();
        }
        this.c.reset();
        return this.c;
    }

    @Override // defpackage.cb
    public Path o() {
        this.c.reset();
        xb xbVar = this.k;
        if (xbVar != null) {
            this.c.set(xbVar.f());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            sa saVar = this.h.get(size);
            if (saVar instanceof cb) {
                this.d.addPath(((cb) saVar).o(), this.c);
            }
        }
        return this.d;
    }

    ta(f fVar, b bVar, String str, boolean z, List<sa> list, mc mcVar) {
        this.a = new pa();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = fVar;
        this.g = z;
        this.h = list;
        if (mcVar != null) {
            xb xbVar = new xb(mcVar);
            this.k = xbVar;
            xbVar.a(bVar);
            this.k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            sa saVar = list.get(size);
            if (saVar instanceof za) {
                arrayList.add((za) saVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((za) arrayList.get(size2)).f(list.listIterator(list.size()));
            } else {
                return;
            }
        }
    }
}
