package defpackage;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import java.util.HashSet;
import java.util.Set;

/* renamed from: p4a  reason: default package */
public class p4a implements o4a {
    private final Set<String> a = new HashSet(10);
    private final PublishSubject<n4a> b = PublishSubject.h1();

    @Override // defpackage.o4a
    public void a(n4a n4a) {
        if (n4a.e() && !this.a.contains(n4a.d())) {
            this.a.add(n4a.d());
            this.b.onNext(n4a);
        } else if (!n4a.e() && this.a.contains(n4a.d())) {
            this.a.remove(n4a.d());
            this.b.onNext(n4a);
        }
    }

    @Override // defpackage.o4a
    public s<n4a> b() {
        return this.b.E();
    }
}
