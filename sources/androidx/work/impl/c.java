package androidx.work.impl;

import androidx.lifecycle.u;
import androidx.work.impl.utils.futures.a;
import androidx.work.l;

public class c implements l {
    private final u<l.b> c = new u<>();
    private final a<l.b.c> d = a.y();

    public c() {
        a(l.b);
    }

    public void a(l.b bVar) {
        this.c.l(bVar);
        if (bVar instanceof l.b.c) {
            this.d.t((l.b.c) bVar);
        } else if (bVar instanceof l.b.a) {
            this.d.z(((l.b.a) bVar).a());
        }
    }
}
