package defpackage;

import android.graphics.PointF;
import java.util.List;

/* renamed from: sb  reason: default package */
public class sb extends ob<PointF> {
    private final PointF i = new PointF();

    public sb(List<fe<PointF>> list) {
        super(list);
    }

    @Override // defpackage.jb
    public Object h(fe feVar, float f) {
        T t;
        A a;
        T t2 = feVar.b;
        if (t2 == null || (t = feVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        T t3 = t2;
        T t4 = t;
        he<A> heVar = this.e;
        if (heVar != null && (a = heVar.a(feVar.e, feVar.f.floatValue(), t3, t4, f, e(), this.d)) != null) {
            return a;
        }
        PointF pointF = this.i;
        float f2 = ((PointF) t3).x;
        float a2 = je.a(((PointF) t4).x, f2, f, f2);
        float f3 = ((PointF) t3).y;
        pointF.set(a2, ((((PointF) t4).y - f3) * f) + f3);
        return this.i;
    }
}
