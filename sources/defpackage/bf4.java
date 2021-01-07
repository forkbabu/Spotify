package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.z;

/* renamed from: bf4  reason: default package */
public class bf4 {
    private final s<we4> a;
    private final he4 b;

    public bf4(s<we4> sVar, he4 he4) {
        this.a = sVar;
        this.b = he4;
    }

    public static g a(bf4 bf4, we4 we4) {
        return bf4.b.a(new ff4(0, "")).O(new zc4(we4)).O(uc4.a);
    }

    public z<b91> b() {
        return this.a.Y0(BackpressureStrategy.LATEST).F(new yc4(this)).E();
    }
}
