package defpackage;

import io.reactivex.s;
import io.reactivex.subjects.a;

/* renamed from: m6a  reason: default package */
public class m6a implements l6a, o6a {
    private final a<Boolean> a = a.i1(Boolean.FALSE);

    @Override // defpackage.o6a
    public void a() {
        this.a.onNext(Boolean.TRUE);
    }

    @Override // defpackage.l6a
    public s<Boolean> b() {
        return this.a.E();
    }

    @Override // defpackage.o6a
    public void c() {
        this.a.onNext(Boolean.FALSE);
    }
}
