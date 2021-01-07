package defpackage;

import com.google.common.base.MoreObjects;
import io.reactivex.internal.operators.maybe.m;
import io.reactivex.l;
import java.util.Map;

/* renamed from: l7b  reason: default package */
public class l7b implements u7b {
    private final qz0 a;
    private final pz0 b;
    private final String c;

    public l7b(qz0 qz0, pz0 pz0, String str) {
        this.a = qz0;
        this.b = pz0;
        this.c = str;
    }

    @Override // defpackage.u7b
    public l<s7b> a(z6b z6b) {
        int i;
        if (MoreObjects.isNullOrEmpty(z6b.g())) {
            return m.a;
        }
        qz0 c2 = this.a.b(z6b.h().a()).c(z6b.d());
        if (z6b.i()) {
            i = 0;
        } else {
            i = z6b.f();
        }
        return c2.d(i, z6b.e()).build().O().l(new i7b(this, z6b));
    }

    public /* synthetic */ s7b b(z6b z6b, Map map) {
        return new t7b(z6b.g(), map, this.b, this.c);
    }
}
