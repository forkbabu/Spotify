package defpackage;

import io.reactivex.s;
import io.reactivex.subjects.a;

/* renamed from: k4a  reason: default package */
public class k4a implements j4a, m4a {
    private final a<Boolean> a = a.i1(Boolean.FALSE);

    @Override // defpackage.m4a
    public void a(boolean z) {
        this.a.onNext(Boolean.valueOf(z));
    }

    @Override // defpackage.j4a
    public s<Boolean> b() {
        return this.a.E();
    }
}
