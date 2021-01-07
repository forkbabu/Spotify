package defpackage;

import io.reactivex.d0;
import io.reactivex.e0;
import io.reactivex.s;
import io.reactivex.z;

/* renamed from: pj1  reason: default package */
public class pj1<T> implements e0<T, u3<T, String>> {
    private final s<String> a;

    public pj1(s<String> sVar) {
        this.a = sVar.v0(1).h1();
    }

    @Override // io.reactivex.e0
    public d0<u3<T, String>> a(z<T> zVar) {
        return z.R(zVar, this.a.R(""), gj1.a);
    }
}
