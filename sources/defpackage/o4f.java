package defpackage;

import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;

/* renamed from: o4f  reason: default package */
public final /* synthetic */ class o4f implements l {
    public final /* synthetic */ int a;

    public /* synthetic */ o4f(int i) {
        this.a = i;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = this.a;
        zwd zwd = (zwd) obj;
        return i == 0 ? s.i0(Integer.valueOf(i)) : s.W0((long) i, TimeUnit.SECONDS);
    }
}
