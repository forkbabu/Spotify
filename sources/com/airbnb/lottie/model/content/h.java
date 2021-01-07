package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.model.a;
import java.util.ArrayList;
import java.util.List;

public class h {
    private final List<a> a;
    private PointF b;
    private boolean c;

    public h(PointF pointF, boolean z, List<a> list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public List<a> a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(h hVar, h hVar2, float f) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.c = hVar.c || hVar2.c;
        if (hVar.a.size() != hVar2.a.size()) {
            StringBuilder V0 = je.V0("Curves must have the same number of control points. Shape 1: ");
            V0.append(hVar.a.size());
            V0.append("\tShape 2: ");
            V0.append(hVar2.a.size());
            ae.c(V0.toString());
        }
        int min = Math.min(hVar.a.size(), hVar2.a.size());
        if (this.a.size() < min) {
            for (int size = this.a.size(); size < min; size++) {
                this.a.add(new a());
            }
        } else if (this.a.size() > min) {
            for (int size2 = this.a.size() - 1; size2 >= min; size2--) {
                List<a> list = this.a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = hVar.b;
        PointF pointF2 = hVar2.b;
        float f2 = de.f(pointF.x, pointF2.x, f);
        float f3 = de.f(pointF.y, pointF2.y, f);
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f2, f3);
        for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
            a aVar = hVar.a.get(size3);
            a aVar2 = hVar2.a.get(size3);
            PointF a2 = aVar.a();
            PointF b2 = aVar.b();
            PointF c2 = aVar.c();
            PointF a3 = aVar2.a();
            PointF b3 = aVar2.b();
            PointF c3 = aVar2.c();
            this.a.get(size3).d(de.f(a2.x, a3.x, f), de.f(a2.y, a3.y, f));
            this.a.get(size3).e(de.f(b2.x, b3.x, f), de.f(b2.y, b3.y, f));
            this.a.get(size3).f(de.f(c2.x, c3.x, f), de.f(c2.y, c3.y, f));
        }
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShapeData{numCurves=");
        V0.append(this.a.size());
        V0.append("closed=");
        return je.O0(V0, this.c, '}');
    }

    public h() {
        this.a = new ArrayList();
    }
}
