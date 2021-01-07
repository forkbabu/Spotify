package defpackage;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.concurrent.TimeUnit;

/* renamed from: m1e  reason: default package */
public class m1e<T> implements w<T, T> {
    private final int a;
    private final l1e b;

    public m1e() {
        this.a = 30;
        this.b = new l1e(5, 1000);
    }

    @Override // io.reactivex.w
    public v<T> apply(s<T> sVar) {
        return sVar.R0((long) this.a, TimeUnit.SECONDS).w0(this.b);
    }

    public m1e(int i, int i2, long j) {
        this.a = i;
        this.b = new l1e(i2, j);
    }
}
