package defpackage;

import io.reactivex.f;
import io.reactivex.h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ll9  reason: default package */
public class ll9 {
    private final Set<f<Object>> a = new HashSet(1);

    public /* synthetic */ void a(h hVar) {
        this.a.remove(hVar);
    }

    public /* synthetic */ void b(h hVar) {
        this.a.add(hVar);
        hVar.e(new al9(this, hVar));
    }

    public void c() {
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            ((f) it.next()).onNext(1);
        }
    }
}
