package defpackage;

import defpackage.y8a;
import io.reactivex.subjects.PublishSubject;

/* renamed from: z8a  reason: default package */
public class z8a implements y8a {
    private final PublishSubject<y8a.a> a = PublishSubject.h1();

    @Override // defpackage.y8a
    public void a(y8a.a aVar) {
        this.a.onNext(aVar);
    }
}
