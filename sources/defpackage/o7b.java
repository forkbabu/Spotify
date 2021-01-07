package defpackage;

import com.google.common.base.MoreObjects;
import io.reactivex.internal.operators.maybe.m;
import io.reactivex.l;
import java.util.Map;

/* renamed from: o7b  reason: default package */
public class o7b implements u7b {
    private final qz0 a;
    private final pz0 b;

    public o7b(qz0 qz0, pz0 pz0) {
        this.a = qz0;
        this.b = pz0;
    }

    @Override // defpackage.u7b
    public l<s7b> a(z6b z6b) {
        if (MoreObjects.isNullOrEmpty(z6b.g())) {
            return m.a;
        }
        return this.a.b(z6b.h().a()).c(z6b.d()).d(z6b.f(), z6b.e()).build().O().l(new j7b(this, z6b));
    }

    public /* synthetic */ s7b b(z6b z6b, Map map) {
        return new n7b(z6b.g(), map, this.b);
    }
}
