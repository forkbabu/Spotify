package defpackage;

import io.reactivex.s;
import io.reactivex.subjects.ReplaySubject;

/* renamed from: bv9  reason: default package */
public class bv9 implements av9 {
    private final ReplaySubject<Boolean> a;
    private final ReplaySubject<Boolean> b;
    private final ReplaySubject<Boolean> c;

    public bv9() {
        ReplaySubject<Boolean> h1 = ReplaySubject.h1(1);
        this.a = h1;
        Boolean bool = Boolean.FALSE;
        h1.onNext(bool);
        ReplaySubject<Boolean> h12 = ReplaySubject.h1(1);
        this.b = h12;
        h12.onNext(bool);
        ReplaySubject<Boolean> h13 = ReplaySubject.h1(1);
        this.c = h13;
        h13.onNext(bool);
    }

    @Override // defpackage.av9
    public s<Boolean> a() {
        return this.c;
    }

    @Override // defpackage.av9
    public s<Boolean> b() {
        return this.a;
    }

    @Override // defpackage.av9
    public s<Boolean> c() {
        return this.b;
    }
}
