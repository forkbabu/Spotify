package defpackage;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Incorrect class signature, class is equals to this class: <T:Ljava/lang/Object;>Lj1e<TT;>; */
/* renamed from: j1e  reason: default package */
public class j1e<T> implements w {
    private final int a;
    private final a1e b;
    private final y c;

    public j1e(int i, int i2, long j, y yVar) {
        z0e z0e = new z0e(i2, j, yVar);
        this.a = i;
        this.b = z0e;
        this.c = yVar;
    }

    @Override // io.reactivex.w
    public v apply(s sVar) {
        return sVar.T0((long) this.a, TimeUnit.SECONDS, this.c).w0(this.b);
    }
}
