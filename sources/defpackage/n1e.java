package defpackage;

import io.reactivex.d0;
import io.reactivex.e0;
import io.reactivex.z;

/* renamed from: n1e  reason: default package */
public class n1e<T> implements e0<T, T> {
    private final m1e<T> a;

    public n1e(int i, int i2, long j) {
        this.a = new m1e<>(i, i2, j);
    }

    @Override // io.reactivex.e0
    public d0<T> a(z<T> zVar) {
        return zVar.P().q(this.a).B0();
    }

    public n1e() {
        this.a = new m1e<>();
    }
}
