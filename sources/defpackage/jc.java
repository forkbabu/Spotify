package defpackage;

import android.graphics.PointF;
import java.util.List;

/* renamed from: jc  reason: default package */
public class jc implements nc<PointF, PointF> {
    private final cc a;
    private final cc b;

    public jc(cc ccVar, cc ccVar2) {
        this.a = ccVar;
        this.b = ccVar2;
    }

    @Override // defpackage.nc
    public jb<PointF, PointF> a() {
        return new vb(this.a.a(), this.b.a());
    }

    @Override // defpackage.nc
    public List<fe<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.nc
    public boolean c() {
        return this.a.c() && this.b.c();
    }
}
