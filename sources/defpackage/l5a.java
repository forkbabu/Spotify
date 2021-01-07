package defpackage;

import io.reactivex.s;
import io.reactivex.subjects.a;

/* renamed from: l5a  reason: default package */
public class l5a implements k5a, p5a {
    private final a<Boolean> a = a.h1();
    private final a<d7a> b = a.i1(d7a.b());

    @Override // defpackage.k5a
    public void a() {
        this.a.onNext(Boolean.TRUE);
    }

    @Override // defpackage.b6a
    public void b(d7a d7a) {
        this.b.onNext(d7a);
    }

    @Override // defpackage.p5a
    public s<Boolean> c() {
        return this.a;
    }

    @Override // defpackage.k5a
    public void d() {
        this.a.onNext(Boolean.FALSE);
    }

    @Override // defpackage.k5a
    public s<d7a> e() {
        return this.b.E();
    }
}
