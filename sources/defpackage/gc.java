package defpackage;

import android.graphics.PointF;
import java.util.List;

/* renamed from: gc  reason: default package */
public class gc extends oc<PointF, PointF> {
    public gc(List<fe<PointF>> list) {
        super((List) list);
    }

    @Override // defpackage.nc
    public jb<PointF, PointF> a() {
        return new sb(this.a);
    }

    @Override // defpackage.nc
    public List b() {
        return this.a;
    }
}
