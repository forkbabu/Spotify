package defpackage;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: xr5  reason: default package */
public class xr5 {
    private final y a;
    private final y b;

    public xr5(y yVar, y yVar2) {
        this.a = yVar;
        this.b = yVar2;
    }

    public s<Integer> a() {
        return s.u0(1, 360).w(new yq5(this)).o0(this.b);
    }

    public /* synthetic */ v b(Integer num) {
        return s.i0(num).C(30, TimeUnit.MILLISECONDS, this.a);
    }
}
