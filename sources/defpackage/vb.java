package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* renamed from: vb  reason: default package */
public class vb extends jb<PointF, PointF> {
    private final PointF i = new PointF();
    private final jb<Float, Float> j;
    private final jb<Float, Float> k;

    public vb(jb<Float, Float> jbVar, jb<Float, Float> jbVar2) {
        super(Collections.emptyList());
        this.j = jbVar;
        this.k = jbVar2;
        k(this.d);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.jb
    public PointF g() {
        return this.i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [fe, float] */
    /* access modifiers changed from: package-private */
    @Override // defpackage.jb
    public PointF h(fe<PointF> feVar, float f) {
        return this.i;
    }

    @Override // defpackage.jb
    public void k(float f) {
        this.j.k(f);
        this.k.k(f);
        this.i.set(this.j.g().floatValue(), this.k.g().floatValue());
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            this.a.get(i2).a();
        }
    }
}
