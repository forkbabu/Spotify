package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: rb  reason: default package */
public class rb extends ob<PointF> {
    private final PointF i = new PointF();
    private final float[] j = new float[2];
    private qb k;
    private PathMeasure l = new PathMeasure();

    public rb(List<? extends fe<PointF>> list) {
        super(list);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.Object] */
    @Override // defpackage.jb
    public Object h(fe feVar, float f) {
        A a;
        qb qbVar = (qb) feVar;
        Path j2 = qbVar.j();
        if (j2 == null) {
            return feVar.b;
        }
        he<A> heVar = this.e;
        if (heVar != null && (a = heVar.a(qbVar.e, qbVar.f.floatValue(), qbVar.b, qbVar.c, e(), f, this.d)) != null) {
            return a;
        }
        if (this.k != qbVar) {
            this.l.setPath(j2, false);
            this.k = qbVar;
        }
        PathMeasure pathMeasure = this.l;
        pathMeasure.getPosTan(pathMeasure.getLength() * f, this.j, null);
        PointF pointF = this.i;
        float[] fArr = this.j;
        pointF.set(fArr[0], fArr[1]);
        return this.i;
    }
}
