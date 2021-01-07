package defpackage;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

/* renamed from: yoe  reason: default package */
public class yoe implements da2<ooe> {
    private final PublishSubject<ooe> a = PublishSubject.h1();

    public void a(ooe ooe) {
        this.a.onNext(ooe);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.da2
    public void accept(ooe ooe) {
        this.a.onNext(ooe);
    }

    public s<ooe> b() {
        return this.a;
    }
}
