package defpackage;

import android.graphics.PointF;
import java.util.List;

/* renamed from: fc  reason: default package */
public class fc implements nc<PointF, PointF> {
    private final List<fe<PointF>> a;

    public fc(List<fe<PointF>> list) {
        this.a = list;
    }

    @Override // defpackage.nc
    public jb<PointF, PointF> a() {
        if (this.a.get(0).h()) {
            return new sb(this.a);
        }
        return new rb(this.a);
    }

    @Override // defpackage.nc
    public List<fe<PointF>> b() {
        return this.a;
    }

    @Override // defpackage.nc
    public boolean c() {
        return this.a.size() == 1 && this.a.get(0).h();
    }
}
